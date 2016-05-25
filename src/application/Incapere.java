package application;

public abstract class Incapere {

	public abstract void DeschideLumina() throws ExceptieLipsaCurent;
	public abstract void InchideLumina() ;
	public abstract void PornesteAC(int grade) throws Exception;
	public abstract void InchideAC();
	public abstract void StareUsa(boolean stare);
	public abstract String getInfo();
}
