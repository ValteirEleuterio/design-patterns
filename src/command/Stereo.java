package command;

public class Stereo {
	private int volume;
	
	public void on() {
		System.out.println("Ligando Stereo!");
	}
	
	public void setCD() {
		System.out.println("CD dos Bar�es da Pisadinha tocando!");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
