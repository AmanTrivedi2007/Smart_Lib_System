package Book;

public class Book {
    private int bookId;
    private String isbn, title, author, category;
    private int totalCopies, availableCopies, timesBorrowed;

    boolean isAvailable(){
        if(totalCopies>0){
            return true;
        }
        else {
            return false;
        }
    }

    void incrementBorrowCount(){
        timesBorrowed = timesBorrowed+1;
    }

    boolean updateCopies(int delta) {

        if (delta == 1) {
            if (availableCopies == 0)
                return false;

            availableCopies--;
        }
        else if (delta == -1) {

            if (availableCopies == totalCopies)
                return false;

            availableCopies++;
        }
        else {
            return false;
        }
        return true;
    }
}
