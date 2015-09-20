
public class FactoryProducer {
		   
	public static AbstractFactory getFactory(String choice){
		   
		      if(choice.equalsIgnoreCase("Reader")){
		    	  
		    	  try{
		         return new readerFactory();
		    	  
		    	  }catch(Exception ex){System.out.println(ex);}
		      }else if(choice.equalsIgnoreCase("Category")){
		         return new categoryFactory();
		      } else if(choice.equalsIgnoreCase("Writer")){
		    	  return new writeFactory();
		      }
		      
		      return null;
		   }
		
}
