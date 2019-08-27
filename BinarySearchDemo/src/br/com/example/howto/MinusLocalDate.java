package br.com.example.howto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MinusLocalDate {

	public static void main(String[] args) {
		// create a LocalDate object
		LocalDate zonedlt = LocalDate.parse("2018-12-06");

		// subtract 12 Years to LocalDate
		LocalDate value = zonedlt.minus(1, ChronoUnit.YEARS);

		// print result
		System.out.println("LocalDate after " + "subtracting Months: " + value);
	}
}
