/**
 * <p>The purpose of this class is to create a <i>virtual</i> triangle
 * with variable dimensions.</p>
 * 
 * <p><u>Grading level</u>: <b>Challenge</b></p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 5: Shape Hierarchy
 */
public class MyTriangle extends MyShape {
  
  /**
   * constructor for objects of class MyTriangle.
   * This creates a MyTriangle instance with a variable height and width.
   * 
   * @param h The <i>height</i> of the triangle.
   * @param w The <i>width</i> of the triangle.
   */
  public MyTriangle(int h, int w) {
    
    super(h, w);
  }
  
  /**
   * Retrieves the name of the object.
   * 
   * @return The <i>name</i> of the object.
   */
  public String getName() {
    
    return "triangle";
  }
  
  /**
   * Retrieves the area of the triangle.
   * 
   * @return The <i>area</i> of the triangle.
   */
  public double getArea() {
   
    // area = (width*height)*0.5.
    return ((getWidth()*getHeight())*0.5);
  }
  
  /**
   * Retrieves the perimeter of the triangle.
   * 
   * @return 0  Cannot calculate the perimeter for a nonspecific type of triangle
   */
  public double getPerimeter( ) {
   
    return 0;
//    // a = width, b = height c = hypotenuse
//    // perimeter = a + b + c
//    // c = sqrt(a^2 + b^2)
//    // perimeter = a + b + (sqrt(a^2 + b^2))
//    return(getWidth() + getHeight() + (Math.sqrt(Math.pow(getWidth(),2) + Math.pow(getHeight(),2))));
  }
}