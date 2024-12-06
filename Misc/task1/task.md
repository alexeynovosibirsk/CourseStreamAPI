Вывести в консоль самого старого пользователя

<div class="hint">
max()
</div>

Варианты решений:
<div class="hint">

max(Comparator.comparing(User::getAge))

ifPresent(System.out::println);


или


reduce((u1, u2) -> u1.getAge() > u2.getAge() ? u1 : u2);

</div>
                                        