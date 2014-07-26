/**
 * <p>The purpose of this class is to create a <i>virtual</i> circle
 * with variable dimensions.</p>
 * 
 * <p><u>Grading level</u>: <b>Challenge</b></p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 5: Shape Hierarchy
 */
public class MyCircle extends MyEllipse {

  /**
   * constructor for objects of class MyCircle.
   * This creates a MyCircle instance with a variable diameter
   * 
   * @param d The <i>diameter</i> of the circle.
   */
  public MyCircle(int d) {
    
    super(d, d);
  }
  
  /**
   * Retrieves the name of the object.
   * 
   * @return The <i>name</i> of the object.
   */
  public String getName() {
    
    return "circle";
  }
  
  /**
   * Retrieves the area of the circle.
   * 
   * @return The <i>area</i> of the circle.
   */
  public double getArea() {

    // area = π(r)^2
    // r = diameter/2
    // area = π(diameter/2)^2
    return Math.pow(getWidth()/2.0, 2)*Math.PI;
  }
  
  /**
   * Retrieves the perimeter of the circle.
   * 
   * @return The <i>perimeter</i> of the circle.
   */
  public double getPerimeter( ) {
   
    // perimater = 2πr
    // 2r = diameter
    // perimeter = π(diameter)
    return getWidth()*Math.PI;
  }
}