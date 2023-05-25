package sample2;

interface VisaCard
{
	void calculatevisa();
}

interface MasterCard extends VisaCard
{
	void calculatemaster();
	
}
class Cards implements MasterCard
{
	public void calculatevisa()
	{
		System.out.println("Visa Card");
	}
	public void calculatemaster()
	{
		System.out.println("Master Card");
	}
}

public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MasterCard iMaster = new Cards();
		iMaster.calculatevisa();
		iMaster.calculatemaster();
	}

}
