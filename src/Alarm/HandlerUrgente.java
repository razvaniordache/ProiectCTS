package Alarm;


public abstract class HandlerUrgente {

protected HandlerUrgente next;
	
	public abstract void alertaTemperatura(
			StareTemperatura temperatura);
	
	public void setNextAlert(HandlerUrgente next){
		this.next = next;
	}
}
