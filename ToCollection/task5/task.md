Сгруппировать пользователей по национальности, вывести в консоль.
 
Подсказка:
<div class="hint">
collect()
</div>

Варианты решений:
<div class="hint">
collect(Collectors.groupingBy(User::getNationality))

entrySet().stream().forEach(System.out::println)

или

forEach((s, u) -> System.out.println(s + "=" + u))
</div>
                                        