/**
 * Represents a player in chess.
 * 
 * @author Jourdan Bul-lalayao <jpbullalayao@gmail.com>
 * @since  2015-03-17
 */

package chess;

import java.util.ArrayList;

public class Player {

  /**
   * Identifies if this player is player 1 or player 2.
   */
  private int id;
  
  /**
   * Stores name specified by the player.
   */
  private String name;
  
  /**
   * Collection of all chess pieces that the player has left.
   */
  private ArrayList<Piece> pieces;
  
  /**
   * Determines if it is this player's turn.
   */
  private boolean myTurn;
  
  /**
   * Stores the number of wins by this player.
   */
  private int wins;
  
  /**
   * Stores the number of losses by this player.
   */
  private int losses;
  
  /**
   * Initializes player object.
   * 
   * @param id Player's identification number
   */
  public Player(int id) {
    pieces = new ArrayList<Piece>();
    name = null;
    myTurn = false;
    wins = 0;

    setPieces();
  }

  /**
   * Constructs the chess piece objects for this player.
   */
  public void setPieces() {
    int num = 0;

    while (num < 16) {  
      if (num < 1) {
        pieces.add(new King());
        pieces.add(new Queen());
      }

      if (num < 2) {
        pieces.add(new Rook());
        pieces.add(new Knight());
        pieces.add(new Bishop());
      }

      pieces.add(new Pawn());
      num++;
    }
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMyTurn(boolean myTurn) {
    this.myTurn = myTurn;
  }

  public void setWins() {
    wins++;
  }
  
  public void setLosses() {
    losses++;
  }

  public ArrayList<Piece> getPieces() {
    return pieces;
  }

  public String getName() {
    return name;
  }

  public boolean getMyTurn() {
    return myTurn;
  }

  public int getWins() {
    return wins;
  }
  
  public int getLosses() {
    return losses;
  }
  
  public String getRecord() {
    return getWins() + "-" + getLosses();
  }
}

