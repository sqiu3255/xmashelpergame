
public class Board {
	
	Room [][] rooms;
	
	public Board(Room[][] rooms)
	{
		this.rooms = rooms;
	}
	public Board(int size)
	{
		this.rooms = new Room [size][size]; 
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
