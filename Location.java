public class Location{

	private int x;
	private int y;

	public Location(int a, int b){
		x = a;
		y = b;

	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public void changeX(int g){
		x = g;
	}

	public void changeY(int h){
		y = h;
	}

	public boolean sameAs(Location a){
		return x == a.getX() && y == a.getY();
	}

	public boolean isValidLoc(){
		return x>=0 && x<8 && y>=0 && y<8;
	}

	public String toString(){
		return "("+x+", "+y+")";
	}

}