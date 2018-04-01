640/80

*80
	private Polygon A1,A2,A3,A4,A5,A6,A7,A8,B1,B2,B3,B4,B5,B6,B7,B8,C1,C2,C3,C4,C5,C6,C7,C8,D1,D2,D3,D4,D5,D6,D7,D8,E1,E2,E3,E4,E5,E6,E7,E8,F1,F2,F3,F4,F5,F6,F7,F8,G1,G2,G3,G4,G5,G6,G7,G8,H1,H2,H3,H4,H5,H6,H7,H8;
	private ArrayList<Polygon> board;

	setPoly();
	addPolyToBoard();

	public void addPolyToBoard(){
		board=new ArrayList<Polygon>();
		board.add(A1);
		board.add(A2);
		board.add(A3);
		board.add(A4);
		board.add(A5);
		board.add(A6);
		board.add(A7);
		board.add(A8);
		board.add(B1);
		board.add(B2);
		board.add(B3);
		board.add(B4);
		board.add(B5);
		board.add(B6);
		board.add(B7);
		board.add(B8);
		board.add(C1);
		board.add(C2);
		board.add(C3);
		board.add(C4);
		board.add(C5);
		board.add(C6);
		board.add(C7);
		board.add(C8);
		board.add(D1);
		board.add(D2);
		board.add(D3);
		board.add(D4);
		board.add(D5);
		board.add(D6);
		board.add(D7);
		board.add(D8);
		board.add(E1);
		board.add(E2);
		board.add(E3);
		board.add(E4);
		board.add(E5);
		board.add(E6);
		board.add(E7);
		board.add(E8);
		board.add(F1);
		board.add(F2);
		board.add(F3);
		board.add(F4);
		board.add(F5);
		board.add(F6);
		board.add(F7);
		board.add(F8);
		board.add(G1);
		board.add(G2);
		board.add(G3);
		board.add(G4);
		board.add(G5);
		board.add(G6);
		board.add(G7);
		board.add(G8);
		board.add(H1);
		board.add(H2);
		board.add(H3);
		board.add(H4);
		board.add(H5);
		board.add(H6);
		board.add(H7);
		board.add(H8);

	}


	public void setPoly(){

		Square poly = new Square();

		A1 = poly.makeSquare(0,0);
		A2 = poly.makeSquare(0,80);
		A3 = poly.makeSquare(0,160);
		A4 = poly.makeSquare(0,240);
		A5 = poly.makeSquare(0,320);
		A6 = poly.makeSquare(0,400);
		A7 = poly.makeSquare(0,480);
		A8 = poly.makeSquare(0,560);
		B1 = poly.makeSquare(80,0);
		B2 = poly.makeSquare(80,80);
		B3 = poly.makeSquare(80,160);
		B4 = poly.makeSquare(80,240);
		B5 = poly.makeSquare(80,320);
		B6 = poly.makeSquare(80,400);
		B7 = poly.makeSquare(80,480);
		B8 = poly.makeSquare(80,560);
		C1 = poly.makeSquare(160,0);
		C2 = poly.makeSquare(160,80);
		C3 = poly.makeSquare(160,160);
		C4 = poly.makeSquare(160,240);
		C5 = poly.makeSquare(160,320);
		C6 = poly.makeSquare(160,400);
		C7 = poly.makeSquare(160,480);
		C8 = poly.makeSquare(160,560);
		D1 = poly.makeSquare(240,0);
		D2 = poly.makeSquare(240,80);
		D3 = poly.makeSquare(240,160);
		D4 = poly.makeSquare(240,240);
		D5 = poly.makeSquare(240,320);
		D6 = poly.makeSquare(240,400);
		D7 = poly.makeSquare(240,480);
		D8 = poly.makeSquare(240,560);
		E1 = poly.makeSquare(320,0);
		E2 = poly.makeSquare(320,80);
		E3 = poly.makeSquare(320,160);
		E4 = poly.makeSquare(320,240);
		E5 = poly.makeSquare(320,320);
		E6 = poly.makeSquare(320,400);
		E7 = poly.makeSquare(320,480);
		E8 = poly.makeSquare(320,560);
		F1 = poly.makeSquare(400,0);
		F2 = poly.makeSquare(400,80);
		F3 = poly.makeSquare(400,160);
		F4 = poly.makeSquare(400,240);
		F5 = poly.makeSquare(400,320);
		F6 = poly.makeSquare(400,400);
		F7 = poly.makeSquare(400,480);
		F8 = poly.makeSquare(400,560);
		G1 = poly.makeSquare(480,0);
		G2 = poly.makeSquare(480,80);
		G3 = poly.makeSquare(480,160);
		G4 = poly.makeSquare(480,240);
		G5 = poly.makeSquare(480,320);
		G6 = poly.makeSquare(480,400);
		G7 = poly.makeSquare(480,480);
		G8 = poly.makeSquare(480,560);
		H1 = poly.makeSquare(560,0);
		H2 = poly.makeSquare(560,80);
		H3 = poly.makeSquare(560,160);
		H4 = poly.makeSquare(560,240);
		H5 = poly.makeSquare(560,320);
		H6 = poly.makeSquare(560,400);
		H7 = poly.makeSquare(560,480);
		H8 = poly.makeSquare(560,560);

	}
