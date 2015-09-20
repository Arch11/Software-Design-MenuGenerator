import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class MenuGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		HashMap<String,HashSet<foodItems>> inputFile = new HashMap<String,HashSet<foodItems>>();
		String Country = null,Category = null;
		
		System.out.print("Choose Country:\n 1.United States \n 2.Great Britain \n : ");
		int CountryNumber= in.nextInt();
		AbstractFactory ReaderFactory = FactoryProducer.getFactory("Reader");
		switch(CountryNumber)
		{
		case 1:
			{
			try
			{
				Country = "US";
				Reader InFile = ReaderFactory.getFile("json");
				inputFile = InFile.getReader(Country);
				
				break;
			}catch(Exception ex){System.out.println(ex.getMessage());}
			}
			
			
		case 2:
			{
				Country = "GB";
				Reader InFile = ReaderFactory.getFile("xml");
				inputFile = InFile.getReader(Country);
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
				return;
			}
		}
		
		System.out.print("Choose Restaurant Category :\n 1. Diner \n 2. Evening Only \n 3. All Day \n : ");
		int CategoryNumber= in.nextInt();
		AbstractFactory CategoryFactory = FactoryProducer.getFactory("Category");
		switch(CategoryNumber)
		{
		case 1:
			{
				Category = "Diner";
				break;
			}
		case 2:
			{
				Category = "Evening Only";
				break;
			}
		case 3:
			{
				Category = "ALL Day";
				break;
			}
		default:
			{
				System.out.println("Invalid Input");
				return;
			}
		}
		
		Category CatMod = CategoryFactory.getCat(Category);
		inputFile = CatMod.getCategory(inputFile);
		
	
	System.out.print("Choose OutputFile type :\n 1. Plain Text \n 2. HTML \n 3. XML \n : ");
	int OutNumber= in.nextInt();
	AbstractFactory writeFactory = FactoryProducer.getFactory("Writer");
	switch(OutNumber)
	{
	case 1:
		{
			Writer WriteMod = writeFactory.writeFILE("text");
			WriteMod.writeFile(Country,Category,inputFile);
			break;
		}
	case 2:
		{
			Writer WriteMod = writeFactory.writeFILE("html");
			WriteMod.writeFile(Country,Category,inputFile);
			break;
		}
	case 3:
		{
			Writer WriteMod = writeFactory.writeFILE("xml");
			WriteMod.writeFile(Country,Category,inputFile);
			break;
		}
	default:
		{
			System.out.println("Invalid Input");
			return;
		}
	}
	}
}
