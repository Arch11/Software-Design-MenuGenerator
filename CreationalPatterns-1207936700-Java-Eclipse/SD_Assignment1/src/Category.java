import java.util.HashMap;
import java.util.HashSet;


public interface Category {
	public HashMap<String, HashSet<foodItems>> getCategory(HashMap<String,HashSet<foodItems>> infile);
}
