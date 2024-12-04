Вывести содержимое коллекции в консоль.
 
Подсказка:
<div class="hint">
entrySet()
</div>

Ответ:
<div class="hint">
entrySet().stream().forEach(System.out::println)

или

forEach((l, u) -> System.out.println(l + "=" + u));
</div>
                                        