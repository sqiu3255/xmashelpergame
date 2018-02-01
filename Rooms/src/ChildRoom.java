/*
*  Author: Sophia Qiu
*  Date Created: 12.2017
*  Project Name: Christmas Helper Text Based Adventure Game
*/

public class ChildRoom extends Room{
	public ChildRoom(int x, int y)
	{
		super(x, y);
	}
	
	public void enterRoom(Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("Shh! There are kids sleeping in this room ..  \n" +
							"Quick choose an option to take! (A or B)");
		
		Scanner choice = new Scanner(System.in); 
		try {
			String ans = 
		}
		
	}
}
