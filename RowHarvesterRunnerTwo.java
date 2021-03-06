import kareltherobot.*; 

public class RowHarvesterRunnerTwo implements Directions
{
	public static void main(String[] args)
	{
		World.readWorld("harvestField.kwld"); 
		World.setVisible(true); 
		World.setDelay(15); 
	
		RowHarvester will = new RowHarvester(2, 2, East, 0); 
		will.pickTwoRows(); 
		will.turnOff(); 

		RowHarvester roberts = new RowHarvester(4, 2, East, 0);
		roberts.pickTwoRows(); 
		roberts.turnOff();
		
		RowHarvester red = new RowHarvester(6, 2, East, 0); 
		red.pickTwoRows(); 
		red.turnOff(); 
	}
}