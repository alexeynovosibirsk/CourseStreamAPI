 Сортировка списка по нескольким полям:
 отсортировать по национальности и по имени.
 
Подсказка:
<div class="hint">
sorted()
</div>

Ответ:
<div class="hint">
.sorted(Comparator.comparing(User::getNationality)
.thenComparing(User::getFirstName));

</div>
