package StateGaraj;

public class IsOpen implements SmartGarageState{

	Garage garaj;
	
	public IsOpen(Garage newGaraj)
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
		System.out.println("This is not possible, door is open");
		
	}

}
