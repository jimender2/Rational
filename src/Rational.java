public class Rational {
	private int numerator;
	private int denominator;
	
	/**
	 * The setLength method stores a value in
	 * the length field
	 * @param len The value to store in length
	 */
	public void setLength(int num){
		numerator = num;
	}
	
	/**
	 * The setWidth method stores a value in
	 * the length field
	 * @param wid The value to store in width
	 */
	public void setWidth(int den){
		denominator = den;
	}
	
	/**
	 * The getLength method returns the
	 * length of the Rectangle object
	 * @return The length of the object
	 */
	public int getNumerator(){
		return numerator;
	}
	
	/**
	 * The getWidth method returns the
	 * width of the Rectangle object
	 * @return The width of the object
	 */
	public int getDenominator(){
		return denominator;
	}
	
	/**
	 * The getArea method returns the
	 * area of the Rectangle object
	 * @return The calculated area of the Rectangle
	 */
	public double getArea(){
		return( ((double)(numerator) / (double)(denominator)) );
	}
	
}
