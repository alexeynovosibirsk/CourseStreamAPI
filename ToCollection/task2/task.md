Найти первое повторяющееся число
 
Подсказка:
<div class="hint">
filter()
</div>

Ответ:
<div class="hint">
filter(i -> Collections.frequency(integers, i) > 1).findFirst().ifPresent(System.out::println);
</div>
                                        