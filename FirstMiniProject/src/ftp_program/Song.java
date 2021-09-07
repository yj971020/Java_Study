package ftp_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Song {
	
	static Scanner scn = new Scanner(System.in);						
	static Map<String, String> map = new HashMap<String, String>();		
	
	//곡 정보
	private String songName;
	private String albumName;
	private String albumDate;
	
	//아티스트 정보
	private String artistName;


	
	//생성자(노래 관련 정보를 초기화 시켜줌)
	public Song() {}
	
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
	public static int printSong(int a) {
		switch(a) {
		case 1:
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("│\t 곡  이름\t→\tAfrica");
			System.out.println("│\t 앨범 정보\t→\tSaFaRy");
			System.out.println("│\t 발 매 일\t→\t2006.05.21");
			System.out.println("│\t 아티스트\t→\tTOTO");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			return 1;
		case 2:
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("│\t 곡  이름\t→\tAround The World");
			System.out.println("│\t 앨범 정보\t→\tPEACE");
			System.out.println("│\t 발 매 일\t→\t2015.11.22");
			System.out.println("│\t 아티스트\t→\tATC");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			return 2;			
		case 3:
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("│\t 곡  이름\t→\tSweet");
			System.out.println("│\t 앨범 정보\t→\tCandy");
			System.out.println("│\t 발 매 일\t→\t2011.09.11");
			System.out.println("│\t 아티스트\t→\tEvangeline Matthew");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			return 3;
		case 4:
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("│\t 곡  이름\t→\tDon't Speak");
			System.out.println("│\t 앨범 정보\t→\tNO MOUSE");
			System.out.println("│\t 발 매 일\t→\t1998.07.25");
			System.out.println("│\t 아티스트\t→\tNO DOUBT");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			return 4;
		case 5:
			return 0;
		default :
				return 0;
			
		}
	}
	
	public static String selFile(int fileNum) {
		String numfileName = null;
		switch (fileNum) {
		case 1:
			numfileName = "africa-toto.wav";
			break;
		case 2:
			numfileName = "around_the_world-atc.wav";
			break;
		case 3:
			numfileName = "evangeline-matthew_sweet.wav";
			break;
		case 4:
			numfileName = "dont_speak-no_doubt.wav";
			break;
		}
		return numfileName;
	}
	
	
	
}