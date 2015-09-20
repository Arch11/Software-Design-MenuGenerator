
public class foodItems {
	String name;
	String description;
	String category;
	String price;
	
	foodItems(String namec, String desc, String catc, String pricec)
	{
		name= namec;
		description = desc;
		category = catc;
		price = pricec;
	}
	

	public String getName(){return name;}
	public String getDes(){return description;}
	public String getCat(){return category;}
	public String getPrice(){return price;}
}
