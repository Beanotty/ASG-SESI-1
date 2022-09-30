package sesi1;

import java.text.DecimalFormat;

public class Soal9 {
	public static void main(String [] args) {
		double perimeter, area, width = 4.5, height = 7.9 ;
		perimeter  = 2 * (height + width);
		area = height * width;
		DecimalFormat f = new DecimalFormat("##.00");

		System.out.println ("perimeter  = " + perimeter);
		System.out.println ("area       = " + f.format (area));
	}
}
