/*
 * EstouroDePilha
 * Este programa resulta em estouro de pilha se n�o existir o controle
 * das chamadas recursivas no programa, ou se o valor das itera��es 
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
	 * Observa��o: para estouro de mem�ria (da JVM) basta fazer um programa
	 * simples e no m�todo main(), executar a linha:
	 * String[] ss = new String[Integer.MAX_VALUE-1];
	 * O m�ximo de mem�ria da JVM � normalmente 1024kb (para SO 64 bits)
	 * A constante MAX_VALUE (2.147.483.647) � o limite superior para inteiros.
	 * int � um tipo primitivo de 32 bits em Java.
	 * O tipo String tem o comportamento de uma matriz (de tipo char), 
	 * o intervalo m�ximo �: 2147483647. (comprimento m�ximo)
	 */
}
