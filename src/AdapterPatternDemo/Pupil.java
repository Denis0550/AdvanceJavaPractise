package AdapterPatternDemo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@Getter
@AllArgsConstructor
public class Pupil {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Integer age;
    private final List<Integer> grades;

}
