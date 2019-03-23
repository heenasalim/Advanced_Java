package pk;

public class AlbumInfoAction{

	private String title;
	private Artist artist;
	
	public String populate()
	{
		title = "Thriller";
		artist = new Artist("Michael Jackson","King of pop");
		return "populate";
	}
	
	public String execute()
	{
		return "success";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
}
