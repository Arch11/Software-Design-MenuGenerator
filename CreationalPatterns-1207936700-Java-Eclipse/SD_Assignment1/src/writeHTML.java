import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class writeHTML implements Writer{

	@Override
	public void writeFile(String Country, String Category,HashMap<String, HashSet<foodItems>> inFile) {
		// TODO Auto-generated method stub
		
		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
		    fWriter = new FileWriter(Country + "-Menu-"+ Category+".html");
		    writer = new BufferedWriter(fWriter);
		    writer.write("<HTML>");
		    writer.newLine();
		    writer.write("<HEAD><TITLE>Menu</TITLE></HEAD>");
		    writer.newLine();
		    writer.write("<BODY>");
		    writer.newLine();
		    writer.write("<CENTER>Menu</CENTER>");
		    
		    if(inFile.containsKey("Breakfast"))
			{
				writer.write("<H1>BREAKFAST </H1>");
				writer.write("<UL>");
				
				HashSet<foodItems> itemlist = inFile.get("Breakfast");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems a = (foodItems)iterator.next();
		        	//System.out.print( l.getName() + ", " );
		        	writer.write("<LI>"+a.getName()+"<BR>");
		        	writer.newLine();
		        	writer.write("<I>"+ a.getDes() + "</I>");
		        	writer.newLine();
		        	writer.write("<BR>"+ a.getPrice()+"</LI>");
		        }
		        writer.write("</UL>");
			}
		    
		    if(inFile.containsKey("Snack"))
			{
				writer.write("<H1>SNACK </H1>");
				writer.write("<UL>");
				
				HashSet<foodItems> itemlist = inFile.get("Snack");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems a = (foodItems)iterator.next();
		        	//System.out.print( l.getName() + ", " );
		        	writer.write("<LI>"+a.getName()+"<BR>");
		        	writer.newLine();
		        	writer.write("<I>"+ a.getDes() + "</I>");
		        	writer.newLine();
		        	writer.write("<BR>"+ a.getPrice()+"</LI>");
		        }
		        writer.write("</UL>");
			}
		    if(inFile.containsKey("Appetizer"))
			{
				writer.write("<H1>APPETIZER </H1>");
				writer.write("<UL>");
				
				HashSet<foodItems> itemlist = inFile.get("Appetizer");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems a = (foodItems)iterator.next();
		        	//System.out.print( l.getName() + ", " );
		        	writer.write("<LI>"+a.getName()+"<BR>");
		        	writer.newLine();
		        	writer.write("<I>"+ a.getDes() + "</I>");
		        	writer.newLine();
		        	writer.write("<BR>"+ a.getPrice()+"</LI>");
		        }
		        writer.write("</UL>");
			}
		    if(inFile.containsKey("Lunch"))
			{
				writer.write("<H1>LUNCH </H1>");
				writer.write("<UL>");
				
				HashSet<foodItems> itemlist = inFile.get("Lunch");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems a = (foodItems)iterator.next();
		        	writer.write("<LI>"+a.getName()+"<BR>");
		        	writer.newLine();
		        	writer.write("<I>"+ a.getDes() + "</I>");
		        	writer.newLine();
		        	writer.write("<BR>"+ a.getPrice()+"</LI>");
		        }
		        writer.write("</UL>");
			}
		    if(inFile.containsKey("Dinner"))
			{
				writer.write("<H1>DINNER </H1>");
				writer.write("<UL>");
				
				HashSet<foodItems> itemlist = inFile.get("Dinner");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems a = (foodItems)iterator.next();
		        	//System.out.print( l.getName() + ", " );
		        	writer.write("<LI>"+a.getName()+"<BR>");
		        	writer.newLine();
		        	writer.write("<I>"+ a.getDes() + "</I>");
		        	writer.newLine();
		        	writer.write("<BR>"+ a.getPrice()+"</LI>");
		        }
		        writer.write("</UL>");
			}
		    if(inFile.containsKey("Dessert"))
			{
				writer.write("<H1>DESSERT </H1>");
				writer.write("<UL>");
				
				HashSet<foodItems> itemlist = inFile.get("Dessert");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems a = (foodItems)iterator.next();
		        	//System.out.print( l.getName() + ", " );
		        	writer.write("<LI>"+a.getName()+"<BR>");
		        	writer.newLine();
		        	writer.write("<I>"+ a.getDes() + "</I>");
		        	writer.newLine();
		        	writer.write("<BR>"+ a.getPrice()+"</LI>");
		        }
		        writer.write("</UL>");
			}
		    if(inFile.containsKey("Side Dish"))
			{
				writer.write("<H1>SIDE DISH </H1>");
				writer.write("<UL>");
				
				HashSet<foodItems> itemlist = inFile.get("Side Dish");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	foodItems a = (foodItems)iterator.next();
		        	
		        	writer.write("<LI>"+a.getName()+"<BR>");
		        	writer.newLine();
		        	writer.write("<I>"+ a.getDes() + "</I>");
		        	writer.newLine();
		        	writer.write("<BR>"+ a.getPrice()+"</LI>");
		        }
		        writer.write("</UL>");
			}
		     
		    writer.close(); //close the writer object 
		    System.out.println("File saved!");
		} catch (Exception e) {
		  //catch any exceptions here
		}
		
	}

}
