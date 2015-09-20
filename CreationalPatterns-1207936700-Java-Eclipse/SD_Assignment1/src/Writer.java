import java.util.HashMap;
import java.util.HashSet;


public interface Writer {
	void writeFile(String Country, String Category,HashMap<String, HashSet<foodItems>> inFile);
}
