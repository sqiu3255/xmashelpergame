
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
		System.out.println("Hi Santa's Helper! Thank you for joining us on today's adventure!\n" + 
	"Your mission is to deliver Santa's present ");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	public void print()
	{	
		if (!explored && occupant == null)
		{
			System.out.print("[]");
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
	
	public boolean isExplored()
	{
		return explored;
	}
	
	public void setExplored(boolean explored)
	{
		this.explored = explored;
	}
	
}
