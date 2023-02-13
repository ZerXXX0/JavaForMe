package user;

public class PremiumMember extends Customer {
	private double bonus = 10;
	
	public PremiumMember(String lastName,String firstName) {
		super(lastName,firstName);
		this.minimumOrderValue = this.minimumOrderValue - bonus;
	}
}