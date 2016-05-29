package Testing;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CreationalTestSuites extends TestSuite {
	
	//Compose test suites and refer to them by class.
	 public static Test suite() {
	        final TestSuite s = new TestSuite();
	        s.addTestSuite(TestFactoryObjects.class);
	        s.addTestSuite(TestBuilder.class);
	        return s;
	 }
}

