package sesi1;

public class Soal11 {
	public static void main(String[] args) {
		int year = 1;
		double secperday = 3600.0;
		double born = secperday/7;
		double death = secperday/13;
		double immi = secperday/45;
		double pop = 312032486.0;

		while (year <=5) {
			pop = pop + 365 * (born + immi - death);
			Math.round(pop);
			System.out.println("Populasi Tahun " + year + " = " + pop);
			year++;
		}
	}
}
