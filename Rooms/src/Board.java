
public class Board {
	
	Room [][] houseMap;
	
	public Board(Room[][] houseMap)
	{
		this.houseMap = houseMap; 
	}
	
	public void printBoard()
	{
		for (Room[]row:houseMap)
		{
			for (Room room : row)
			{
				room.print();
			}
		System.out.println();
		}
	}
	
}
