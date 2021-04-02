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
		// Put a lower value to q in order to avoid:
		// Exception in thread "main" java.lang.StackOverflowError
		if (q>250000)
			System.exit(0);
		boo();
	}	
	/*
	 * Observação: para estouro de memória (da JVM) basta executar a linha:
	 * String[] ss = new String[Integer.MAX_VALUE-1];
	 * O máximo de memória da JVM é normalmente 1024kb (para SO 64 bits)
	 * A constante MAX_VALUE (2.147.483.647) para inteiros, em Java (32 bits).
	 */
}
