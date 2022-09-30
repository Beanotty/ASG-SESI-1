package sesi1;

import java.text.DecimalFormat;

public class Soal10 {
	public static void main (String [] args) {
		double kilo = 14.0;
		double mile = kilo *1.6;
		double minutes = 45.0;
		double sec = 30.0;
		double totalsec = (minutes * 60.0) + sec;
		double hours = totalsec/3600;
		double hasil = mile/hours;
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println ("Rata-rata Kecepatan adalah " + f.format (hasil));
	}
}
