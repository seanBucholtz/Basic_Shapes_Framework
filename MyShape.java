/**
 * <p>The purpose of this class is to create a base <i>shape</i> object
 * with variable dimensions.</p>
 * 
 * <p><u>Grading level</u>: <b>Challenge</b></p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 5: Shape Hierarchy
 */
public class MyShape {
   
  // field variables
   protected int height;
   protected int width;
   
  /**
   * constructor for objects of class MyShape.
   * This creates a MyShape instance with a variable height and width.
   * 
   * @param h The <i>height</i> of the shape.
   * @param w The <i>width</i> of the shape.
   */
   public MyShape(int h, int w) {
      height = h;
      width = w;
   }
   
  /**
   * Retrieves the height of the shape.
   * 
   * @return the <i>height</i> of the shape.
   */
   public int getHeight() {
      
     return height;
   }
   
  /**
   * Retrieves the width of the shape.
   * 
   * @return the <i>width</i> of the shape.
   */
   public int getWidth() {
      
     return width;
   }
   
  /**
   * Retrieves the name of the shape.
   * 
   * @return the <i>name</i> of the shape.
   */
   public String getName() {
      
     return "shape";
   }
   
  /**
   * Retrieves the area of the shape.
   * 
   * @return <i>null</i>
   */
   public double getArea() {
     
     return 0;
   }
   
  /**
   * Retrieves the perimeter of the shape.
   * 
   * @return <i>null</i>
   */
   public double getPerimeter( ) {
     
     return 0;
   }
   
}