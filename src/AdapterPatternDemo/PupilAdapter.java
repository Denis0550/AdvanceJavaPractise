package AdapterPatternDemo;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@AllArgsConstructor
@Setter
public class PupilAdapter implements Student {

    private final Pupil pupil;
    private final String schoolName;

    @Override
    public String getSchoolName() {
        return schoolName;
    }


    @Override
    public String getFullName() {
        return pupil.getFirstName() + " " + pupil.getLastName();
    }

    @Override
    public String getContactDetails() {
        return pupil.getEmail();
    }

    @Override
    public boolean isAdult() {
        return pupil.getAge() >= 18;
    }

    @Override
    public Collection<Integer> getResults() {
        return pupil.getGrades();
    }
}
