
public class ChildRoom {
	public ChildRoom(int x, int y)
	{
		super(x, y);
	}
	
	public void enterRoom(Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found the some snacks! Regain energy before moving on.");
	}
}
