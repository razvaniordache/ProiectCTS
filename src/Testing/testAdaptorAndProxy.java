package Testing;

import application.AdaptorSamsungToLG;
import junit.framework.TestCase;
import samsung.InterfataSamsung;
import samsung.SenzorApaSamsung;

public class testAdaptorAndProxy extends TestCase {

	InterfataSamsung SenzorApa;
	AdaptorSamsungToLG adaptor;
	
	protected void setUp() throws Exception {
		super.setUp();
		SenzorApa=new SenzorApaSamsung();
		adaptor= new AdaptorSamsungToLG(SenzorApa);
		
	}
	
	public void testAdaptor()
	{
		
		double[] valori=new double[] {1002 , 94 , 0 , 431 , -342.4 , -0.1 , 9 , 1000.55 , 0.02 };
		
	
			for (int i= 0 ; i<valori.length; i++ )
			{
				try {
					System.out.println("Pret: "+ valori[i]);
					System.out.println("Cost: "+adaptor.getCost("192.168.0.2",valori[i]));
					if(adaptor.getCost("192.168.0.2",valori[i])<= 0)
						fail();
					}
				catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Succes");
				}
			}
	}
	
	public void testProxy()
	{
		String ip=null;
		try {
			adaptor.getCost(ip,5);
			fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Proxy denid null ip");
		}
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
