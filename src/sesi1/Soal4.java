package sesi1;

public class Soal4 {
	public static void main (String [] args ) {
		System.out.println ("a    a^2    a^3");
		int num = 1;
		for (int i =0; i<4; i++) {
			for (int j = 1; j<=3;j++) {
				System.out.print((int) Math.pow(num, j) + "     ");
			}
			System.out.println();
			num ++;
		}
	}
}
