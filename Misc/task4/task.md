Проверить есть ли пользователь с именем начинающимся например с буквы "А" 

<div class="hint">
<code>
anyMatch()
</code>
</div>

Врианты решений:
<div class="hint">
<code>
anyMatch(u -> u.getFirstName().startsWith("A"));
</code>
Вариант II:
<code>
  anyMatch(u -> u.getFirstName().charAt(0) == 'A');
</code>
</div>
                                        