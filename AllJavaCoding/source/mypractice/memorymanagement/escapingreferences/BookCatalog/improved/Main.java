package mypractice.memorymanagement.escapingreferences.BookCatalog.improved;

public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();

		bc.printAllBooks();

        System.out.println("-------------------------------------------------");
		
		//get price of book called Tom Jones in EUR
		//System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));

        //System.out.println("-------------------------------------------------");

		//bc.printAllBooks();

		BookReadOnly book=bc.findBookByName("Don Quixote");

        System.out.println(book);

        book.getPrice();  // This method can no longer be used by the client

        bc.printAllBooks();
		
	}
}
