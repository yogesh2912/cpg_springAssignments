package dao;

public class JpaDaoImpl implements Idao{
	
	public JpaDaoImpl() {
		System.out.println("Constructor jpa dao");
	}

	@Override
	public String type() {
		return "Jpa dao";
	}

}
