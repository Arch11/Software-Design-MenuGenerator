import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;



public class writeText implements Writer {

	private String path;
	@Override
	public void writeFile(String Country, String Category,HashMap<String, HashSet<foodItems>> inFile) {
		// TODO Auto-generated method stub
		path = Country + "-Menu-"+ Category+".txt";
		FileWriter write;
		try {
			write = new FileWriter(path,false);
			PrintWriter print_line = new PrintWriter(write);
			
			if(inFile.containsKey("Breakfast"))
			{
				print_line.printf("%s"+ "%n"+"%n", "BREAKFAST ");
				HashSet<foodItems> itemlist = inFile.get("Breakfast");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems a = (foodItems)iterator.next();
		        	
		        	print_line.printf("%s \t \t \t \t \t %s" + "%n", a.getName(),a.getPrice());
		        	print_line.printf("%s " + "%n" + "%n",a.getDes());
		        }
			}
			if(inFile.containsKey("Snack"))
			{
				print_line.printf("%n"+"%s"+ "%n"+"%n", "SNACK ");
				HashSet<foodItems> itemlist = inFile.get("Snack");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems l = (foodItems)iterator.next();
		        	
		        	print_line.printf("%s \t \t \t \t \t %s" + "%n", l.getName(),l.getPrice());
		        	print_line.printf("%s " + "%n" + "%n",l.getDes());
		        }
			}
			
			if(inFile.containsKey("Appetizer"))
			{
				print_line.printf("%n"+"%s"+ "%n"+"%n", "APPETIZER ");
				HashSet<foodItems> itemlist = inFile.get("Appetizer");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems b = (foodItems)iterator.next();
		        	
		        	print_line.printf("%s \t \t \t \t \t %s" + "%n", b.getName(),b.getPrice());
		        	print_line.printf("%s " + "%n" + "%n",b.getDes());
		        }
			}
			
			if(inFile.containsKey("Lunch"))
			{
				print_line.printf("%n"+"%s"+ "%n"+"%n", "LUNCH ");
				HashSet<foodItems> itemlist = inFile.get("Lunch");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems l = (foodItems)iterator.next();
		        	
		        	print_line.printf("%s \t \t \t \t \t %s" + "%n", l.getName(),l.getPrice());
		        	print_line.printf("%s " + "%n" + "%n",l.getDes());
		        }
			}
			
			if(inFile.containsKey("Dinner"))
			{
				print_line.printf("%n"+"%s"+ "%n"+"%n", "DINNER ");
				HashSet<foodItems> itemlist = inFile.get("Dinner");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems l = (foodItems)iterator.next();
		        	
		        	print_line.printf("%s \t \t \t \t \t %s" + "%n", l.getName(),l.getPrice());
		        	print_line.printf("%s " + "%n" + "%n",l.getDes());
		        }
			}
			
			if(inFile.containsKey("Dessert"))
			{
				print_line.printf("%n"+"%s"+ "%n"+"%n", "DESSERT ");
				HashSet<foodItems> itemlist = inFile.get("Dessert");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems l = (foodItems)iterator.next();
		        
		        	print_line.printf("%s \t \t \t \t \t %s" + "%n", l.getName(),l.getPrice());
		        	print_line.printf("%s " + "%n" + "%n",l.getDes());
		        }
			}
			if(inFile.containsKey("Side Dish"))
			{
				print_line.printf("%n"+"%s"+ "%n"+"%n", "SIDE DISH ");
				HashSet<foodItems> itemlist = inFile.get("Side Dish");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems l = (foodItems)iterator.next();
		        
		        	print_line.printf("%s \t \t \t \t \t %s" + "%n", l.getName(),l.getPrice());
		        	print_line.printf("%s " + "%n" + "%n",l.getDes());
		        }
			}
			
			print_line.close();
			System.out.println("File saved!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
