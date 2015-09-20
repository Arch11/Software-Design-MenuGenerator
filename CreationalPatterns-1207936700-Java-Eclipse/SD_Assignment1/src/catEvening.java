import java.util.HashMap;
import java.util.HashSet;


public class catEvening implements Category{

	@Override
	public HashMap<String, HashSet<foodItems>> getCategory(HashMap<String,HashSet<foodItems>> infile) {
		// TODO Auto-generated method stub
		infile.remove("Breakfast");
		infile.remove("Snack");
		infile.remove("Lunch");
		return infile;
	}

}
