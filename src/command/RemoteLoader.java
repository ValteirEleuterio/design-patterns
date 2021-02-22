package command;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light luzDaSala = new Light("SALA");
		Light luzDaCozinha = new Light("COZINHA");
		Stereo stereo = new Stereo();
		
		LightOnCommand luzDaSalaOnCommand = new LightOnCommand(luzDaSala);
		LightOffCommand luzDaSalaOffCommand = new LightOffCommand(luzDaSala);
		
		LightOnCommand luzDaCozinhaOnCommand = new LightOnCommand(luzDaCozinha);
		LightOffCommand luzDaCozinhaOffCommand = new LightOffCommand(luzDaCozinha);
		
		StereoOnWithCDCommand stereoOnCommand = new StereoOnWithCDCommand(stereo);
		
		remoteControl.setCommand(0, luzDaSalaOnCommand, luzDaSalaOffCommand);
		remoteControl.setCommand(1, luzDaCozinhaOnCommand, luzDaCozinhaOffCommand);
		remoteControl.setCommand(2, stereoOnCommand, new NoCommand());
	
		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(0);
		remoteControl.offButtonWasPushed(1);
	}

}
