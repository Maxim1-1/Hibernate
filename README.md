## Начало работы
1. При запуске приложения необходимо заполнить следующие параметры в файле который находится по пути:
```src/main/resources/hibernate.cfg.xml``` 

``` 
connection.url - ссылка на хост где запущена PostgreSQL в формате jdbc:postgresql://<host>:<port>/<database>
connection.username - логин для подключения
connection.password - пароль для подключения
db - имя вашей базы данных, которую нужно будет предварительно создать в вашей локальной базе данных

Пример заполненных данных:

        <property name="connection.url">jdbc:postgresql://localhost:5432/test</property>
        <property name="connection.username">postgres</property>
        <property name="connection.password">root</property>
```
2. Необходимо выполнить команду ``flyway:baseline`` с помощью maven, после успешного выполнения выполните вторую команду  maven``flyway:migrate``



Обратите внимание, что при запуске приложения в указанной вами базе данных, будут созданы следующие таблицы:
Writer, Post, Label, Post_labels. \
Для корректной работы приложения убедитесь, что в вашей БД отсутствовали таблицы с похожими именами. 

## Запуск приложения
````
1. Откройте класс Runner, который находится по следующему пути: src/main/java/com/Maxim/Runner.java 
2. Запустите метод main.
````

## Список доступных команд с описанием
````
- create writer - создание автора
- get all writers - получение списка всех авторов 
- get writer by id - получение автора по id
- update writer by id - изменение параметров автора, для изменения доступны два параметра (firstName,LastName)
- delete writer by id - удаление автора из таблицы по id
- get all labels - получение всех тегов из таблицы
- get label by id - получение тега по id 
- create label - создание нового тега
- update label by id - изменение имени тега
- delete label by id - удлаение тега по id
- get all posts - получение всех постов из таблицы
- get post by id - получение поста по id
- create post - создание поста. Во время этой команды есть возможность сразу создать автора поста и добавить тег к посту
- update post by id - изменение поста по id
- delete post by id - удаление поста по id. При выполнении этой команды статус поста будет изменен на 'DELETED'.
````