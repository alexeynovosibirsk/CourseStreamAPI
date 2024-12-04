 Сортировка списка по одному полю:
 отсортировать по возрасту.
 
Подсказка:
<div class="hint">
sorted()
</div>

Ответ:
<div class="hint">
sorted(Comparator.comparing(User::getAge)

или

sorted((u1, u2) -> u1.getAge() - u2.getAge())


</div>
