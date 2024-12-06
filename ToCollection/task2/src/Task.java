import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<Integer> integers = userList.stream().map(User::getAge).toList();
        integers.stream()
                .filter(i -> Collections.frequency(integers, i) > 1).findFirst().ifPresent(System.out::println);
    }

    private static final List<User> userList = Arrays.asList(
            new User(1, "Alice", "Cooper", 76, "US"),
            new User(2, "Bob", "Marley", 36, "EN"),
            new User(3, "Сlayton", "Noname", 76, "FR"),
            new User(4, "Debora", "Kerr", 86, "TR"),
            new User(5, "Elizabeth", "Taylor", 79, "US"),
            new User(6, "Farrokh", "Bulsara", 45, "ZB"),
            new User(7, "Gloria", "Unknown", 36, "EN")
    );

}
