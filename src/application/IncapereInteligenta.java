package application;

public abstract class IncapereInteligenta extends Incapere {
	
	private String Nume;
	private String metripatrati;
	private boolean AreGeam;
	private boolean SursaGaze;
	private boolean SursaApa;
	private boolean LuminaAprinsa;
	

	public IncapereInteligenta(String nume, String metripatrati, boolean areGeam, boolean sursaGaze, boolean sursaApa,
			boolean luminaAprinsa) {
		super();
		Nume = nume;
		this.metripatrati = metripatrati;
		AreGeam = areGeam;
		SursaGaze = sursaGaze;
		SursaApa = sursaApa;
		LuminaAprinsa = luminaAprinsa;
	}


	@Override
	public String getInfo(Incapere camera) {
		return "IncapereInteligenta [Nume=" + Nume + ", metripatrati=" + metripatrati + ", AreGeam=" + AreGeam
		+ ", SursaGaze=" + SursaGaze + ", SursaApa=" + SursaApa + "]";
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
		this.metripatrati = metripatrati;
	}


	public boolean isAreGeam() {
		return AreGeam;
	}


	public void setAreGeam(boolean areGeam) {
		AreGeam = areGeam;
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


	

}
