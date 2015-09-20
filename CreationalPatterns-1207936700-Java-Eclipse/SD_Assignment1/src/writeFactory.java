
public class writeFactory extends AbstractFactory{

	@Override
	Reader getFile(String R_file) {
		// TODO Auto-generated method stub
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

		if(W_file.equals("html"))
			return new writeHTML();
		else if(W_file.equals("text"))
			return new writeText();
		else if(W_file.equals("xml"))
			return new writeXML();
		
		return null;
	}

}
