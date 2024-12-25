import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<List<User>> listUserList = Arrays.asList(userList, userList2);
        List<User> users =
                listUserList.stream()
                        .flatMap(Collection::stream)
                        .toList();
    }

    private static final List<User> userList = Arrays.asList(
            new User(1, "Alice", "Cooper", 76, "US"),
            new User(2, "Bob", "Marley", 36, "EN"),
            new User(3, "Сlayton", "Noname", 76, "FR")
    );

    private static final List<User> userList2 = Arrays.asList(
            new User(4, "Debora", "Kerr", 86, "TR"),
            new User(5, "Elizabeth", "Taylor", 79, "US"),
            new User(6, "Farrokh", "Bulsara", 45, "ZB"),
            new User(7, "Gloria", "Gaynor", 81, "EN")
    );

}
