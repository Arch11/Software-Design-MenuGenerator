
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class readerJSON implements Reader {

	@Override
	public HashMap<String,HashSet<foodItems>> getReader(String c) {
		// TODO Auto-generated method stub
		HashMap<String,HashSet<foodItems>> foodset= new HashMap<String,HashSet<foodItems>>();

		HashSet<foodItems> Items = new HashSet<foodItems>();
		HashSet<foodItems> Items1 = new HashSet<foodItems>();
		HashSet<foodItems> Items2 = new HashSet<foodItems>();
		HashSet<foodItems> Items3 = new HashSet<foodItems>();
		HashSet<foodItems> Items4 = new HashSet<foodItems>();
		HashSet<foodItems> Items5 = new HashSet<foodItems>();
		HashSet<foodItems> Items6 = new HashSet<foodItems>();

		JSONParser parser = new JSONParser();
		try {
            System.out.println("Reading JSON file from Java program");
            FileReader fileReader = new FileReader("FoodItemData(1).json");
            JSONObject json = (JSONObject) parser.parse(fileReader);
            JSONArray ch =  (JSONArray) json.get("FoodItemData");
            
            Iterator it = ch.iterator();
            int i =0;
            while (it.hasNext()) {
            	JSONObject element =   (JSONObject) ch.get(i);

            	if(element.get("-country").equals(c))
            	{
            		if(element.get("category").equals("Breakfast"))
            		{
            			Items.add(new foodItems(element.get("name").toString(),element.get("description").toString(),element.get("category").toString(),element.get("price").toString()));
						foodset.put("Breakfast",Items);
            		}
            		else if(element.get("category").equals("Snack"))
            		{
            			Items1.add(new foodItems(element.get("name").toString(),element.get("description").toString(),element.get("category").toString(),element.get("price").toString()));
						foodset.put("Snack",Items1);
            		}
            		else if(element.get("category").equals("Appetizer"))
            		{
            			Items2.add(new foodItems(element.get("name").toString(),element.get("description").toString(),element.get("category").toString(),element.get("price").toString()));
						foodset.put("Appetizer",Items2);
            		}
            		else if(element.get("category").equals("Lunch"))
            		{
            			Items3.add(new foodItems(element.get("name").toString(),element.get("description").toString(),element.get("category").toString(),element.get("price").toString()));
						foodset.put("Lunch",Items3);
            		}
            		else if(element.get("category").equals("Dinner"))
            		{
            			Items4.add(new foodItems(element.get("name").toString(),element.get("description").toString(),element.get("category").toString(),element.get("price").toString()));
						foodset.put("Dinner",Items4);
            		}
            		else if(element.get("category").equals("Dessert"))
            		{
            			Items5.add(new foodItems(element.get("name").toString(),element.get("description").toString(),element.get("category").toString(),element.get("price").toString()));
						foodset.put("Dessert",Items5);
            		}
            		else if(element.get("category").equals("Side Dish"))
            		{
            			Items6.add(new foodItems(element.get("name").toString(),element.get("description").toString(),element.get("category").toString(),element.get("price").toString()));
						foodset.put("Side Dish",Items6);
            		}
            	}
            	it.next();i++;
            }
            return foodset;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		    return null;
	}	
}