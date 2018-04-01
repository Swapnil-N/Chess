import java.awt.*;
import java.util.ArrayList;
public class Knight extends Piece{

	public Knight(Location l, Image t, int c){
		super(l,t,c);
	}

	public ArrayList<Location> getMoves(int[][] arr, Location loc){

		ArrayList<Location> temp = new ArrayList<Location>();


		int xPos = loc.getX();
		int yPos = loc.getY();

		if (new Location(xPos+1,yPos-2).isValidLoc())
			temp.add(new Location(xPos+1,yPos-2));

		if (new Location(xPos+2,yPos-1).isValidLoc())
			temp.add(new Location(xPos+2,yPos-1));

		if (new Location(xPos+2,yPos+1).isValidLoc())
			temp.add(new Location(xPos+2,yPos+1));

		if (new Location(xPos+1,yPos+2).isValidLoc())
			temp.add(new Location(xPos+1,yPos+2));

		if (new Location(xPos-1,yPos+2).isValidLoc())
			temp.add(new Location(xPos-1,yPos+2));

		if (new Location(xPos-2,yPos+1).isValidLoc())
			temp.add(new Location(xPos-2,yPos+1));

		if (new Location(xPos-2,yPos-1).isValidLoc())
			temp.add(new Location(xPos-2,yPos-1));

		if (new Location(xPos-1,yPos-2).isValidLoc())
			temp.add(new Location(xPos-1,yPos-2));

		return temp;


	}
}
