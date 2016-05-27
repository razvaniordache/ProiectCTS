package StateGaraj;

public class StartWashProgram implements SmartGarageState{

	Garage garaj;
	
	public StartWashProgram(Garage newGaraj)
	{
		garaj=newGaraj;
	}
	
	@Override
	public void openGarageDoor() {
		System.out.println("Washing process ... unable to open the door");
		
	}

	@Override
	public void storeCar(String NrInmatriculare) {
		System.out.println("Washing in process ... please wait");
		
	}

	@Override
	public void ejectCar(String NrInmatriculare) {
		System.out.println("Washing in process ... please wait");
		if(NrInmatriculare.equals("B94ARY"))
		{
			System.out.println("Pull out Car "+NrInmatriculare);
			garaj.setGarageState(garaj.getCarBack());
		}
		else if ( NrInmatriculare.equals("CD205111"))
		{
			System.out.println("Pull out Car "+NrInmatriculare);
			garaj.setGarageState(garaj.getCarBack());
		}
		else
		{
			System.out.println("There is no car with this number "+NrInmatriculare);
		}
	}

	@Override
	public void cleanCars() {
		System.out.println("Start cleaning ...");
		garaj.setGarageState(garaj.getAWash());
		
	}

}
