
public class Room {
	Person occupant;
	int xLoc,yLoc;
	private boolean explored = false;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{
		System.out.println("Your mission is to deliver Santa's present ");
		occupant = x;
		explored = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	public boolean isExplored(Person x)
	{
		return explored;
	}
	
	public void setExplored(boolean explored)
	{
		this.explored = explored;
	}
	
	public void print()
	{	
		if (!explored && occupant == null)
		{
			System.out.print("[ ]");
		}
		else if (occupant != null)
		{
			System.out.print("[");
			occupant.print("x");
			System.out.print("]");
		}
		else if (explored)
		{
			System.out.print("[+]");
		}
	}
	
}
