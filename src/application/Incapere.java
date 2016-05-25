package application;

public abstract class Incapere {

	public abstract void DeschideLumina(Incapere camera) throws ExceptieLipsaCurent, Exception;
	public abstract void InchideLumina(Incapere camera) throws Exception;
	public abstract void PornesteAC(Incapere camera, int grade) throws ExceptieLipsaCurent, Exception;
	public abstract void InchideAC(Incapere camera);
	public abstract void StareUsa(Incapere camera, boolean stare);
	public abstract String getInfo(Incapere camera);
}
