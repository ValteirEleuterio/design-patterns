package command;

public class Light {
	private String ambiente;
	
	public Light(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public void on() {
		System.out.println("Luz " + ambiente + " acesa!");
	}
	
	public void off() {
		System.out.println("Luz " + ambiente + " apagada!");
	}

}
