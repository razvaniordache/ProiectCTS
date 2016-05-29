package Testing;

import java.io.File;
import java.util.Scanner;

import application.Baie;
import application.Bucatarie;
import application.CameraNormala;
import application.Casa;
import application.TipIncapere;
import junit.framework.TestCase;


public class TestFactoryObjects extends TestCase {

	Casa a;
	Casa b;
	CameraNormala Dormitor;
	CameraNormala CameraCopil;
	Baie Toaleta;
	Bucatarie Bucatarie;
	int [] numbers;
	
	protected void setUp() throws Exception {
		super.setUp();
		a=Casa.getCasa("Razvan");
		b=Casa.getCasa("Razvan");
		
		Dormitor=(CameraNormala)a.CreateIncapere(TipIncapere.CAMERANORMALA, "Dormitor", "24.6");
		CameraCopil=(CameraNormala)a.CreateIncapere(TipIncapere.CAMERANORMALA, "Camera Copil", "16.4");
		Toaleta=(Baie)a.CreateIncapere(TipIncapere.BAIE,"Toaleta Principala", "12.5");
		Bucatarie=(Bucatarie)a.CreateIncapere(TipIncapere.BUCATARIE, "Bucatarie ", "24");
		
		Scanner scanner = new Scanner(new File("C:\\Users\\Razvan\\workspace\\ProiectCTS\\src\\Testing\\FactoryData.txt"));
		numbers= new int [100];
		int i = 0;
		while(scanner.hasNextInt()){
		   numbers[i++] = scanner.nextInt();
		}
		
	}
	
	public void testSingleton()
	{
		
		assertEquals(a.hashCode(),b.hashCode());
		
	}
	
	public void testareSingletonCuNull()
	{
		String nume= null;
		try{
			
			Casa c=Casa.getCasa(nume);
			fail();
		}
		catch(Exception e)
		{
			System.out.println("Singleton trateaza null");
		}
	}
	
	public void testSetariObiecte()
	{
		Dormitor.setUsaDeschisa(true);
		assertEquals(true, Dormitor.isUsaDeschisa());
		
		//Testam setari temperatura
		for( int i=0; i<numbers.length; i++ )
		{
			//Temperatura acceptata intre 5-60 Grade
			Dormitor.setTemperatura(numbers[i]);
			assertEquals(numbers[i], Dormitor.getTemperatura());
			
			Toaleta.setTemperatura(numbers[i]);
			assertEquals(numbers[i], Toaleta.getTemperatura());
			
			Bucatarie.setTemperatura(numbers[i]);
			assertEquals(numbers[i], Bucatarie.getTemperatura());
		}
		
		Bucatarie.setSursaApa(false);
		assertEquals(false,Bucatarie.isSursaApa());
		
		
	}
	
	public void testMedodeIncapereInteligenta()
	{
		for( int i=0; i<numbers.length; i++ )
		{
			try {
				
				Dormitor.PornesteAC(numbers[i]);
				System.out.println("Acceptam valoarea "+numbers[i]+" pentru Porneste AC ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//System.out.println("Nu este acceptata valoarea "+numbers[i]);
				
			}
			
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
