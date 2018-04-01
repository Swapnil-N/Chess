import java.awt.*;
import java.util.ArrayList;
public class Piece{

	private Image pic;
	private Location lo;
	private int color;

	public Piece(Location l, Image t, int c){
		lo = l;
		pic = t;
		color=c;
	}
	public int getColor()
	{
		return color;
	}
	public Image getImage(){
		return pic;
	}

	public Location getLoc(){
		return lo;
	}

	public void changeLoc(Location place){
		lo = place;
	}
	public ArrayList<Location> getMoves(int[][] arr, Location loc){
		return null;
	}
}