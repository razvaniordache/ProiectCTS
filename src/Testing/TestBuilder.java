package Testing;

import application.BuilderCamera;
import application.CameraNormala;
import application.ExceptieLipsaCurent;
import junit.framework.TestCase;

public class TestBuilder extends TestCase {

	CameraNormala cameraOaspeti;
	protected void setUp() throws Exception {
		super.setUp();
		
	}
	
	public void testBuilder()
	{
		String gol=null;
		try {
			cameraOaspeti= new BuilderCamera(gol, gol).AprindeLumina().build();
			fail();
		} catch (Exception e) {
			System.out.println("Builder trateaza null");
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
