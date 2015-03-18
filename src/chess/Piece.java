/**
 * Polymorphic object that will refer to either a Pawn, Rook, Knight, Bishop, Queen, or King.
 * 
 * @author Jourdan Bul-lalayao <jpbullalayao@gmail.com>
 * @since  2015-03-17
 */

package chess;

public abstract class Piece {

  /**
   * Vertical coordinate of chess piece.
   */
  private int file;
  
  /**
   * Horizontal coordinate of chess piece.
   */
  private int rank;

  /**
   * Initializes chess piece and assigns it to its correct coordinate.
   * 
   * @param file
   * @param rank
   */
  public Piece(int file, int rank) {
    this.file = file;
    this.rank = rank;
  }

  public void setFile(int file) {
    this.file = file;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public int getFile() {
    return file;
  }

  public int getRank() {
    return rank;
  }

  public abstract void move();

}
