package application;

import java.util.Random;

public class Baie extends IncapereInteligenta {

	private boolean pornesteDus;
	

	public Baie(String nume, String metripatrati, int temperatura, boolean sursaGaze, boolean sursaApa,
			boolean luminaAprinsa, boolean usaDeschisa, boolean pornesteDus) throws Exception {
		super(nume, metripatrati, temperatura, sursaGaze, sursaApa, luminaAprinsa, usaDeschisa);
		
		this.pornesteDus = pornesteDus;
		if(sursaApa==false && pornesteDus==true)
		{
			throw new Exception("Nu poate fi pornit dusul, Lipsa Apa");
		}
		
	}

	@Override
	public void DeschideLumina(Incapere camera) throws ExceptieLipsaCurent, Exception {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Baie= (IncapereInteligenta)camera;
			Random rand = new Random();
			int  n = rand.nextInt(50);
			if (n==30)
			{
				throw new ExceptieLipsaCurent("Lipsa Curent "+Baie.getNume());
			}
			else
			{
				Baie.setLuminaAprinsa(true);
			}
			
		}
		else throw new Exception("Is not instance of IncapereInteligenata");
		
	}

	@Override
	public void InchideLumina(Incapere camera) throws Exception {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Baie= (IncapereInteligenta)camera;
			Baie.setLuminaAprinsa(false);
		}
		else throw new Exception("Is not instance of IncapereInteligenata");
		
	}

	@Override
	public void PornesteAC(Incapere camera, int grade) throws ExceptieLipsaCurent, Exception {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Baie= (IncapereInteligenta)camera;
			if( grade>15 && grade < 35 )
			{
				Baie.setTemperatura(grade);
			}
			else throw new Exception("Temperatura trebuie sa fie intre 15 si 35 grade C");
			
		}
		else throw new Exception("Is not instance of IncapereInteligenata");
		
	}

	@Override
	public void InchideAC(Incapere camera) {
		if(camera instanceof IncapereInteligenta)
		{
			IncapereInteligenta Baie= (IncapereInteligenta)camera;
			System.out.println("AC Inchis in "+Baie.getNume());
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
			IncapereInteligenta Baie= (IncapereInteligenta)camera;
			return "Baia "+ Baie.getNume()+" cu o suprafata de "
					+Baie.getMetripatrati()+" are o temperatura de "
					+Baie.getTemperatura()+" grade Celsius iar sursa de apa este "+Baie.isSursaApa();
		}
		else return null;
	}
	

}
