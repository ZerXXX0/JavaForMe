package Product;

public class Music extends Product{
	private Artist artist;
	public String getDescription() {
		String descriptionOfMusic = super.getDescription();
		return descriptionOfMusic 
				+ "Artist : " + this.artist.getArtistName();
	}
	public Artist getArtist(){
		return artist;
	}
	public void setArtist(Artist artist){
		this.artist = artist;
	}
	@Override
	public String getTwitterDescription(){
		// TODO Auto-generated method stub
		if(this.artist == null) {
			return "Game : " + this.title + " by " + "Unknown";
		}
		else {
			return "Game : " + this.title + " by " + this.getArtist();
		}
	}
}
