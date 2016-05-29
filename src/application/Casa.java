package application;

public class Casa {
	
	final String denumire;
	private static int nrIncaperi=0;
	
	private static Casa singleton=null;

	private Casa(String denumire) {
		super();
		this.denumire = denumire;
	}
	
	public static Casa getCasa(String Denumire)
	{
		if(singleton == null && Denumire != null)
		{
			singleton=new Casa(Denumire);
		}
		else if( Denumire == null)
		{
			throw new NullPointerException("Denumirea nu poate fii nula");
		}
		
		return singleton;
		
	}

	public IncapereInteligenta CreateIncapere(TipIncapere tip, String Nume, String mp) throws Exception
	{
		switch(tip)
		{
		case BAIE:
			return new Baie(Nume, mp, 20, false, true, false, true, false);
		case BUCATARIE:
			return new Bucatarie(Nume,mp,24,true,true,false,true,false);
		case CAMERANORMALA: 
			return new CameraNormala(Nume,mp,24,true,true,false,true);
			default: throw new Exception();
		}
	}
	
	

}
