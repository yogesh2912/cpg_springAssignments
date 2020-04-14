package service;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LdtEditor extends PropertyEditorSupport{
	
	public String getAsText() {
		return getValue().toString();
	}
	
	public void setAsText(String strDt) throws IllegalArgumentException{
		DateTimeFormatter dFromatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ldt=LocalDate.parse(strDt,dFromatter);
		setValue(ldt);
	}

}
