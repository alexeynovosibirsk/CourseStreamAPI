Найти самого молодого человека английской национальности ("EN").
 
Подсказка:
<div class="hint">
collect()
</div>

Ответ:
<div class="hint">
collect(Collectors.groupingBy(User::getNationality))
          .get("EN").stream().min(Comparator.comparing(User::getAge));
</div>
                                        