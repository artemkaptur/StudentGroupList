package by.htp.studgroup.model;

public class Student {

	private String name;
	private String surname;
	private int groupID;
	private int age;
	private int enteringYear;

	// Constructor without parameters
	public Student() {

	}

	// Constructor with parameters
	public Student(String name, String surname, int age, int enteringYear) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.enteringYear = enteringYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setID(int x) {
		groupID = x;
	}

	public double getID() {
		return this.groupID;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAge() {
		return this.age;
	}

	public void setYear(int enteringYear) {
		this.enteringYear = enteringYear;
	}

	public int getYear() {
		return this.enteringYear;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", groupID=" + groupID + ", age=" + age
				+ ", enteringYear=" + enteringYear + "]";
	}

}
