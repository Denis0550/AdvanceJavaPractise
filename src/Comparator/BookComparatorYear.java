package Comparator;

import java.util.Comparator;

public class BookComparatorYear implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPublishYear() > o2.getPublishYear()){
            return 1;
        }
        else if(o1.getPublishYear() < o2.getPublishYear()){
            return -1;
        }
        else{
            return  0;
        }
    }
}
