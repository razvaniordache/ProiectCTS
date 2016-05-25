package application;

public class Main {

	public static void main(String[] args) throws ExceptieLipsaCurent {
		
		Casa a=Casa.getCasa("Razvan");
		Casa b=Casa.getCasa("Razvan");
		
		
		
		System.out.println("Test Singleton HashCode obiect a: "+a.hashCode()+ " HashCode obiect b: "+b.hashCode());
		
		
		try {
			System.out.println("Test Factory");
			CameraNormala Dormitor=(CameraNormala)a.CreateIncapere(TipIncapere.CAMERANORMALA, "Dormitor", "24.6");
			CameraNormala CameraCopil=(CameraNormala)a.CreateIncapere(TipIncapere.CAMERANORMALA, "Camera Copil", "16.4");
			Baie Toaleta=(Baie)a.CreateIncapere(TipIncapere.BAIE,"Toaleta Principala", "12.5");
			Bucatarie Bucatarie=(Bucatarie)a.CreateIncapere(TipIncapere.BUCATARIE, "Bucatarie ", "24");
			System.out.println(Dormitor.getInfo());
			System.out.println(Toaleta.getInfo());
			System.out.println(Bucatarie.getInfo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Test Builder");
			CameraNormala cameraOaspeti= new BuilderCamera("Camera Oaspeti", "16.9 ").AprindeLumina().build();
			cameraOaspeti.PornesteAC(32);
			System.out.println(cameraOaspeti.getInfo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
	}

}
