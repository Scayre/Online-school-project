package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	private long id;
	private String name;
	private String surname;
	private String year;
	
	public Student() {
		
	}
	
	public Student(String name, String surname, String year) {
		this.name = name;
		this.surname = surname;
		this.year = year;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name", nullable = false)
	public String getFirstName() {
		return name;
	}
	public void setFirstName(String name) {
		this.name = name;
	}
	
	@Column(name = "surname", nullable = false)
	public String getLastName() {
		return surname;
	}
	public void setLastName(String surname) {
		this.surname = surname;
	}
	
	@Column(name = "year", nullable = false)
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", year=" + year
				+ "]";
	}
	
}
