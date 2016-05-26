package application;

import java.util.ArrayList;
import java.util.List;

import Alarm.AlertaTemperatura;
import Alarm.SistemDePrevenireAIncendiilor;
import Alarm.StareTemperatura;
import samsung.InterfataSamsung;
import samsung.SenzorApaSamsung;

public class Main {

	public static void main(String[] args) {
		
		List<IncapereInteligenta> Camere=new ArrayList<IncapereInteligenta>();
		
		//Test Singleton
		Casa a=Casa.getCasa("Razvan");
		Casa b=Casa.getCasa("Razvan");
		
		System.out.println("Test Singleton HashCode obiect a: "+a.hashCode()+ " HashCode obiect b: "+b.hashCode());
		
		//Test Factory
		try {
			System.out.println("Test Factory");
			CameraNormala Dormitor=(CameraNormala)a.CreateIncapere(TipIncapere.CAMERANORMALA, "Dormitor", "24.6");
			CameraNormala CameraCopil=(CameraNormala)a.CreateIncapere(TipIncapere.CAMERANORMALA, "Camera Copil", "16.4");
			Baie Toaleta=(Baie)a.CreateIncapere(TipIncapere.BAIE,"Toaleta Principala", "12.5");
			Bucatarie Bucatarie=(Bucatarie)a.CreateIncapere(TipIncapere.BUCATARIE, "Bucatarie ", "24");
			//Pentru Chain of Responsability
			Dormitor.setTemperatura(37);
			System.out.println(Dormitor.getInfo());
			System.out.println(Toaleta.getInfo());
			System.out.println(Bucatarie.getInfo());
			
			//Populam lista de camere pt Facade
			Camere.add(Dormitor);
			Camere.add(CameraCopil);
			Camere.add(Toaleta);
			Camere.add(Bucatarie);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test Builder
		try {
			System.out.println("Test Builder");
			CameraNormala cameraOaspeti= new BuilderCamera("Camera Oaspeti", "16.9 ").AprindeLumina().build();
			cameraOaspeti.PornesteAC(32);
			System.out.println(cameraOaspeti.getInfo());
			
			Camere.add(cameraOaspeti);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test Adaptor & Proxy
		InterfataSamsung SenzorApa=new SenzorApaSamsung();
		AdaptorSamsungToLG adaptor= new AdaptorSamsungToLG(SenzorApa);
		
		try {
			System.out.println("Test Proxy & Adaptor");
			System.out.println("Cost total Apa: "+adaptor.getCost("192.168.0.2",4.3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test Facade
		
		FacadeCasaInteligenta facade=new FacadeCasaInteligenta();
		System.out.println(facade.status(Camere));
		
		//Test Chain of Responsability 
		
		SistemDePrevenireAIncendiilor sistemAntiIncendiu= new SistemDePrevenireAIncendiilor(new AlertaTemperatura());
		
		for(int i=0;i<Camere.size();i++)
		{
			StareTemperatura newStare= new StareTemperatura(Camere.get(i).getTemperatura());
			sistemAntiIncendiu.procesare(newStare);
		}
		
		

		
		
	}

}
