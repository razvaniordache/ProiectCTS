package application;

import java.util.Random;

public class CameraNormala extends IncapereInteligenta{
	

	public CameraNormala(String nume, String metripatrati, int temperatura, boolean sursaGaze, boolean sursaApa,
			boolean luminaAprinsa, boolean usaDeschisa) {
		super(nume, metripatrati, temperatura, sursaGaze, sursaApa, luminaAprinsa, usaDeschisa);
		// TODO Auto-generated constructor stub
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
	public void InchideLumina() {

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
	
			return "Camera "+ this.getNume()+" cu o suprafata de "
					+this.getMetripatrati()+" are o temperatura de "
					+this.getTemperatura()+" grade Celsius";
	}

}
