package application;

import java.util.Random;

public class CameraNormala extends IncapereInteligenta{
	
	
	
	public CameraNormala(String nume, String metripatrati, boolean areGeam, boolean sursaGaze, boolean sursaApa,
			boolean luminaAprinsa) {
		super(nume, metripatrati, areGeam, sursaGaze, sursaApa, luminaAprinsa);
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
	public void PornesteAC(Incapere camera, int grade) throws ExceptieLipsaCurent {
		// TODO Auto-generated methodS stub
		
	}

	@Override
	public void InchideAC(Incapere camera) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StareUsa(Incapere camera, boolean inchideUsa) {
		// TODO Auto-generated method stub
		
	}

}
