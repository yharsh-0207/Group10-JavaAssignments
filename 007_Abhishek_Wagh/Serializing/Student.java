package com.serialize1;

import java.io.Serializable;

public class Student implements Serializable {

private static final long serialVersionUID = 60193028905556174L;
private int rollNo;
private String name;


public Student() {
	super();
}
public Student(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}


}
