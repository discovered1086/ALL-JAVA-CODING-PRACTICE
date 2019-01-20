package mypractice.memorymanagement.escapingreferences.BookCatalog.improved;

import java.util.HashMap;
import java.util.Map;

public class Price {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}

	public Double convert(String toCurrency) {
		if (toCurrency.equals("USD")) {
			return value;
		}
		else {
			Double conversion = rates.get("USD") / rates.get(toCurrency);
			return conversion * value;
		}
	}
	
	public String toString() {
		return this.value.toString();
	}

	//TODO: Escaping reference here
    //The client should NOT need the whole reference to the map. They
    //Might want specific items of the map
	public Double getRates(String key) {
		return rates.get(key);
	}
	
}
