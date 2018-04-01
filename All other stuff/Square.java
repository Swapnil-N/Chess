import java.awt.Polygon;
public class Square{

	public Square(){

	}

	public Polygon makeSquare(int a, int b){

		Polygon p = new Polygon();
		p.addPoint(a,b);
		p.addPoint(a+80,b);
		p.addPoint(a+80,b+80);
		p.addPoint(a,b+80);

		return p;


	}

	public int Ix(){

		return 2;

	}

}