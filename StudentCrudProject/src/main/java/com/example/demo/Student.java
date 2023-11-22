package com.example.demo;


public class Student {
	
	private Long id;
	private String name;
	private Long salary;
	

	public Student(Long id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getSalary() {
		return salary;
	}


	public void setSalary(Long salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	
	
	

}
