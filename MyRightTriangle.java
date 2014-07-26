/**
 * <p>The purpose of this class is to create a <i>virtual</i> right-triangle
 * with variable dimensions.</p>
 * 
 * <p><u>Grading level</u>: <b>Challenge</b></p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 5: Shape Hierarchy
 */
public class MyRightTriangle extends MyTriangle {
  
  /**
   * constructor for objects of class MyRightTriangle.
   * This creates a MyRightTriangle instance with a variable height and width.
   * 
   * @param h The <i>height</i> of the right-triangle.
   * @param w The <i>width</i> of the right-triangle.
   */
  public MyRightTriangle(int h, int w) {
    
    super(h, w);
  }
  
  /**
   * Retrieves the name of the object.
   * 
   * @return The <i>name</i> of the object.
   */
  public String getName() {
    
    return "right-triangle";
  }
  
  /**
   * Retrieves the perimeter of the right-triangle.
   * 
   * @return The <i>perimeter</i> of the right-triangle.
   */
  public double getPerimeter( ) {
   
    // a = width, b = height c = hypotenuse
    // perimeter = a + b + c
    // c = sqrt(a^2 + b^2)
    // perimeter = a + b + (sqrt(a^2 + b^2))
    return(getWidth() + getHeight() + (Math.sqrt(Math.pow(getWidth(),2) + Math.pow(getHeight(),2))));
  }
}