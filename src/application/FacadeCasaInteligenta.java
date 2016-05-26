package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import samsung.InterfataSamsung;
import samsung.SenzorApaSamsung;

public class FacadeCasaInteligenta {

	public static String status(List<IncapereInteligenta> Camere){
		StringBuffer statusCasa = 
				new StringBuffer();
		statusCasa.append("Start Facade ...");
		statusCasa.append("\n");
		statusCasa.append("Status la ora:"
				+(new Date()).toLocaleString());
		statusCasa.append("\n");
		
		for( int x=0 ; x<Camere.size(); x++)
		{
			statusCasa.append(Camere.get(x).getInfo());
			statusCasa.append("\n");
		}
		
		InterfataSamsung SenzorApa=new SenzorApaSamsung();
		AdaptorSamsungToLG adaptor= new AdaptorSamsungToLG(SenzorApa);
		
		try {
			statusCasa.append("Cost total Apa: "+adaptor.getCost("192.168.0.2",4.3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statusCasa.toString();
		
	}
	
}
