public class Rational {
	private int numerator;
	private int denominator;
	
	/**
	 * The setNumerator method stores a value in
	 * the numerator field
	 * @param num The value to store in numerator
	 */
	public void setNumerator(int num){
		numerator = num;
	}
	
	/**
	 * The setDenominator method stores a value in
	 * the denominator field
	 * @param den The value to store in denominator
	 */
	public void setWidth(int den){
		denominator = den;
	}
	
	/**
	 * The getNumerator method returns the
	 * numerator of the Rational object
	 * @return The numerator of the object
	 */
	public int getNumerator(){
		return numerator;
	}
	
	/**
	 * The getDenominator method returns the
	 * width of the  object
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
