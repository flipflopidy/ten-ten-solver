import java.util.ArrayList;

public abstract class Solution {

	public final String name = "Generic Solution Abstract Class";

	Board b;

	Solution() {
		b = null;
	}

	public void setBoard(Board board) {
		b = board;
	}

	/*	doMove(...) is the only function that must be implemented.

		Desired Behaviour: With the `choices` you are given, pick
		a piece to insert into the board at some valid position.

		Note: Valid positions are returned by Board.getAvailableSpots(Piece).
	*/
	abstract void doMove(ArrayList<Piece> choices);

};
