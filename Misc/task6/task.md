Вывести имена (firstName) всех пользователей через запятую.
 
Подсказка:
<div class="hint">
joining(", ")
</div>

Ответ:
<div class="hint">
map(User::getFirstName)
.collect(Collectors.joining(", "));
</div>
                                        