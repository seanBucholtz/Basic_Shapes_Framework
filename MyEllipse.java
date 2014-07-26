/**
 * <p>The purpose of this class is to create a <i>virtual</i> ellipse
 * with variable dimensions.</p>
 * 
 * <p><u>Grading level</u>: <b>Challenge</b></p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 5: Shape Hierarchy
 */
public class MyEllipse extends MyShape {
  
  /**
   * constructor for objects of class MyEllipse.
   * This creates a MyEllipse instance with a variable height and diameter.
   * 
   * @param h The <i>height</i> of the ellipse.
   * @param d The <i>diameter</i> of the ellipse.
   */
  public MyEllipse(int h, int d) {
   
    super(h, d);
  }
  
  /**
   * Retrieves the name of the object.
   * 
   * @return The <i>name</i> of the object.
   */
  public String getName() {
    
    return "ellipse";
  }
  
  /**
   * Retrieves the area of the ellipse.
   * 
   * @return The <i>area</i> of the ellipse.
   */
  public double getArea() {
  
    // area = 1/4(a*b)π. 
    return (0.25*(getWidth()*getHeight())*Math.PI);
  }
  
  /**
   * Retrieves the perimeter of the ellipse.
   * 
   * @return The <i>perimeter</i> of the ellipse.
   */
  public double getPerimeter( ) {
   
    // Perimeter ≈ 1/2π[3(width + height) − √(3width + height)(width + 3height)]
    return 0.5*Math.PI*((3*(getWidth()+getHeight()))-(Math.sqrt((3*getWidth()+getHeight())*(getWidth()+getHeight()*3)))); 
  }
}