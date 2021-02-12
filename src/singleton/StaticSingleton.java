package singleton;

public class StaticSingleton {
	
	//se a cria��o do singleton n�o for custosa ent�o podemos inicialo dessa maneira
	private static StaticSingleton uniqueInstance = new StaticSingleton();
	
	private StaticSingleton() {}	
	
	// dessa forma o m�todo getinstance n�o precisa ser sincronizado
	public static StaticSingleton getInstance() {
		return uniqueInstance;
	}

}
