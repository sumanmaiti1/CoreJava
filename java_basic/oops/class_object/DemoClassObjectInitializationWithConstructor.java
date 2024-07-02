package corejava.java_basic.oops.class_object;

public class DemoClassObjectInitializationWithConstructor{
	public static void main(String... arga){
		Song s1 = new Song(101,"Shree Krishna Govinda Hare Murare","Sonu Nigam","Sonu Devotion");
		Song s2 = new Song(102,"Madhurastakam","Shreya Ghosal","Krishna Bhakti");
		
		s1.showSongDetails();
		s2.showSongDetails();
	}
}


class Song{
	int songID;
	String songName;
	String singerName;
	String albumName;
	
	//------ This is constructor. It must have same name4 as class name ------
	Song(int id, String name, String singer, String album){
		songID = id;
		songName = name;
		singerName = singer;
		albumName = album;
	}
	
	//------ This is method of the class ------
	void showSongDetails(){
		System.out.println("Song Details :\n-------------------------------------------");
		System.out.println("Song ID : " + songID);
		System.out.println("Song Name : " + songName);
		System.out.println("Singer Name : " + singerName);
		System.out.println("Album Name : " + albumName);
		System.out.println("-------------------------------------------");
	}
}