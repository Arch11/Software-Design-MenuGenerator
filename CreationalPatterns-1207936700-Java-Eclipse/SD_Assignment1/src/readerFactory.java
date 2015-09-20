
public class readerFactory extends AbstractFactory {

	@Override
	Reader getFile(String R_file) {
		// TODO Auto-generated method stub
		if(R_file.equals("xml"))
			return new readerXML();
		else if(R_file.equals("json"))
			return new readerJSON();
		return null;
	}

	@Override
	Category getCat(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Writer writeFILE(String W_file) {
		// TODO Auto-generated method stub
		return null;
	}
}
