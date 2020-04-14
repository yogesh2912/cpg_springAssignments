package service;

import java.util.Properties;

public class ServiceImpl implements IService {
	
	private Properties props;
	
	public ServiceImpl(Properties props) {
		super();
		this.props = props;
	}

	public String getData(String property) {
		return props.getProperty(property);
	}

}
