package view;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Sound {
	
	private double volume = 1.;
	private Media music;
	private MediaPlayer musicPlayer;
	private Media musicGame;
	private MediaPlayer musicPlayerGame;
	
	public Sound() {
		super();
		music = new Media(getClass().getResource("/MenuPrinc.wav").toString());
		musicPlayer = new MediaPlayer(music);
		//musicGame = new Media(getClass().getResource("/gameSound.wav").toString());
		//musicPlayerGame = new MediaPlayer(musicGame);
	}
	
	public void playSound() {
		musicPlayer.setVolume(volume);
		//musicPlayerGame.setCycleCount(MediaPlayer.INDEFINITE);
		musicPlayer.play();
	}
	
	public void playSoundGame() {
		musicPlayerGame.setVolume(volume);
		//musicPlayerGame.setCycleCount(MediaPlayer.INDEFINITE);
		musicPlayerGame.play();
	}
	
	public void stopPlaySound() {
		musicPlayer.stop();
	}
	
	
	public void setVolume(double volume) {
		this.volume = volume;
		musicPlayer.setVolume(volume);
	}

	public double getVolume() {
		return volume;
	}

}
