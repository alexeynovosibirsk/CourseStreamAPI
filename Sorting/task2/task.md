 Сортировка списка по одному полю:
 отсортировать по возрасту, в обратном порядке

<div class="hint">
sorted()
</div>

Варианты решений:
<div class="hint">
sorted(Comparator.comparing(User::getAge).reversed()

или

sorted((u1, u2) -> u2.getAge() - u1.getAge())

</div>
