/**
 * <p>The purpose of this class is to create a <i>virtual</i> isosceles triangle
 * with variable dimensions.</p>
 * 
 * <p><u>Grading level</u>: <b>Challenge</b></p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 5: Shape Hierarchy
 */
public class MyIsoscelesTriangle extends MyTriangle {
  
  /**
   * constructor for objects of class MyIsoscelesTriangle.
   * This creates a MyIsoscelesTriangle instance with a variable height and width.
   * 
   * @param h The <i>height</i> of the isosceles triangle.
   * @param b The <i>base</i> width of the isosceles triangle.
   */
  public MyIsoscelesTriangle(int h, int b) {
    
    super(h, b);
  }
  
  /**
   * Retrieves the name of the object.
   * 
   * @return The <i>name</i> of the object.
   */
  public String getName() {
    
    return "isosceles triangle";
  }
  
  /**
   * Retrieves the perimeter of the isosceles triangle.
   * 
   * @return The <i>perimeter</i> of the isosceles triangle.
   */
  public double getPerimeter( ) {
   
    // a = base, b = height c = hypotenuse
    // perimeter = a + 2c
    // c = sqrt((1/2*a)^2 + b^2)
    // perimeter = a + 2(sqrt((1/2*a)^2 + b^2))
    return(getWidth() + 2*(Math.sqrt((Math.pow(0.5*getWidth(),2))+(Math.pow(getHeight(),2)))));
  }
}