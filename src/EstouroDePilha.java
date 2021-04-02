
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
