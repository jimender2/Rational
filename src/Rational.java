public class Rational {
	private double length;
	private double width;
	
	/**
	 * The setLength method stores a value in
	 * the length field
	 * @param len The value to store in length
	 */
	public void setLength(double len){
		length = len;
		
	}
	
	/**
	 * The setWidth method stores a value in
	 * the length field
	 * @param wid The value to store in width
	 */
	public void setWidth(double wid){
		width = wid;
	}
	
	/**
	 * The getLength method returns the
	 * length of the Rectangle object
	 * @return The length of the object
	 */
	public double getLength(){
		return length;
	}
	
	/**
	 * The getWidth method returns the
	 * width of the Rectangle object
	 * @return The width of the object
	 */
	public double getWidth(){
		return width;
	}
	
	/**
	 * The getArea method returns the
	 * area of the Rectangle object
	 * @return The calculated area of the Rectangle
	 */
	public double getArea(){
		return( length * width );
	}
	
}
