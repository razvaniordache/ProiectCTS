package samsung;

import java.util.Random;

public class SenzorApaSamsung implements InterfataSamsung{

	
	
	@Override
	public int[] getConsumApaSaptamanal(String ip) {
		int[] Consum = new int[7];
		Random rand= new Random();
		for(int i=0;i<7;i++)
		{
			Consum[i]=rand.nextInt(30);
		}
		return Consum;
	}
	

}
