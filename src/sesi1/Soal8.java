package sesi1;

public class Soal8 {
	public static void main (String [] args) {
		double perimeter, area, radius = 5.5;
		perimeter  = 2 * radius * Math.PI;
		area = Math.pow(radius, 2) * Math.PI;
		
		System.out.println ("perimeter  = " + perimeter);
		System.out.println ("area       = " + area);
	}
}
