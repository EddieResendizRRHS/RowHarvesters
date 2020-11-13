import kareltherobot.*; 

public class RowHarvesterRunnerFour implements Directions
{
	public static void main(String[] args)
	{
		World.readWorld("harvestField.kwld"); 
		World.setVisible(true); 
		World.setDelay(15); 
	
		RowHarvester will; 

		will.pickTwoRows(); 
		will.turnOff(); 
	}
}