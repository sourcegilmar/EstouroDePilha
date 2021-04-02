/*
 * EstouroDePilha
 * Este programa resulta em estouro de pilha se não existir o controle
 * das chamadas recursivas no programa, ou se o valor das iterações 
 * for muito alto.
 */
public class EstouroDePilha {
	static int q = 0;
	public static void main(String[] args) {
		boo();
	}	
	public static void boo() {
		q++;
		// Put a lower valor to q in order to avoid:
		// Exception in thread "main" java.lang.StackOverflowError
		if (q>250000)
			System.exit(0);
		boo();
	}	
}
