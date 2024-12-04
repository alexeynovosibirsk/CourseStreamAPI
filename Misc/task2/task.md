Вывести в консоль первые 3 буквы имени каждого пользователя
 
Подсказка:
<div class="hint">
map()
</div>

Ответ:
<div class="hint">
map(u -> u.getFirstName().substring(0, 3))

forEach(System.out::println);
</div>
                                        