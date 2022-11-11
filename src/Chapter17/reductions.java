package Chapter17;

import java.util.List;

public class reductions {
    public static void main(String[] args) {
        List<String> names  = List.of("qewrqe123543!@&","*12345^" ,"John", "Blessing`[]}@@_4356&*");
        System.out.println(extraction(names));

        var numberOfDigits = names.stream()
                .reduce("", (i,j) ->i+j).chars()
                .filter(Character::isDigit).count();
        System.out.println(numberOfDigits);

    }

    public static int extraction(List<String>names) {
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.get(i).length(); j++) {
                if (Character.isDigit(names.get(i).charAt(j))) count++;
            }
        }
        return count;
    }
}
