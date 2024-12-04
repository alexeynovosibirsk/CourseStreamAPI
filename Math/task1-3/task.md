Вычислить средний возраст пользователя
 
Подсказка:
<div class="hint">
collect()
</div>

Ответ:
<div class="hint">
  collect(Collectors.averagingDouble(User::getAge));

Вариант II:
  mapToDouble(User::getAge).summaryStatistics().getAverage();

Вариант IIа:
mapToDouble(User::getAge).average().getAsDouble();
</div>
