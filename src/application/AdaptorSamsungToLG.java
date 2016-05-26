package application;

import java.util.stream.IntStream;

import LG.InterfataTrakerCostApa;
import samsung.InterfataSamsung;

public class AdaptorSamsungToLG implements InterfataTrakerCostApa{

	InterfataSamsung interfataSamsung;
	
	public boolean Proxy(String ip)
	{
		if(ip.substring(0,2).equals("10"))
			return false;
		else
			return true;
	}
	
	
	public AdaptorSamsungToLG(InterfataSamsung interfataSamsung) {
		this.interfataSamsung = interfataSamsung;
	}


	@Override
	public double getCost(String ip, double PretperL) throws Exception {
		
		if(Proxy(ip))
		{
		int[] consum =new int[7];
		consum = interfataSamsung.getConsumApaSaptamanal(ip);
		int suma=IntStream.of(consum).sum();
		return suma*PretperL;
		}
		else throw new Exception("Invalid IP");
		
	}



}
