package sesi1;

public class Soal6 {
	public static void main (String [] args) {
		int num = 1;
		int hasil = 0;
		while (num <=9) {
			hasil = num + hasil;
			num++;
		}
		System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + hasil);
	}
}
