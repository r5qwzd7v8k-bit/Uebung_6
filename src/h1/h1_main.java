package h1;
public class h1_main {

	

	/**
	* Vergleicht zwei Integer-Arrays lexikographisch.
	* Der Vergleich erfolgt elementweise, bis eine Differenz gefunden wird.
	* Wenn Arrays unterschiedliche Längen haben, gilt das kürzere als "kleiner",
	* wenn es ein Präfix des längeren ist.
	*
	* @param a Das erste Integer-Array.
	* @param b Das zweite Integer-Array.
	* @return
	* - Ein negativer Wert, wenn a "kleiner" als b ist.
	* - 0, wenn a und b gleich sind.
	* - Ein positiver Wert, wenn a "größer" als b ist.
	*/
	public static int compareArrays(int[] a, int[] b) {

	
	int minLaenge = Math.min(a.length, b.length);

	
	for (int i = 0; i < minLaenge; i++) {
	
	if (a[i] != b[i]) {
	return a[i] - b[i];
	}
	}

	 

	
	if (a.length == b.length) {
	return 0;
	} else {
	
	return a.length - b.length;
	}
	}

	
	public static void main(String[] args) {
	
	int[] c1 = {1, 2, 5};
	int[] d1 = {1, 2, 3};
	
	System.out.println("compareArrays({1,2,5}, {1,2,3}): " + compareArrays(c1, d1)); // Erwartet: Positiv (z.B. 2)

	int[] c2 = {1, 2};
	int[] d2 = {1, 2, 3};
	
	System.out.println("compareArrays({1,2}, {1,2,3}): " + compareArrays(c2, d2)); // Erwartet: Negativ (z.B. -1)

	int[] c3 = {1, 2, 3};
	int[] d3 = {1, 2, 3};
	
	System.out.println("compareArrays({1,2,3}, {1,2,3}): " + compareArrays(c3, d3)); // Erwartet: 0

	int[] c4 = {10, 2};
	int[] d4 = {2, 10};
	
	System.out.println("compareArrays({10,2}, {2,10}): " + compareArrays(c4, d4)); // Erwartet: Positiv (z.B. 8)
	}
	}