package Testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Alarm.AlertaTemperatura;
import Alarm.SistemDePrevenireAIncendiilor;
import Alarm.StareTemperatura;
import application.Baie;
import application.Bucatarie;
import application.CameraNormala;
import application.Casa;
import application.IncapereInteligenta;
import application.TipIncapere;
import junit.framework.TestCase;

public class TestSistemAntiIncendiu extends TestCase {

	SistemDePrevenireAIncendiilor sistemAntiIncendiu;
	CameraNormala Dormitor;
	int [] numbers;
	protected void setUp() throws Exception {
		super.setUp();
		
		Casa a=Casa.getCasa("Razvan");
		sistemAntiIncendiu= new SistemDePrevenireAIncendiilor(new AlertaTemperatura());
		Dormitor=(CameraNormala)a.CreateIncapere(TipIncapere.CAMERANORMALA, "Dormitor", "24.6");
		
	}
	
	public void testChain()
	{
		try {
			Dormitor.PornesteAC(21);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dormitor.setTemperatura(0);
		System.out.println(Dormitor.getTemperatura());
		
		Scanner scanner;
		try {
			scanner = new Scanner(new File("C:\\Users\\Razvan\\workspace\\ProiectCTS\\src\\Testing\\FactoryData.txt"));
			numbers= new int [100];
			int i = 0;
			while(scanner.hasNextInt()){
			   numbers[i++] = scanner.nextInt();
			}
		}
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for( int x=0; x<numbers.length; x++ )
		{
			Dormitor.setTemperatura(numbers[x]);
		
		if(Dormitor.getTemperatura()>60 && Dormitor.getTemperatura()<5)
			fail();
		}
		System.out.println(Dormitor.getTemperatura());
		StareTemperatura newStare= new StareTemperatura(Dormitor.getTemperatura());
		sistemAntiIncendiu.procesare(newStare);
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
