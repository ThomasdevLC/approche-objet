package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		String dateConvertie = formater.format(d);
		System.out.println(dateConvertie);
		
		Date oldDate = new Date(116,4,19,23,59,30);
		System.out.println(oldDate);
		
		SimpleDateFormat oldformater = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String oldDateConvertie = oldformater.format(oldDate);
		System.out.println(oldDateConvertie);

	}
}
