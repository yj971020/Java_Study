package chatting_programming;

public class Song {

	//곡 정보
	private String songName;
	private String albumName;
	private String albumDate;
	
	//아티스트 정보
	private String artistName;

	//생성자(노래 관련 정보를 초기화 시켜줌)
	public Song(String songName, String albumName, String albumDate, String artistName) {
	this.songName = songName;
	this.albumName = albumName;
	this.albumDate = albumDate;
	this.artistName = artistName;
	}
	
	
	//getter & setter
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getAlnumDate() {
		return albumDate;
	}

	public void setAlnumDate(String alnumDate) {
		this.albumDate = alnumDate;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	//Song 객체 print시 하기 형식으로 출력 하도록 오버라이딩
	@Override
	public String toString() {
		return 
				"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
			+   "│\t 곡    이름  → "+ songName+ "\n"
			+   "│\t 앨범 정보  → "+ albumName+ "\n"
			+   "│\t 발  매  일  → "+ albumDate+ "\n"
			+   "│\t 아티스트   → "+ artistName+ "\n"
			+   "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n";
	}

}
