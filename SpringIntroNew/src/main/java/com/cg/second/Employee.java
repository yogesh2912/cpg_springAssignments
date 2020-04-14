package com.cg.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
private int Eid;
private  String ename;


private Address address;

public int getEid() {
	return Eid;
}
public void setEid(int eid) {
	Eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}

public Address getAddress() {
	return address;
}
@Autowired
public void setAddress(Address address) {
	this.address = address;
}

public Employee(int eid, String ename, Address address) {
	super();
	Eid = eid;
	this.ename = ename;
	this.address = address;
} 

}
