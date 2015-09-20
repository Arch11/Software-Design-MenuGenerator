
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator; 

public class readerXML implements Reader {


	@Override
	public HashMap<String,HashSet<foodItems>> getReader(String c) {
		// TODO Auto-generated method stub
		 try {
				File fXmlFile = new File("FoodItemData.xml");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
			 
				doc.getDocumentElement().normalize();
			    
				HashMap<String,HashSet<foodItems>> foodset= new HashMap<String,HashSet<foodItems>>();

				NodeList nList = doc.getElementsByTagName("FoodItem");
				
				HashSet<foodItems> Items = new HashSet<foodItems>();
				HashSet<foodItems> Items1 = new HashSet<foodItems>();
				HashSet<foodItems> Items2 = new HashSet<foodItems>();
				HashSet<foodItems> Items3 = new HashSet<foodItems>();
				HashSet<foodItems> Items4 = new HashSet<foodItems>();
				HashSet<foodItems> Items5 = new HashSet<foodItems>();
				HashSet<foodItems> Items6 = new HashSet<foodItems>();
				String country_ofnode;
				for (int temp = 0; temp < nList.getLength(); temp++) {
			 
					Node nNode = nList.item(temp);
			 
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						
						Element eElement = (Element) nNode;
						country_ofnode = eElement.getAttribute("country");
						
						if(country_ofnode.contains(c))
						{	
							if(eElement.getElementsByTagName("category").item(0).getTextContent().equals("Breakfast"))
							{	
								Items.add(new foodItems(eElement.getElementsByTagName("name").item(0).getTextContent(),eElement.getElementsByTagName("description").item(0).getTextContent(),eElement.getElementsByTagName("category").item(0).getTextContent(),eElement.getElementsByTagName("price").item(0).getTextContent()));
								foodset.put("Breakfast",Items);			
							}
							
							if(eElement.getElementsByTagName("category").item(0).getTextContent().equals("Snack"))
							{	
								Items1.add(new foodItems(eElement.getElementsByTagName("name").item(0).getTextContent(),eElement.getElementsByTagName("description").item(0).getTextContent(),eElement.getElementsByTagName("category").item(0).getTextContent(),eElement.getElementsByTagName("price").item(0).getTextContent()));
								foodset.put("Snack",Items1);
							}
							if(eElement.getElementsByTagName("category").item(0).getTextContent().equals("Appetizer"))
							{	
								Items2.add(new foodItems(eElement.getElementsByTagName("name").item(0).getTextContent(),eElement.getElementsByTagName("description").item(0).getTextContent(),eElement.getElementsByTagName("category").item(0).getTextContent(),eElement.getElementsByTagName("price").item(0).getTextContent()));
								foodset.put("Appetizer",Items2);
							}
							if(eElement.getElementsByTagName("category").item(0).getTextContent().equals("Lunch"))
							{	
								Items3.add(new foodItems(eElement.getElementsByTagName("name").item(0).getTextContent(),eElement.getElementsByTagName("description").item(0).getTextContent(),eElement.getElementsByTagName("category").item(0).getTextContent(),eElement.getElementsByTagName("price").item(0).getTextContent()));
								foodset.put("Lunch",Items3);
							}
							
							if(eElement.getElementsByTagName("category").item(0).getTextContent().equals("Dinner"))
							{	
								Items4.add(new foodItems(eElement.getElementsByTagName("name").item(0).getTextContent(),eElement.getElementsByTagName("description").item(0).getTextContent(),eElement.getElementsByTagName("category").item(0).getTextContent(),eElement.getElementsByTagName("price").item(0).getTextContent()));
								foodset.put("Dinner",Items4);
							}
							if(eElement.getElementsByTagName("category").item(0).getTextContent().equals("Dessert"))
							{	
								Items5.add(new foodItems(eElement.getElementsByTagName("name").item(0).getTextContent(),eElement.getElementsByTagName("description").item(0).getTextContent(),eElement.getElementsByTagName("category").item(0).getTextContent(),eElement.getElementsByTagName("price").item(0).getTextContent()));
								foodset.put("Dessert",Items5);
							}
							if(eElement.getElementsByTagName("category").item(0).getTextContent().equals("Side Dish"))
							{	
								Items6.add(new foodItems(eElement.getElementsByTagName("name").item(0).getTextContent(),eElement.getElementsByTagName("description").item(0).getTextContent(),eElement.getElementsByTagName("category").item(0).getTextContent(),eElement.getElementsByTagName("price").item(0).getTextContent()));
								foodset.put("Side Dish",Items6);
							}
						}
					}
					
				}
				return foodset;	    
		 } catch (Exception e) {
				e.printStackTrace();
				
			    }
		 return null;			  
		 }
	}