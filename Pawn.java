import java.awt.*;
import java.util.ArrayList;
public class Pawn extends Piece{

	public Pawn(Location l, Image t, int c){
		super(l,t,c);
	}

	public ArrayList<Location> getMoves(int[][] arr, Location loc){

		ArrayList<Location> temp = new ArrayList<Location>();

		int xPos = loc.getX();
		int yPos = loc.getY();

		if(getColor()==1){
			if (yPos==1){
				//check if square in front is empty
				temp.add(new Location(xPos,yPos+2));
			}
			temp.add(new Location(xPos,yPos+1));
		}
		else{
			if (yPos==6)
				temp.add(new Location(xPos,yPos-2));
			temp.add(new Location(xPos,yPos-1));
		}

		return temp;



	}
}
