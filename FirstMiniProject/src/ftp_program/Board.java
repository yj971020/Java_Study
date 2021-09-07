package ftp_program;

public class Board {

	private String song;
	
	
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	
	@Override
	public String toString() {
		return this.song;
	}
	
	
}
