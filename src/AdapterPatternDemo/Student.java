package AdapterPatternDemo;

import java.util.Collection;

public interface Student {
    String getFullName();
    String getContactDetails();
    boolean isAdult();
    Collection<Integer> getResults();
    String getSchoolName();
}
