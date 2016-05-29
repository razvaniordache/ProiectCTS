package Alarm;

public class AlertaTemperatura extends HandlerUrgente{

	@Override
	public void alertaTemperatura(StareTemperatura temperaturaCamera) {
		if(temperaturaCamera.temperatura <= 35)
		{
			if(this.next!=null)
				this.next.alertaTemperatura(temperaturaCamera);
		}
		else 
			if(temperaturaCamera.temperatura <=45)
			{
				System.out.println("Camera necesita ventilatie");
				if(this.next!=null)
					this.next.alertaTemperatura(temperaturaCamera);
			}
			else
				System.out.println("Boss arde ceva !!!");
		
	}

}
