package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	private Color color;

	// Constructor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//	Get and Set
	public Color getColor() {
		return color;
	}
	
	
	
	
}
