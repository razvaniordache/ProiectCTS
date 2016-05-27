package StateGaraj;

public interface SmartGarageState {
	
	void openGarageDoor();
	void storeCar(String NrInmatriculare);
	void ejectCar(String NrInmatriculare);
	void cleanCars();
	
	

}
