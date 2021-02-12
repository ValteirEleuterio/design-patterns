package singleton;

/*trava duplamente verificada para reduzir o uso da sincroniza��o em getInstance*/
public class DoubleCheckedSingleton {
	/*
	 * a palavra 'volatile' garante que vario segmentos lidem com a variavel uniqueInstance corretamente
	 * */
	private volatile static DoubleCheckedSingleton uniqueInstance;
	
	private DoubleCheckedSingleton() {}
	
	public static DoubleCheckedSingleton getInstance() {
		if (uniqueInstance == null) {
			//observer que esta sendo sincronizado apenas uma vez, depois que a instancia � criada n�o � necess�rio sincronizar
			synchronized (DoubleCheckedSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DoubleCheckedSingleton();
				}
			}
		}
		
		return uniqueInstance;
	}

}
