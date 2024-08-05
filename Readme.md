# Android-Test-Assignment | <a href="https://github.com/dmitriykotov333/Android-Test-Assignment/blob/master/app-debug.apk">APK</a>

## О проекте


Приложение Android, которое отслеживает запросы пользователя в браузере и добавляет те, которые содержат «google.com», в базу данных.  
Пользователь вводит запрос или в url строку или поисковую строку, далее данные сохраняются в базу данных после нажатия.
Есть возможность отслеживать несколько браузеров. Приложение отображает список всех сохраненных запросов.

Один элемент отображает: запрос, веб сайт, все ссылки кликабельные из данного приложения можно перейти по данной ссылке.

Отображается количество дублированных ссылок, так как  может быть такое, что запросы одинаковы и чтобы не было дубликатов в списке, приложение объединяет и показывает количество дубликатов, при нажатии можно посмотреть последние десять айтем.
Список отсортирован по дате и времени запроса.Есть возможность удалять запросы из списка. Поддержка светлой и темной темы.

| Service off(Text clickable)  | Service on |  
| ------------- | ------------- |   
| <img src = "https://github.com/user-attachments/assets/fbc4e568-8550-4c8d-9d26-739765454dee" width="300"/>  | <img src = "https://github.com/user-attachments/assets/fee6573d-ce2d-4b84-9f4d-7fa78efd97aa" width="300"/>  |  
 


| Link clickable  | Fake Example |
| ------------- | ------------- |
| <video src="https://github.com/user-attachments/assets/b9c85d40-cc5b-4180-a22a-90a887044c3f" width="352" height="720"></video> | <video src="https://github.com/user-attachments/assets/0e5ca29f-9d87-4132-8f0c-45435c3e906a" width="352" height="720"></video>  |


| Light theme  | Dark theme |
| ------------- | ------------- |
| <img src = "https://github.com/user-attachments/assets/5186cc90-f012-4592-ad42-37f6ad2eec40" width="300"/>  | <img src = "https://github.com/user-attachments/assets/3aa807fc-a6e4-400c-860b-3ae59d20e874" width="300"/>  |


## Этапы работы ~(12h + 2h Readme.md)
Алгоритм подсчета времени, если задача заняла больше 30-40 мин я ее считаю как 1 час

Менее 30 мин не считаю

1. Чтение документации про Accessibility Service - **1h**
2. Поиск и анализ других материалов про Accessibility Service - **1h**
4. Первая тестовая реализация(для того чтобы понять принцип работы) - **1h**
5. Проектирование app
    - Требования к приложению
        - Производительность
        - Безопасность
        - Приложение должно иметь простой и понятный интерфейс
    - Архитектура, стэк
        - MVI
        - Jetpack Compose
        - Dagger Hilt
        - Coroutines
        - Room
        - Convention gradle plugin
        - Compose Navigation
        - Lottie
        - SQLCipher
        - Design pattern: Factory
6. Задачи
    1. Модуль Core
    2. Модуль CoreUI
    3. Модуль Database -  **2h**
    4. Модуль Service  - **3h**
    5. Модуль Data - **1h**
    6. Модуль Domain
    7. Модуль Presentation - **2h**
    8. Permission
    9. Unit test for Room, Accessibility Service  **1h**


<details>
<summary>Безопасность</summary> 

1. Шифрование базы данных
    - Для этого можно использовать библиотеку SQLCipher.
2. Обфускация
    -  Обфускация кода помогает затруднить понимание исходного кода и структуры приложения при декомпиляции.
</details>

<details>
<summary>Модуль Core</summary> 
  В модуле core находятся абстрактные классы, расширения 
</details>
<details>
<summary>Модуль Core UI</summary> 
  В модуле Core UI находятся общие Composable функции или Modifier, которые могут использоваться в разных модулях. 
</details>
<details>
<summary>Модуль Database</summary> 
 В базе данных может быть ситуация, что хранятся дубликаты запроса и чтобы в списке не отображать дубликаты, я буду выводить один айтем и количество дубликатов.

Для этого я использую обращение к таблицам **one-to-many**.

Так же можно было реализовать используя одну таблицу и через скрипт SQL получить все то же самое.

Либо реализовать простую реализацию работы с бд и все фильтры делать через операторы Collections

решил сделать через **one-to-many**

1. SQLCipher  - 1h
2. Database  - 1h
</details>
 <details>
<summary>Модуль Service</summary> 

**Design pattern: Factory**  - доставляет клиенту готовый к использованию объект. Фабрика скрывает сложность создания и выбора подходящего объекта для работы.
Логика выстроена так, чтобы можно было легко вносить изменения.

1. Design pattern: Factor  - 1h
2. Google Service  - 1h
3. Opera Service  - 1h
</details>
 <details>
<summary>Модуль Domain</summary> 

**Design pattern: Factory**  - доставляет клиенту готовый к использованию объект. Фабрика скрывает сложность создания и выбора подходящего объекта для работы.
Логика выстроена так, чтобы можно было легко вносить изменения.
</details>
 <details>
<summary>Модуль Data</summary> 

Модуль содержит реализацию **CommonPaging**

Так как мы можем показывать подробно ссылку, показывать список дубликатов запросов и другое.
Использовать Paging 3 нам не подходит, так как нельзя обновлять объект в списке, поэтому делаем свою реализацию Paging.

</details>
 <details>
<summary>Модуль Presentation</summary>

1. Верстка UI - 1h
2. Обдумать дизайн и логику - 1h
</details> 

## трудности/проблемы
> 1. Не трудность/проблема Раньше, просто никогда не работал с Accessibility Service интересный опыт
> 2. SQLCipher миграция бд
