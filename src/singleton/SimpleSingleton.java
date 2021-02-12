package singleton;

public class SimpleSingleton {
	
	private static SimpleSingleton uniqueInstance;
	
	private SimpleSingleton() {}
	
	/*sincronizamos o método inteiro mas dependendo da aplicação isto pode ser muito custozo para o desempenho*/
	public static synchronized SimpleSingleton getInstance()  {
		if (uniqueInstance == null) {
			uniqueInstance = new SimpleSingleton();
		}
		
		return uniqueInstance;
	}
}
