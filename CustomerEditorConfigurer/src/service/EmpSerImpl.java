package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpSerImpl implements IEmpSer{
	
	private Set<Emp> employees;
	private LocalDate doj;
	

	
	public void setEmployees(Set<Emp> employees) {
		this.employees = employees;
	}



	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}



	@Override
	public List<Emp> getEmployees() {
		// TODO Auto-generated method stub
		return employees.stream().filter(e->e.getDoj().isAfter(doj)
				|| e.getDoj().isEqual(doj)).collect(Collectors.toList());
	}

}
