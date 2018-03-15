package by.htp.studgroup.run;

import by.htp.studgroup.model.Student;
import by.htp.studgroup.model.StudentGroup;

public class Runner {

	public static void main(String[] args) {

		Student stud1 = new Student("John", "Dilinjer", 17, 2015);
		Student stud2 = new Student("Bill", "Turner", 20, 2017);
		Student stud3 = new Student("Kate", "Perry", 21, 2015);
		Student stud4 = new Student("Hans", "Anderson", 18, 2017);

		StudentGroup group = new StudentGroup(stud1);
		group.add(stud2);
		group.printList();
		System.out.println(group.getLength());
		System.out.println("=====================================================================");

		group.addToBegin(stud3);
		group.printList();
		System.out.println(group.getLength());
		System.out.println("=====================================================================");

		group.add(0, stud4);
		group.printList();
		System.out.println(group.getLength());
		System.out.println("=====================================================================");
		
		group.deleteFromEnd();
		group.printList();
		System.out.println(group.getLength());
		System.out.println("=====================================================================");

		group.deleteFromBegin();
		group.printList();
		System.out.println(group.getLength());
		System.out.println("=====================================================================");
		
		group.deleteItem(stud3);
		group.printList();
		System.out.println(group.getLength());
		System.out.println("=====================================================================");
		
		group.addToBegin(stud3);
		group.deleteFromIndex(1);
		group.printList();
		System.out.println(group.getLength());
		System.out.println("=====================================================================");
		
		group.add(stud1);
		group.add(stud2);
		group.add(stud4);group.printList();
		System.out.println(group.getLength());
		System.out.println("Index of John - " + group.indexOf(stud1));
		System.out.println("=====================================================================");
		
		Student findedStud = group.findItem(stud1);
		System.out.println(findedStud);
		
	}

}
