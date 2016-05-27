package StateGaraj;

public class Garage {

	SmartGarageState isOpen;
	SmartGarageState canStore;
	SmartGarageState giveCar;
	SmartGarageState wash;
	
	SmartGarageState garageState;
	
	boolean doorOpen=false;
	
	public Garage()
	{
		isOpen= new IsOpen(this);
		canStore=new CanStore(this);
		giveCar=new ReturnCar(this);
		wash=new StartWashProgram(this);
		
		garageState=isOpen;
	}
	
	void setGarageState(SmartGarageState newGarageState)
	{
		garageState=newGarageState;
	}
	
	public void OpenGarageDoor()
	{
		garageState.openGarageDoor();
	}
	
	public void EjectCar(String NrInmatriculare)
	{
		garageState.ejectCar(NrInmatriculare);
	}
	
	public void StoreCar(String NrInmatriculare)
	{
		garageState.storeCar(NrInmatriculare);
	}
	
	public void StartWash()
	{
		garageState.cleanCars();
	}
	
	public SmartGarageState getYesOpenDoor() { return isOpen; }
	public SmartGarageState getYesCanStore() { return canStore; }
	public SmartGarageState getCarBack() { return giveCar; }
	public SmartGarageState getAWash() { return wash; }
	
	
	
	
	
}
