/**
 * <p>The purpose of this class is to create a <i>virtual</i> rectangle
 * with variable dimensions.</p>
 * 
 * <p><u>Grading level</u>: <b>Challenge</b></p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 5: Shape Hierarchy
 */
public class MyRectangle extends MyShape {
  
  /**
   * constructor for objects of class MyRectangle.
   * This creates a MyRectangle instance with a variable height and width.
   * 
   * @param h The <i>height</i> of the rectangle.
   * @param w The <i>width</i> of the rectangle.
   */
  public MyRectangle(int h, int w){
   
    super(h, w); 
  }
  
  /**
   * Retrieves the name of the object.
   * 
   * @return The <i>name</i> of the object.
   */
  public String getName() {
      
    return "rectangle";
   }
  
  /**
   * Retrieves the area of the Rectangle.
   * 
   * @return The <i>area</i> of the Rectangle.
   */
  public double getArea() {
   
    // area = height * width
    return getWidth() * getHeight();
  }
  
  /**
   * Retrieves the perimeter of the rectangle.
   * 
   * @return The <i>perimeter</i> of the rectangle.
   */
  public double getPerimeter( ) {
   
    return 2*(getHeight() + getWidth());
  }
}