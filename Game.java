package Product;

public class Game extends Product{
	private String developer;
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	@Override
	public String getTwitterDescription(){
		// TODO Auto-generated method stub
		if(this.developer == null) {
			return "Game : " + this.title + " by " + "Unknown";
		}
		else {
			return "Game : " + this.title + " by " + this.getDeveloper();
		}
	}
}
