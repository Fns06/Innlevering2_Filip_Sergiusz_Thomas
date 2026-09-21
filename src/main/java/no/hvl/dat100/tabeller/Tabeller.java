package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print(tabell);
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {
		int nummer = 0;
		int sum = 0;
		while (nummer < tabell.length) {
			sum += tabell[nummer];
			nummer++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int tallet = 0;
		for (int i = 0; i < tabell.length;i++){
			if (tabell[i] == tall){
				tallet = tall;
			}
			else{
				tallet = -1;
			}
		}
		return tallet;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean erStigende = true;

		//tabell.length + 1 fordi den sjekker i+1, noe som ikke kan være null
		for(int i = 0; i < tabell.length + 1; i++){
			if(tabell[i] > tabell[i+1]){
				erStigende = false;
			}
		}

		return erStigende;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
