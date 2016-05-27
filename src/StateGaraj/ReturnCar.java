package StateGaraj;

public class ReturnCar implements SmartGarageState{

	Garage garaj;
	
	public ReturnCar(Garage newGaraj)
	{
		garaj=newGaraj;
	}
	
	@Override
	public void openGarageDoor() {
		System.out.println("Door is opening ... ");
		//garaj.setGarageState(garaj.getYesOpenDoor());
		
	}

	@Override
	public void storeCar(String NrInmatriculare) {
		System.out.println("You cannot store a car right now, another car is pulled out");
		
	}

	@Override
	public void ejectCar(String NrInmatriculare) {
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
		System.out.println("Please Exit the garage 2");
		
	}

}
