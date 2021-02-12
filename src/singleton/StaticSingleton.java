package singleton;

public class StaticSingleton {
	
	//se a criação do singleton não for custosa então podemos inicialo dessa maneira
	private static StaticSingleton uniqueInstance = new StaticSingleton();
	
	private StaticSingleton() {}	
	
	// dessa forma o método getinstance não precisa ser sincronizado
	public static StaticSingleton getInstance() {
		return uniqueInstance;
	}

}
