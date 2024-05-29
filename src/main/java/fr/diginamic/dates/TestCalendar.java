package fr.diginamic.dates;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2024,4,19,23,59,30);
		Date d2 = cal.getTime();
		System.out.println(d2);
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateConvertie = formater.format(d2);
		System.out.println(dateConvertie);
		
		Calendar today = Calendar.getInstance();
        Date d3 = today.getTime();
        System.out.println("Date actuelle : " + d3);

        SimpleDateFormat todayFormatter = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss");

        // Français
        todayFormatter.setDateFormatSymbols(new DateFormatSymbols(Locale.FRENCH));
        String frenchDate = todayFormatter.format(d3);
        System.out.println("Date en français : " + frenchDate);

        // Russe
        todayFormatter.setDateFormatSymbols(new DateFormatSymbols(new Locale("ru", "RU")));
        String russianDate = todayFormatter.format(d3);
        System.out.println("Date Russe : " + russianDate);

        // Chinois
        todayFormatter = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINESE);
        String chineseDate = todayFormatter.format(d3);
        System.out.println("Date en chinois : " + chineseDate);

        // Allemand
        todayFormatter = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMAN);
        String germanDate = todayFormatter.format(d3);
        System.out.println("Date en Allemand : " + germanDate);
	}

}
