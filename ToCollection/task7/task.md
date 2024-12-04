Найти самого молодого человека "EN" национальности.
 
Подсказка:
<div class="hint">
collect()
</div>

Ответ:
<div class="hint">
collect(Collectors.groupingBy(User::getNationality))
          .get("EN").stream().min(Comparator.comparing(User::getAge));
</div>
                                        