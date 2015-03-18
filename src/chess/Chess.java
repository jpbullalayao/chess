/**
 * Driver class for entire chess package that will simulate a chess game between two players.
 * 
 * @author  Jourdan Bul-lalayao <jpbullalayao@gmail.com>
 * @version 1.0
 * @since   2015-03-17
 */

package chess;

public class Chess {

  /**
   * Object reference for player 1.
   */
	private Player player1;
	
	/**
	 * Object reference for player 2.
	 */
	private Player player2;
	
	/**
	 * 2 x 2 matrix that represents the chess board for the game.
	 */
	private int[][] board;

	/**
	 * Initializes chess game.
	 */
	public Chess() {
    player1 = new Player(1);
    player2 = new Player(2);
		board = new int[8][8];
	}

	public static void main(String[] args) {
		Chess game = new Chess();
	}

}