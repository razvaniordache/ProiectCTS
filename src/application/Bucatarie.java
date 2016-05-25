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
	public void DeschideLumina() throws ExceptieLipsaCurent {

			Random rand = new Random();
			int  n = rand.nextInt(50);
			if (n==30)
			{
				throw new ExceptieLipsaCurent("Lipsa Curent "+this.getNume());
			}
			else
			{
				this.setLuminaAprinsa(true);
			}
		
	}

	@Override
	public void InchideLumina() 
	{
			System.out.println("Lumina stinasa in "+this.getNume());
			this.setLuminaAprinsa(false);
		
	}

	@Override
	public void PornesteAC(int grade) throws Exception {

			if( grade>15 && grade < 35 )
			{
				this.setTemperatura(grade);
			}
			else throw new Exception("Temperatura trebuie sa fie intre 15 si 35 grade C");

		
	}

	@Override
	public void InchideAC() {
		
			System.out.println("AC Inchis in "+this.getNume());
	}

	@Override
	public void StareUsa(boolean stare) {

			this.setUsaDeschisa(stare);
			if(true)
				System.out.println("Usa de la "+this.getNume()+" este inchisa");
			else
				System.out.println("Usa de la "+this.getNume()+" este deschisa");
	
	}

	@Override
	public String getInfo() {
		
		
			return "Bucataria "+ this.getNume()+" cu o suprafata de "
					+this.getMetripatrati()+" are o temperatura de "
					+this.getTemperatura()+" grade Celsius iar sursa de apa este "+this.isSursaApa()
					+", sursa de gaze este "+this.isSursaGaze();
		
	}

}
