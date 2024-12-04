Посчитать количество разных национальностей.
 
Подсказка:
<div class="hint">
distinct()
</div>

Ответ:
<div class="hint">
map(User::getNationality)
                .distinct()
                .count();
</div>
                                        