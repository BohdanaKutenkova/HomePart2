import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Employees {
    public static void main(String[] args) {
        String[] employeesArray = {"Jaden", "Gross", "Jabbar", "Spilberg", "Cruse",
                "Spelling", "Oskar", "Kozak", "Jafitt", "Smitt"};
        List<String> employeesList = new ArrayList<>(Arrays.asList(employeesArray));
        System.out.println(employeesList);

        Predicate<String> fn;
        fn = (str) -> str.charAt(0) == 'J';
        Stream<String> stream = employeesList.stream();
        Stream<String> newStream = stream.filter(fn);
        System.out.println("count = " + newStream.count());
    }
}
