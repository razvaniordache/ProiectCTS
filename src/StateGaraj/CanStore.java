package StateGaraj;

public class CanStore implements SmartGarageState{

	Garage garaj;
	
	public CanStore(Garage newGaraj)
	{
		garaj=newGaraj;
	}
	
	@Override
	public void openGarageDoor() {
		System.out.println("Door is opening ... ");
		garaj.setGarageState(garaj.getYesOpenDoor());
		
	}

	@Override
	public void storeCar(String NrInmatriculare) {
		if(NrInmatriculare.equals("B94ARY") || NrInmatriculare.equals("CD205111"))
		{
			System.out.println("Accepted Car "+NrInmatriculare);
			garaj.setGarageState(garaj.getYesCanStore());
		}
		
	}

	@Override
	public void ejectCar(String NrInmatriculare) {
		System.out.println("You cannot eject a car right now, another car is stored ... please wait");
		
	}

	@Override
	public void cleanCars() {
		System.out.println("Please Exit the garage");
		garaj.setGarageState(garaj.getAWash());
		
		
	}

}
