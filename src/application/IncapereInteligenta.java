package application;

public abstract class IncapereInteligenta extends Incapere {
	
	private String Nume;
	private String metripatrati;
	private int temperatura;
	private boolean SursaGaze;
	private boolean SursaApa;
	private boolean LuminaAprinsa;
	private boolean UsaDeschisa;


	public IncapereInteligenta(String nume, String metripatrati, int temperatura, boolean sursaGaze, boolean sursaApa,
			boolean luminaAprinsa, boolean usaDeschisa) {
		super();
		Nume = nume;
		this.metripatrati = metripatrati;
		this.temperatura = temperatura;
		SursaGaze = sursaGaze;
		SursaApa = sursaApa;
		LuminaAprinsa = luminaAprinsa;
		UsaDeschisa = usaDeschisa;
	}




	@Override
	public String toString() {
		return "IncapereInteligenta [Nume=" + Nume + ", metripatrati=" + metripatrati + ", temperatura=" + temperatura
				+ ", SursaGaze=" + SursaGaze + ", SursaApa=" + SursaApa + ", LuminaAprinsa=" + LuminaAprinsa + "]";
	}




	public String getNume() {
		return Nume;
	}


	public void setNume(String nume) {
		Nume = nume;
	}


	public String getMetripatrati() {
		return metripatrati;
	}


	public void setMetripatrati(String metripatrati) {
		if(metripatrati != null)
			this.metripatrati = metripatrati;
	}





	public int getTemperatura() {
		return temperatura;
	}




	public void setTemperatura(int temperatura) {
		if(temperatura>5 && temperatura<50)
			this.temperatura = temperatura;
	}




	public boolean isSursaGaze() {
		return SursaGaze;
	}


	public void setSursaGaze(boolean sursaGaze) {
		SursaGaze = sursaGaze;
	}


	public boolean isSursaApa() {
		return SursaApa;
	}


	public void setSursaApa(boolean sursaApa) {
		SursaApa = sursaApa;
	}


	public boolean isLuminaAprinsa() {
		return LuminaAprinsa;
	}


	public void setLuminaAprinsa(boolean luminaAprinsa) {
		LuminaAprinsa = luminaAprinsa;
	}




	public boolean isUsaDeschisa() {
		return UsaDeschisa;
	}




	public void setUsaDeschisa(boolean usaDeschisa) {
		UsaDeschisa = usaDeschisa;
	}

	

	

}
