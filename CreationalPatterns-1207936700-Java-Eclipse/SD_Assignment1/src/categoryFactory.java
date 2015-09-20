
public class categoryFactory extends AbstractFactory {


	@Override
	Reader getFile(String R_file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Category getCat(String category) {
		// TODO Auto-generated method stub
		if(category.equals("Diner"))
			return new catDiner();
		else if(category.equals("Evening Only"))
			return new catEvening();
		else if(category.equals("ALL Day"))
			return new catAllDay();
	
		return null;
	}

	@Override
	Writer writeFILE(String W_file) {
		// TODO Auto-generated method stub
		return null;
	}
}
