Преобразование одной коллекции в другую.
Преобразовать в карту (map).
 
Подсказка:
<div class="hint">
collect()
</div>

Ответ:
<div class="hint">
collect(Collectors.toMap(User::getId, user -> user))
</div>
                                        