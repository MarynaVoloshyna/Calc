# Calc
на Spring Boot + Data зробити простий проєкт без веб інтерфейсу:

1) Користувач дає запит localhost:8080/calc?type=sum&x=1&y=2 -> отримує суму x+y у вигляді JSON: { “result”: 3 }

2) Користувач дає запит localhost:8080/calc?type=mult&x=2&y=3 -> отримує добуток x*y у вигляді JSON: { “result”: 6 }

3) Результат зберігається в табличці в базі (H2 / MySQL на вибір) типу

| id | type | x | y | result

x, y - будь які цілі числа.
