 Сортировка списка по одному полю:
 отсортировать по возрасту, в обратном порядке
 
Подсказка:
<div class="hint">
sorted()
</div>

Ответ:
<div class="hint">
sorted(Comparator.comparing(User::getAge).reversed()

или

sorted((u1, u2) -> u2.getAge() - u1.getAge())

</div>
