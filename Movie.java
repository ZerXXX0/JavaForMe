package Product;

public class Movie extends Product{
	private Director director;
	public String getDescription() {
		String descriptionOfMovie = super.getDescription();
		return descriptionOfMovie 
				+ "Director : " + this.director.getDirectorName();
	}
	public Director getDirector(){
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	@Override
	public String getTwitterDescription(){
		// TODO Auto-generated method stub
		if(this.director == null) {
			return "Game : " + this.title + " by " + "Unknown";
		}
		else {
			return "Game : " + this.title + " by " + this.getDirector();
		}
	}
}

