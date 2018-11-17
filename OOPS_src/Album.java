import java.security.BasicPermission;

public class Album {
	private String title, artist;
	
	static {
		System.out.println("Album loaded...ready to play");
	}
	
	public Album() {
		this("Untitled","Anonymous");
	}

	public Album(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Album: " + title + "\tArtist: " +artist;
	}
	
	private void print() {
		SecurityManager mgr = new SecurityManager();
			mgr.checkPermission(new BasicPermission("Private Method") {
			});
		System.out.println("Album: " + title + "\tArtist:" +artist);
	}
	
	
	

}
