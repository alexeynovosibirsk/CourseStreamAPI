Найти всех пользователей старше 10 лет имя которых начинается не с буквы "A"
 
Подсказка:
<div class="hint">
filter()
</div>

Ответ:
<div class="hint">
filter(u -> u.getAge() > 10)

filter(u -> u.getFirstName().charAt(0) != 'A')
</div>
                                        