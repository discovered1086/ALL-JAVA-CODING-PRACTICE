package mypractice.memorymanagement.escapingreferences.BookCatalog.improved;

public interface BookReadOnly {
    int getId();

    String getTitle();

    String getAuthor();

    String toString();

    Price getPrice();
}
