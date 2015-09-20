
public abstract class AbstractFactory {
	abstract Reader getFile(String R_file) ;	
	abstract Category getCat(String category);
    abstract Writer writeFILE(String W_file);	    
}
