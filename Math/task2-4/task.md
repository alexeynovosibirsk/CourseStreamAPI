Вычислить самое длинное имя (firstName)
 
Подсказка:
<div class="hint">
mapToInt()
</div>

Ответ:
<div class="hint">
  mapToInt(u -> u.getFirstName().length()).max().getAsInt();

Вариант II:

mapToInt(u -> u.getFirstName().length()).summaryStatistics().getMax();

</div>
                                        