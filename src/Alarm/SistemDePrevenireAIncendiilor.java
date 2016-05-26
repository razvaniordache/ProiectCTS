package Alarm;

public class SistemDePrevenireAIncendiilor {

	HandlerUrgente alerte = null;

	
	public SistemDePrevenireAIncendiilor(HandlerUrgente alerte) {
		super();
		this.alerte = alerte;
	}

	public void adaugaAlerta(HandlerUrgente alerta){
		
		if(alerte == null)
			this.alerte = alerta;
		else
		{
			HandlerUrgente handler = null;
			for(handler = this.alerte;
				handler.next!=null;
					handler = handler.next);
			handler.next = alerta;
		}
	}
	
	public void procesare(StareTemperatura stareTemp)
	{
		if(this.alerte!=null)
			this.alerte.alertaTemperatura(stareTemp);
	}
	
}
