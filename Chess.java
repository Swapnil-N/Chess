import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class Chess extends JPanel implements MouseListener
{
	private int x;
	private int y;
	private JFrame frame;
	private boolean click;
	private boolean gameOn;
	private int[][] board = new int[8][8];
	private int col;
	private int row;
	private ArrayList<Location> posMoves;
	private ArrayList<Piece> pieces;
	private Rook bRook1,bRook2,wRook1,wRook2;
	private Bishop bBishop1, bBishop2, wBishop1, wBishop2;
	private Queen bQueen, wQueen;
	private King bKing,wKing;
	private Knight bKnight1, bKnight2, wKnight1, wKnight2;
	private Piece clickPiece=null;
	private boolean selected = false;
	private int turn = 1; // 1 = white, 2 = black

	public Chess()
	{
		frame=new JFrame();
		x=100;
		y=100;
		imageLoader();
		board[0][0] = 1; //Rook
		board[0][7] = 1; //Rook
		board[7][0] = 2; //Rook
		board[7][7] = 2; //Rook
		board[0][2] = 1; //Bishop
		board[0][5] = 1; //Bishop
		board[7][2] = 2; //Bishop
		board[7][5] = 2; //Bishop
		board[0][4] = 1; //Queen
		board[7][3] = 2; //Queen
		board[0][3] = 1; //King
		board[7][4] = 2; //King
		board[0][1] = 1;
		board[0][6] = 1;
		board[7][1] = 2;
		board[7][6] = 2;

		click = true;

		frame.add(this);
		frame.setSize(900,672);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);

	}
	public void imageLoader()
	{
		Image bRook= new ImageIcon(this.getClass().getResource("BlackRook.png")).getImage();
		Image wRook= new ImageIcon(this.getClass().getResource("WhiteRook.png")).getImage();
		Image bBishop= new ImageIcon(this.getClass().getResource("BlackBishop.png")).getImage();
		Image wBishop= new ImageIcon(this.getClass().getResource("WhiteBishop.png")).getImage();
		Image wQueenPic= new ImageIcon(this.getClass().getResource("WhiteQueen.png")).getImage();
		Image bQueenPic= new ImageIcon(this.getClass().getResource("BlackQueen.png")).getImage();
		Image wKingPic= new ImageIcon(this.getClass().getResource("WhiteKing.png")).getImage();
		Image bKingPic= new ImageIcon(this.getClass().getResource("BlackKing.png")).getImage();
		Image bKnight= new ImageIcon(this.getClass().getResource("BlackKnight.png")).getImage();
		Image wKnight= new ImageIcon(this.getClass().getResource("WhiteKnight.png")).getImage();


		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(bRook,0);
		tracker.addImage(wRook,0);
		tracker.addImage(bBishop,0);
		tracker.addImage(wBishop,0);
		tracker.addImage(wQueenPic,0);
		tracker.addImage(bQueenPic,0);
		tracker.addImage(wKingPic,0);
		tracker.addImage(bKingPic,0);
		tracker.addImage(bKnight,0);
		tracker.addImage(wKnight,0);

		try{
		tracker.waitForID(0);
		} catch (InterruptedException e){}

		wRook1 = new Rook(new Location(0,0),wRook,1);
		wRook2 = new Rook(new Location(7,0),wRook,1);
		bRook1 = new Rook(new Location(0,7),bRook,2);
		bRook2 = new Rook(new Location(7,7),bRook,2);

		wBishop1 = new Bishop(new Location(2,0),wBishop,1);
		wBishop2 = new Bishop(new Location(5,0),wBishop,1);
		bBishop1 = new Bishop(new Location(2,7),bBishop,2);
		bBishop2 = new Bishop(new Location(5,7),bBishop,2);

		wQueen = new Queen(new Location(4,0),wQueenPic,1);
		bQueen = new Queen(new Location(3,7),bQueenPic,2);

		wKing = new King(new Location(3,0),wKingPic,1);
		bKing = new King(new Location(4,7),bKingPic,2);

		wKnight1 = new Knight(new Location(1,0),wKnight,1);
		wKnight2 = new Knight(new Location(6,0),wKnight,1);
		bKnight1 = new Knight(new Location(1,7),bKnight,2);
		bKnight2 = new Knight(new Location(6,7),bKnight,2);


		pieces=new ArrayList<Piece>();
		pieces.add(bRook2);
		pieces.add(wRook1);
		pieces.add(bRook1);
		pieces.add(wRook2);
		pieces.add(wBishop1);
		pieces.add(wBishop2);
		pieces.add(bBishop1);
		pieces.add(bBishop2);
		pieces.add(wQueen);
		pieces.add(bQueen);
		pieces.add(wKing);
		pieces.add(bKing);

		pieces.add(wKnight1);
		pieces.add(wKnight2);
		pieces.add(bKnight1);
		pieces.add(bKnight2);

	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;

		g2d.setColor(Color.WHITE);
		g2d.fillRect(0,0,640,640);

		g2d.setColor(Color.BLACK);
		for (int i=0;i<641;i+=80){
			g2d.fillRect(i,0,3,642);
			g2d.fillRect(0,i,642,3);
		}

		int box1 = 80;

		for(int i=0;i<4;i++){
			g2d.fillRect(box1,0,80,80);
			g2d.fillRect(box1,160,80,80);
			g2d.fillRect(box1,320,80,80);
			g2d.fillRect(box1,480,80,80);

			box1+=160;
		}

		int box2 = 0;
		for(int i=0;i<4;i++){
			g2d.fillRect(box2,80,80,80);
			g2d.fillRect(box2,240,80,80);
			g2d.fillRect(box2,400,80,80);
			g2d.fillRect(box2,560,80,80);

			box2+=160;
		}


		for(Piece p:pieces)
		{
			g2d.drawImage(p.getImage(),p.getLoc().getX()*80+20,p.getLoc().getY()*80+5,this);
		}

		g2d.setFont(new Font("Times New Roman",Font.BOLD,50));
		g2d.setPaint(Color.RED);
		g2d.drawString("Chess",700,50);
		g2d.setFont(new Font("Times New Roman",Font.BOLD,30));
		g2d.setPaint(Color.GREEN);
		g2d.drawString("Currently Selected",650,150);
		g2d.drawString("Piece:",740,190);


		g2d.setPaint(Color.BLUE);

		if (turn == 1)
			g2d.drawString("White's Turn",680,500);
		else
			g2d.drawString("Black's Turn",680,500);

		if (selected){
			g2d.drawImage(clickPiece.getImage(),740,250,this);
		}


	}

	public void printBoard(){
		for (int j=0;j<8;j++){
			for (int i=0;i<8;i++)
				System.out.print(board[j][i]);
			System.out.println();
		}
		System.out.println();
	}

	public void mousePressed(MouseEvent e){

			int x=e.getX();
			int y=e.getY();


			col = x/80;
			row = y/80;

			if (click)
			{

				clickPiece=null;
				for(Piece piece:pieces)
				{
					if(piece.getLoc().sameAs(new Location(col,row))) //.getX()==col && piece.getLoc().getY()==row
					{
						if (piece.getColor() == turn){
							clickPiece=piece;
							selected = true;

							break;
						}
					}
				}
				if(clickPiece!=null)
				{
					click = false;
					posMoves = clickPiece.getMoves(board, new Location(col,row));
				}

			}
			else if (!click)
				{
					Location place = new Location(col,row);
					for (Location thing : posMoves){
						if (thing.sameAs(place)){
							if (board[place.getY()][place.getX()]!=0){
								for(int i = pieces.size()-1;i>=0;i--){
									if (pieces.get(i).getLoc().sameAs(place))
										pieces.remove(i);
								}
							}
							board[clickPiece.getLoc().getY()][clickPiece.getLoc().getX()] = 0;
							clickPiece.changeLoc(new Location(col,row));
							board[row][col] = clickPiece.getColor();

							if (turn == 1)
								turn = 2;
							else
								turn = 1;

							break;
						}
					}
					selected = false;
					posMoves = null;
					click = true;
				}
			System.out.println(posMoves);
			printBoard();

		repaint();
	}
	public void mouseClicked(MouseEvent e){

	}
	public void mouseReleased(MouseEvent e){

	}
	public void mouseEntered(MouseEvent e){

	}
	public void mouseExited(MouseEvent e){

	}

	public static void main(String args[])
	{
		Chess app=new Chess();
	}
}