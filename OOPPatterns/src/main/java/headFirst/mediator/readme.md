Паттерн Посредник - Mediator
============================
Паттерн используется для централизации сложных взаимодействий и управляющих операций
между объектами. Упрощается сопровождение системы, т.к. логика централизируется,
расширяется возможность повторного использования кода объектов под управлением
посредника. Может становиться очень сложным.
 Объекты полностью отделены друг от друга, за счет размещения логики в Посреднике.
  В примере чат комната будет использоваться как посредник между двумя юзерами.