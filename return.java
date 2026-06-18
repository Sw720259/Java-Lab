class Student {
	    int id;
	        String name;

		    Student(int id, String name) {
			            this.id = id;
				            this.name = name;
					        }
}

public class StudentMain {
	    static Student createStudent() {
		            return new Student(101, "Swathi");
			        }

	        public static void main(String[] args) {
			        Student s = createStudent();
				        System.out.println("ID: " + s.id + ", Name: " + s.name);
					    }
}

