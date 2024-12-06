 Сортировка списка по одному полю:
 отсортировать по возрасту

<div class="hint">
sorted()
</div>

Варианты решений:
<div class="hint">
sorted(Comparator.comparing(User::getAge));

или

sorted((u1, u2) -> u1.getAge() - u2.getAge())

</div>
