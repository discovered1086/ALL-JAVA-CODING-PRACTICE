package mypractice.inheritance;

public   class Converter implements Conversions {
  public double inchesToMillimeters(double inches) {
		    return inches * INCH_TO_MM;
  }

  public double ouncesToGrams(double ounces) {
		    return ounces * OUNCE_TO_GRAM;
  }

}