package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Torre;

public class ChessMacth {

    private Board board;

    public ChessMacth() {
	board = new Board(8, 8);
	initialSetup();
    }

    public ChessPiece[][] getPieces() {
	ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
	for (int i = 0; i < board.getRows(); i++) {
	    for (int j = 0; j < board.getColumns(); j++) {
		matriz[i][j] = (ChessPiece) board.piece(i, j);
	    }
	}
	return matriz;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
	board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
	placeNewPiece('c', 1, new Torre(board, Color.WHITE));
	placeNewPiece('c', 2, new Torre(board, Color.WHITE));
	placeNewPiece('d', 2, new Torre(board, Color.WHITE));
	placeNewPiece('e', 2, new Torre(board, Color.WHITE));
	placeNewPiece('e', 1, new Torre(board, Color.WHITE));
	placeNewPiece('d', 1, new King(board, Color.WHITE));

	placeNewPiece('c', 7, new Torre(board, Color.BLACK));
	placeNewPiece('c', 8, new Torre(board, Color.BLACK));
	placeNewPiece('d', 7, new Torre(board, Color.BLACK));
	placeNewPiece('e', 7, new Torre(board, Color.BLACK));
	placeNewPiece('e', 8, new Torre(board, Color.BLACK));
	placeNewPiece('d', 8, new King(board, Color.BLACK));
    }
}
