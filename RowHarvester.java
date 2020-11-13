
import kareltherobot.*; 

public class RowHarvester extends UrRobot
{
	public RowHarvester(int st, int ave, Direction d, int num)
	{
		super(st, ave, d, num);
	}

	public void moveAndPick()
	{
		move(); 
		pickBeeper();
	}

	public void pickRow()
	{
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
		moveAndPick(); 
	}

	public void makeARightUTurn()
	{
		move(); 
		turnLeft(); 
		move(); 
		turnLeft(); 
	}

	public void pickTwoRows()
	{
		pickRow(); 
		makeARightUTurn();
		pickRow(); 
	}
}
	
