public class IDCardTask {
	public static void main(String[] args) {
		IDCard std = new IDCard("Rahat Ahmed", "CSE2025-01", "CSE", "IIUC");
		IDCard teacher = new IDCard("Dr. Sultana", "T-007", "Mathematics", "IIUC");

		System.out.println("Student ID Card:");
		std.showID();

		System.out.println("\nTeacher ID Card:");
		teacher.showID();
	}
}

class IDCard {
	String name;
	String id;
	String department;
	String institution;

	IDCard(String name, String id, String department, String institution) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.institution = institution;
	}

	void showID() {
		System.out.println("Name         : " + name);
		System.out.println("ID           : " + id);
		System.out.println("Department   : " + department);
		System.out.println("Institution  : " + institution);
	}
}
