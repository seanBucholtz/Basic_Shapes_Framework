/**
 * <p>The purpose of this class is to create a <i>virtual</i> rhombus
 * with variable dimensions.</p>
 * 
 * <p><u>Grading level</u>: <b>Challenge</b></p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 5: Shape Hierarchy
 */
public class MyRhombus extends MyRectangle {
 
  /**
   * constructor for objects of class MyRhombus.
   * This creates a MyRhombus instance with a variable height and width.
   * 
   * @param h The <i>height</i> of the rhombus.
   * @param w The <i>width</i> of the rhombus.
   */
  public MyRhombus(int h, int w){
   
    
    super(h, (int)(Math.sqrt(Math.pow(w*0.5, 2) + Math.pow(h*0.5, 2)))); 
  }
  
  /**
   * Retrieves the name of the object.
   * 
   * @return The <i>name</i> of the object.
   */
  public String getName() {
      
    return "rhombus";
   }
  
  /**
   * Retrieves the area of the rhombus.
   * 
   * @return The <i>area</i> of the rhombus.
   */
  public double getArea() {
   
    // area = (side)^2
    // side = sqrt[(width/2)^2 + (height/2)^2]
    // area = {sqrt[(width/2)^2 + (height/2)^2]}^2
    return Math.pow((Math.sqrt(Math.pow(getWidth()*0.5, 2) + Math.pow(getHeight()*0.5, 2))), 2);
  }
  
  /**
   * Retrieves the perimeter of the rhombus.
   * 
   * @return The <i>perimeter</i> of the rhombus.
   */
  public double getPerimeter( ) {
   
    // perimeter = side * 4
    // side = sqrt[(width/2)^2 + (height/2)^2]
    // perimeter = {sqrt[(width/2)^2 + (height/2)^2]}*4
    return 4*(Math.sqrt(Math.pow(getWidth()*0.5, 2) + Math.pow(getHeight()*0.5, 2)));
  }
}