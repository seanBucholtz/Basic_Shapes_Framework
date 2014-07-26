/**
 * <p>The purpose of this class is to create a <i>virtual</i> square
 * with variable dimensions.</p>
 * 
 * <p><u>Grading level</u>: <b>Challenge</b></p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 5: Shape Hierarchy
 */
public class MySquare extends MyRectangle {
  
  /**
   * constructor for objects of class MySquare.
   * This creates a MySquare instance with a variable side length.
   * 
   * @param side The <i>side</i> length.
   */
  public MySquare(int side) {
    
    super(side, side);
  }
  
  /**
   * Retrieves the name of the shape.
   * 
   * @return the <i>name</i> of the shape.
   */
  public String getName() {
    
    return "square";
   }
}