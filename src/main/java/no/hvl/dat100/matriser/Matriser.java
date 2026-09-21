package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] matrise1 : matrise){
			for(int matriseTall2 : matrise1){
				System.out.println("Liste " + matrise1 + " element " + matriseTall2);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String representasjon = "";

		for (int[] rad : matrise) {
			for (int i = 0; i < rad.length; i++) {

				representasjon += rad[i];

				if (i < rad.length - 1) {
					representasjon += " ";
				}
			}

			representasjon += "\n";
		}

		return representasjon;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = matrise.clone();

		for(int i = 0; i < matrise.length; i++){
			for(int j = 0; j < matrise[i].length; j++){
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return  nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if(a.length != b.length) {

			return false;
		}

		for (int i = 0; i < a.length; i ++) {
			
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

    	int[][] resultat = new int[a.length][b[0].length];

    	for (int i = 0; i < a.length; i++) {

        	for (int j = 0; j < b[0].length; j++) {

            	for (int k = 0; k < a[i].length; k++) {

                resultat[i][j] += a[i][k] * b[k][j];
            	}
        	}
    	}

    	return resultat;
	}
}