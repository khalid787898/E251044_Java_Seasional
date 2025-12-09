public class LibraryBookTask {
	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook("Introduction to Java", "Herbert Schildt", "B1001");
		LibraryBook b2 = new LibraryBook("Data Structures", "Seymour Lipschutz", "B1002");

		System.out.println("Book 1:");
		b1.displayBookInfo();

		System.out.println("\nBook 2:");
		b2.displayBookInfo();
	}
}

class LibraryBook {
	String title;
	String author;
	String bookID;

	LibraryBook(String title, String author, String bookID) {
		this.title = title;
		this.author = author;
		this.bookID = bookID;
	}

	public void displayBookInfo() {
		System.out.println("Title : " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Book ID: " + this.bookID);
	}
}
