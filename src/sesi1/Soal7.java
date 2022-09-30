package sesi1;

public class Soal7 {
	public static void main (String [] args) {
		double val1 = 1.0/3.0, val2 = 1.0/5.0 ,val3 = 1.0/7.0,val4 = 1.0/9.0 ,val5 = 1.0/11.0,val6 = 1.0/13.0;	
		System.out.println ("pi pertama  = " + 4 * (val1 + val2 - val3 + val4 - val5));
		System.out.println ("pi kedua    = " + 4 * (val1 + val2 - val3 + val4 - val5 + val6));
	}
}
