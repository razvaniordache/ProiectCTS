package application;

import java.util.Random;

public class CameraNormala extends IncapereInteligenta{
	

	public CameraNormala(String nume, String metripatrati, int temperatura, boolean sursaGaze, boolean sursaApa,
			boolean luminaAprinsa, boolean usaDeschisa) {
		super(nume, metripatrati, temperatura, sursaGaze, sursaApa, luminaAprinsa, usaDeschisa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DeschideLumina(Incapere camera) throws Exception {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta CameraNormala= (IncapereInteligenta)camera;
			Random rand = new Random();
			int  n = rand.nextInt(50);
			if (n==30)
			{
				throw new ExceptieLipsaCurent("Lipsa Curent "+CameraNormala.getNume());
			}
			else
			{
				CameraNormala.setLuminaAprinsa(true);
			}
			
		}
		else throw new Exception("Is not instance of IncapereInteligenata");
		
	}

	@Override
	public void InchideLumina(Incapere camera) throws Exception {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta CameraNormala= (IncapereInteligenta)camera;
			CameraNormala.setLuminaAprinsa(false);
		}
		else throw new Exception("Is not instance of IncapereInteligenata");
	}

	@Override
	public void PornesteAC(Incapere camera, int grade) throws Exception {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta CameraNormala= (IncapereInteligenta)camera;
			if( grade>15 && grade < 35 )
			{
				CameraNormala.setTemperatura(grade);
			}
			else throw new Exception("Temperatura trebuie sa fie intre 15 si 35 grade C");
			
		}
		else throw new Exception("Is not instance of IncapereInteligenata");
			
	}

	@Override
	public void InchideAC(Incapere camera) {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta CameraNormala= (IncapereInteligenta)camera;
			System.out.println("AC Inchis in "+CameraNormala.getNume());
		}
		
		
	}

	@Override
	public void StareUsa(Incapere camera, boolean stare) {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta CameraNormala= (IncapereInteligenta)camera;
			CameraNormala.setUsaDeschisa(stare);
			if(true)
				System.out.println("Usa de la "+CameraNormala.getNume()+" este inchisa");
			else
				System.out.println("Usa de la "+CameraNormala.getNume()+" este deschisa");
		}
		
	}

	@Override
	public String getInfo(Incapere camera) {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta CameraNormala= (IncapereInteligenta)camera;
			return "Camera "+ CameraNormala.getNume()+" cu o suprafata de "
					+CameraNormala.getMetripatrati()+" are o temperatura de "
					+CameraNormala.getTemperatura()+" grade Celsius";
		}
		else return null;
	}

}
