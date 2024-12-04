Проверить есть ли пользователь с именем начинающимся например с буквы "А" 
 
Подсказка:
<div class="hint">
anyMatch()
</div>

Ответ:
<div class="hint">
anyMatch(u -> u.getFirstName().startsWith("A"));

Вариант II:

  anyMatch(u -> u.getFirstName().charAt(0) == 'A');
</div>
                                        