package Chapter17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class map {
    public static void main(String[] args) {

        List<String>words = List.of(
                "QWETY", "JOHN", "NKWACHI", "ELISHA"
        );
        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap((str)->str,(str)->str.length()));

        System.out.println(map);
    }
}
