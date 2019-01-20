package mypractice.inheritance;

public interface Conversions
extends ConversionFactors {
	 // double INCH_TO_MM = 25.4;

	  double OUNCE_TO_GRAM = 28.349523125;

	  double POUND_TO_GRAM = 453.5924;

	  double HP_TO_WATT = 745.7;

	   public static final double WATT_TO_HP = 1.0 / HP_TO_WATT;

	  public abstract double inchesToMillimeters(double inches);

	  double ouncesToGrams(double ounces);

	}