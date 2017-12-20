
public class Board {
	
	Room [][] rooms;
	
	public Board(Room[][] rooms)
	{
		this.rooms = New Room [size][size]; 
	}
	
	public void printBoard()
	{
		for (Room[]i:rooms)
		{
			for(Room x:i)
			{
				x.print();
			}
		System.out.println();
		}
	}
	
}
