Вывести содержимое коллекции в консоль.

<div class="hint">
entrySet()
</div>

Варианты решений:
<div class="hint">
entrySet().stream().forEach(System.out::println)

или

forEach((l, u) -> System.out.println(l + "=" + u));
</div>
                                        