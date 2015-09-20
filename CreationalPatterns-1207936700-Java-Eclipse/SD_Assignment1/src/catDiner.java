import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class catDiner implements Category{

	@Override
	public HashMap<String, HashSet<foodItems>> getCategory(HashMap<String, HashSet<foodItems>> infile) {
		// TODO Auto-generated method stub

		infile.remove("Dinner");
		infile.remove("Side Dish");
		
		return infile;
	}
	

}
