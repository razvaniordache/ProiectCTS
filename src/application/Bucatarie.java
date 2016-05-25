package application;

import java.util.Random;

public class Bucatarie extends IncapereInteligenta{

	private boolean pornesteHota;
	
	

	public Bucatarie(String nume, String metripatrati, int temperatura, boolean sursaGaze, boolean sursaApa,
			boolean luminaAprinsa, boolean usaDeschisa, boolean pornesteHota) throws ExceptieLipsaCurent {
		super(nume, metripatrati, temperatura, sursaGaze, sursaApa, luminaAprinsa, usaDeschisa);
		
		Random rand = new Random();
		int  n = rand.nextInt(50);
		if (n==30)
		{
			this.pornesteHota=false;
			throw new ExceptieLipsaCurent("Lipsa Curent");
		}
		else
		{
			this.pornesteHota = pornesteHota;
		}
	}

	@Override
	public void DeschideLumina(Incapere camera) throws ExceptieLipsaCurent, Exception {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Bucatarie= (IncapereInteligenta)camera;
			Random rand = new Random();
			int  n = rand.nextInt(50);
			if (n==30)
			{
				throw new ExceptieLipsaCurent("Lipsa Curent "+Bucatarie.getNume());
			}
			else
			{
				Bucatarie.setLuminaAprinsa(true);
			}
			
		}
		else throw new Exception("Is not instance of IncapereInteligenata");
		
	}

	@Override
	public void InchideLumina(Incapere camera) throws Exception {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Bucatarie= (IncapereInteligenta)camera;
			Bucatarie.setLuminaAprinsa(false);
		}
		else throw new Exception("Is not instance of IncapereInteligenata");
		
	}

	@Override
	public void PornesteAC(Incapere camera, int grade) throws ExceptieLipsaCurent, Exception {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Bucatarie= (IncapereInteligenta)camera;
			if( grade>15 && grade < 35 )
			{
				Bucatarie.setTemperatura(grade);
			}
			else throw new Exception("Temperatura trebuie sa fie intre 15 si 35 grade C");
			
		}
		else throw new Exception("Is not instance of IncapereInteligenata");
		
	}

	@Override
	public void InchideAC(Incapere camera) {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Bucatarie= (IncapereInteligenta)camera;
			System.out.println("AC Inchis in "+Bucatarie.getNume());
		}
		
	}

	@Override
	public void StareUsa(Incapere camera, boolean stare) {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Baie= (IncapereInteligenta)camera;
			Baie.setUsaDeschisa(stare);
			if(true)
				System.out.println("Usa de la "+Baie.getNume()+" este inchisa");
			else
				System.out.println("Usa de la "+Baie.getNume()+" este deschisa");
		}
		
	}

	@Override
	public String getInfo(Incapere camera) {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Bucatarie= (IncapereInteligenta)camera;
			return "Bucataria "+ Bucatarie.getNume()+" cu o suprafata de "
					+Bucatarie.getMetripatrati()+" are o temperatura de "
					+Bucatarie.getTemperatura()+" grade Celsius iar sursa de apa este "+Bucatarie.isSursaApa()
					+", sursa de gaze este "+Bucatarie.isSursaGaze();
		}
		else return null;
	}

}
