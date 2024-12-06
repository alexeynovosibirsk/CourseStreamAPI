import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        userList.stream()
                .forEach(u -> System.out.println(u.getFirstName() + " " + u.getAge()));
    }

    private static final List<User> userList = Arrays.asList(
            new User(1, "Alice", "Cooper", 76, "US"),
            new User(2, "Bob", "Marley", 36, "EN"),
            new User(3, "Сlayton", "Noname", 17, "FR"),
            new User(4, "Debora", "Kerr", 86, "TR"),
            new User(5, "Elizabeth", "Taylor", 79, "US"),
            new User(6, "Farrokh", "Bulsara", 45, "ZB"),
            new User(7, "Greta", "Thunberg", 21, "EN")
    );

}


