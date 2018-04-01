import java.awt.*;
import java.util.ArrayList;
public class King extends Piece{

	public King(Location l, Image t, int c){
		super(l,t,c);
	}


	public ArrayList<Location> getMoves(int[][] arr, Location loc){

		ArrayList<Location> temp = new ArrayList<Location>();

		int xPos = loc.getX();
		int yPos = loc.getY();

		if (new Location(xPos,yPos-1).isValidLoc())
			temp.add(new Location(xPos,yPos-1));

		if (new Location(xPos+1,yPos-1).isValidLoc())
			temp.add(new Location(xPos+1,yPos-1));

		if (new Location(xPos+1,yPos).isValidLoc())
			temp.add(new Location(xPos+1,yPos));

		if (new Location(xPos+1,yPos+1).isValidLoc())
			temp.add(new Location(xPos+1,yPos+1));

		if (new Location(xPos,yPos+1).isValidLoc())
			temp.add(new Location(xPos,yPos+1));

		if (new Location(xPos-1,yPos+1).isValidLoc())
			temp.add(new Location(xPos-1,yPos+1));

		if (new Location(xPos-1,yPos).isValidLoc())
			temp.add(new Location(xPos-1,yPos));

		if (new Location(xPos-1,yPos-1).isValidLoc())
			temp.add(new Location(xPos-1,yPos-1));

		return temp;

	}

}