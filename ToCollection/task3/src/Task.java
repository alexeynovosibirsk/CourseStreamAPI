import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        Map<Long, User> map = userList.stream()
                .collect(Collectors.toMap(User::getId, u -> u));
        System.out.println(map);
    }

    private static final List<User> userList = Arrays.asList(
            new User(1, "Alice", "Cooper", 76, "US"),
            new User(2, "Bob", "Marley", 36, "EN"),
            new User(3, "Сlayton", "Noname", 17, "FR"),
            new User(4, "Debora", "Kerr", 86, "TR"),
            new User(5, "Elizabeth", "Taylor", 79, "US"),
            new User(6, "Farrokh", "Bulsara", 45, "ZB"),
            new User(7, "Gloria", "Gaynor", 81, "EN")
    );

}
