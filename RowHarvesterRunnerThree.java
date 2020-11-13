import kareltherobot.*; 

public class RowHarvesterRunnerThree implements Directions
{
	public static void main(String[] args)
	{
		World.readWorld("harvestField.kwld"); 
		World.setVisible(true); 
		World.setDelay(15); 
	
		RowHarvester will; 

		will = new RowHarvester(2, 2, East, 0); 
		will.pickTwoRows(); 
		will.turnOff(); 

		will = new RowHarvester(4, 2, East, 0);
		will.pickTwoRows(); 
		will.turnOff();
		
		will = new RowHarvester(6, 2, East, 0); 
		will.pickTwoRows(); 
		will.turnOff(); 
	}
}