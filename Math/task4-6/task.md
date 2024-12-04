Найти и вывести самое большое число (Возраст пользователя).

 
Подсказка:
<div class="hint">
max
</div>

Ответ:
<div class="hint">
mapToInt(User::getAge).max().ifPresent(System.out::println);

или
map(User::getAge).max(Comparator.naturalOrder()).ifPresent(System.out::println);
    
</div>
                                        