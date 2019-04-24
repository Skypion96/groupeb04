package model;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Sound {
	
	private double volume;
	private Media music;
	private MediaPlayer musicPlayer;
	
	public Sound() {
		super();
		music = new Media(getClass().getResource("/MenuPrinc.wav").toString());
		musicPlayer = new MediaPlayer(music);
	}
	
	public void playSound() {
		volume = 1.;
		musicPlayer.setVolume(volume);
		musicPlayer.play();
	}
	
	
	public void setVolume(double volume) {
		this.volume = volume;
		musicPlayer.setVolume(volume);
	}

	public double getVolume() {
		return volume;
	}

}
