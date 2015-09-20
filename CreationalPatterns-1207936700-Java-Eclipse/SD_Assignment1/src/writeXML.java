//package com.mkyong.core;
import java.util.HashMap;
import java.util.HashSet;

import java.io.File;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException; 

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class writeXML implements Writer{

	@Override
	public void writeFile(String Country, String Category,HashMap<String, HashSet<foodItems>> inFile) {
		// TODO Auto-generated method stub

		try {
			 
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	 
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("MenuItems");
			doc.appendChild(rootElement);
	 			
			if(inFile.containsKey("Breakfast"))
			{
				Element MenuCat = doc.createElement("MenuCategory");
				rootElement.appendChild(MenuCat);
				MenuCat.setAttribute("Category", "BREAKFAST");
				
							
				HashSet<foodItems> itemlist = inFile.get("Breakfast");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	Element MenuItems = doc.createElement("MenuItems");
					MenuCat.appendChild(MenuItems);
		        	foodItems a = (foodItems)iterator.next();
		        	
		        // Name
		        	Element name = doc.createElement("Name");
					name.appendChild(doc.createTextNode(a.getName()));
					MenuItems.appendChild(name);
		 
				// Price
					Element price = doc.createElement("Price");
					price.appendChild(doc.createTextNode(a.getPrice()));
					MenuItems.appendChild(price);
		 
				// Description
					Element des = doc.createElement("Description");
					des.appendChild(doc.createTextNode(a.getDes()));
					MenuItems.appendChild(des);
		        }	
			}
			
			if(inFile.containsKey("Snack"))
			{
				Element MenuCat = doc.createElement("MenuCategory");
				rootElement.appendChild(MenuCat);
				MenuCat.setAttribute("Category", "SNACK");
				
				
				HashSet<foodItems> itemlist = inFile.get("Snack");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	Element MenuItems = doc.createElement("MenuItems");
					MenuCat.appendChild(MenuItems);
		        	foodItems a = (foodItems)iterator.next();
		        	
		        // Name
		        	Element name = doc.createElement("Name");
					name.appendChild(doc.createTextNode(a.getName()));
					MenuItems.appendChild(name);
		 
				// Price
					Element price = doc.createElement("Price");
					price.appendChild(doc.createTextNode(a.getPrice()));
					MenuItems.appendChild(price);
		 
				// Description
					Element des = doc.createElement("Description");
					des.appendChild(doc.createTextNode(a.getDes()));
					MenuItems.appendChild(des);
		        }	
			}
			if(inFile.containsKey("Appetizer"))
			{	Element MenuCat = doc.createElement("MenuCategory");
			rootElement.appendChild(MenuCat);
				MenuCat.setAttribute("Category", "APPETIZER");
				
				HashSet<foodItems> itemlist = inFile.get("Appetizer");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	Element MenuItems = doc.createElement("MenuItems");
					MenuCat.appendChild(MenuItems);
		        	foodItems a = (foodItems)iterator.next();
		        	
		        // Name
		        	Element name = doc.createElement("Name");
					name.appendChild(doc.createTextNode(a.getName()));
					MenuItems.appendChild(name);
		 
				// Price
					Element price = doc.createElement("Price");
					price.appendChild(doc.createTextNode(a.getPrice()));
					MenuItems.appendChild(price);
		 
				// Description
					Element des = doc.createElement("Description");
					des.appendChild(doc.createTextNode(a.getDes()));
					MenuItems.appendChild(des);
		        }	
			}
			if(inFile.containsKey("Lunch"))
			{	Element MenuCat = doc.createElement("MenuCategory");
			rootElement.appendChild(MenuCat);
				MenuCat.setAttribute("Category", "LUNCH");
				
				HashSet<foodItems> itemlist = inFile.get("Lunch");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	Element MenuItems = doc.createElement("MenuItems");
					MenuCat.appendChild(MenuItems);
		        	foodItems a = (foodItems)iterator.next();
		        	
		        // Name
		        	Element name = doc.createElement("Name");
					name.appendChild(doc.createTextNode(a.getName()));
					MenuItems.appendChild(name);
		 
				// Price
					Element price = doc.createElement("Price");
					price.appendChild(doc.createTextNode(a.getPrice()));
					MenuItems.appendChild(price);
		 
				// Description
					Element des = doc.createElement("Description");
					des.appendChild(doc.createTextNode(a.getDes()));
					MenuItems.appendChild(des);
		        }	
			}
			if(inFile.containsKey("Dinner"))
			{	Element MenuCat = doc.createElement("MenuCategory");
			rootElement.appendChild(MenuCat);
				MenuCat.setAttribute("Category", "DINNER");
				
				HashSet<foodItems> itemlist = inFile.get("Dinner");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	Element MenuItems = doc.createElement("MenuItems");
					MenuCat.appendChild(MenuItems);
		        	foodItems a = (foodItems)iterator.next();
		        	
		        // Name
		        	Element name = doc.createElement("Name");
					name.appendChild(doc.createTextNode(a.getName()));
					MenuItems.appendChild(name);
		 
				// Price
					Element price = doc.createElement("Price");
					price.appendChild(doc.createTextNode(a.getPrice()));
					MenuItems.appendChild(price);
		 
				// Description
					Element des = doc.createElement("Description");
					des.appendChild(doc.createTextNode(a.getDes()));
					MenuItems.appendChild(des);
		        }	
			}
			if(inFile.containsKey("Dessert"))
			{	Element MenuCat = doc.createElement("MenuCategory");
			rootElement.appendChild(MenuCat);
				MenuCat.setAttribute("Category", "DESSERT");
				
				HashSet<foodItems> itemlist = inFile.get("Dessert");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	Element MenuItems = doc.createElement("MenuItems");
					MenuCat.appendChild(MenuItems);
		        	foodItems a = (foodItems)iterator.next();
		        	
		        // Name
		        	Element name = doc.createElement("Name");
					name.appendChild(doc.createTextNode(a.getName()));
					MenuItems.appendChild(name);
		 
				// Price
					Element price = doc.createElement("Price");
					price.appendChild(doc.createTextNode(a.getPrice()));
					MenuItems.appendChild(price);
		 
				// Description
					Element des = doc.createElement("Description");
					des.appendChild(doc.createTextNode(a.getDes()));
					MenuItems.appendChild(des);
		        }	
			}
			if(inFile.containsKey("Side Dish"))
			{	Element MenuCat = doc.createElement("MenuCategory");
			rootElement.appendChild(MenuCat);
				MenuCat.setAttribute("Category", "SIDE DISH");
				
				HashSet<foodItems> itemlist = inFile.get("Side Dish");
				Iterator iterator = (Iterator) itemlist.iterator();
		        while (iterator.hasNext())
		        {
		        	Element MenuItems = doc.createElement("MenuItems");
					MenuCat.appendChild(MenuItems);
		        	foodItems a = (foodItems)iterator.next();
		        	
		        // Name
		        	Element name = doc.createElement("Name");
					name.appendChild(doc.createTextNode(a.getName()));
					MenuItems.appendChild(name);
		 
				// Price
					Element price = doc.createElement("Price");
					price.appendChild(doc.createTextNode(a.getPrice()));
					MenuItems.appendChild(price);
		 
				// Description
					Element des = doc.createElement("Description");
					des.appendChild(doc.createTextNode(a.getDes()));
					MenuItems.appendChild(des);
		        }	
			}
	
			// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(Country + "-Menu-"+ Category+".xml"));
	 
				transformer.transform(source, result);
	 
			System.out.println("File saved!");
	 
		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
	}
}