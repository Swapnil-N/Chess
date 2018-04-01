import java.awt.*;
import java.util.ArrayList;
public class Rook extends Piece{

	public Rook(Location l, Image t, int c){
		super(l,t,c);
	}


	public ArrayList<Location> getMoves(int[][] arr, Location loc){

		ArrayList<Location> temp = new ArrayList<Location>();

		int xPos = loc.getX();
		int yPos = loc.getY();

		for (int i = xPos+1;i < 8;i++){
			if (arr[yPos][i] == 0)
				temp.add(new Location(i,yPos));
			else if (arr[yPos][i]!=getColor())
				 {
					temp.add(new Location(i,yPos));
					break;
				 }
			else break;
		}
		for (int i = xPos-1;i>=0;i--){
			if (arr[yPos][i] == 0)
				temp.add(new Location(i,yPos));
			else if (arr[yPos][i]!=getColor())
				 {
					temp.add(new Location(i,yPos));
					break;
				 }
			else break;
		}
		for (int i = yPos+1;i<8;i++){
			if (arr[i][xPos] == 0)
				temp.add(new Location(xPos,i));
			else if (arr[i][xPos]!=getColor())
				 {
					temp.add(new Location(i,xPos));
					break;
				 }
			else break;
		}
		for (int i = yPos-1;i>=0;i--){
			if (arr[i][xPos] == 0)
				temp.add(new Location(xPos,i));
			else if (arr[i][xPos]!=getColor())
				 {
					temp.add(new Location(i,xPos));
					break;
				 }
			else break;
		}

		return temp;

	}

}