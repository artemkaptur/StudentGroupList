package by.htp.studgroup.model;

import by.htp.studgroup.model.Student;

@SuppressWarnings("unused")
public class StudentGroup extends DoubleLinkedList<Student> {

	private DoubleLinkedList<Student> students;
	private int groupID;

	// Constructor without parameters
	public StudentGroup(Student stud) {
		super(stud);
	}

	// Constructor with parameters
	public StudentGroup(int x, Student stud) {
		super(stud);
		groupID = x;
	}

}
