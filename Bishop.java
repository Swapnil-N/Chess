import java.awt.*;
import java.util.ArrayList;
public class Bishop extends Piece{

	public Bishop(Location l, Image t, int c){
		super(l,t,c);
	}

	public ArrayList<Location> getMoves(int[][] arr, Location loc){

		ArrayList<Location> temp = new ArrayList<Location>();

		int xPos = loc.getX();
		int yPos = loc.getY();

		int ix = xPos+1;
		int jy = yPos+1;

		while(ix<8 && jy<8){
			if (arr[jy][ix] == 0)
				temp.add(new Location(ix, jy));
			else if (arr[jy][ix]!=getColor())
				 {
					temp.add(new Location(ix,jy));
					break;
				 }
			else break;
			ix++;
			jy++;
		}

		ix = xPos-1;
		jy = yPos-1;

		while(ix>=0 && jy>=0){
			if (arr[jy][ix] == 0)
				temp.add(new Location(ix, jy));
			else if (arr[jy][ix]!=getColor())
				 {
					temp.add(new Location(ix,jy));
					break;
				 }
			else break;
			ix--;
			jy--;
		}

		ix = xPos+1;
		jy = yPos-1;

		while(ix<8 && jy>=0){
			if (arr[jy][ix] == 0)
				temp.add(new Location(ix, jy));
			else if (arr[jy][ix]!=getColor())
				 {
					temp.add(new Location(ix,jy));
					break;
				 }
			else break;
			ix++;
			jy--;
		}

		ix = xPos-1;
		jy = yPos+1;

		while(ix>=0 && jy<8){
			if (arr[jy][ix] == 0)
				temp.add(new Location(ix, jy));
			else if (arr[jy][ix]!=getColor())
				 {
					temp.add(new Location(ix,jy));
					break;
				 }
			else break;
			ix--;
			jy++;
		}

		return temp;
	}
}