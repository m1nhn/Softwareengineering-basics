# Laboratory work 1 #

**Variant : 273626**


"Максидом" - товары для дома, строительства и ремонта. Сеть магазинов товаров для дома и дачи, ремонта и строительства, автотоваров в Санкт-Петербурге, Нижнем Новгороде, Казани - http://www.maxidom.ru
Составить список требований, предъявляемых к разрабатываемому веб-сайту (в соответствии с вариантом). Требования должны делиться на следующие категории:

- Функциональные.
    - Требования пользователей сайта.
    - Требования владельцев сайта.
- Нефункциональные.

Требования необходимо оформить в соответствии с шаблонами RUP (документ SRS - Software Requirements Specification). Для каждого из требований нужно указать его атрибуты (в соответствии с методологией RUP), а также оценить и аргументировать приблизительное количество часов, требующихся на реализацию этого требования.

Для функциональных требований нужно составить UML UseCase-диаграммы, описывающие реализующие их прецеденты использования.

# Laboratory work 2 #
**Variant : 273826** 

<p align="center">
  <img src="https://github.com/toniminh161200/Softwareengineering-basics/blob/main/LAB2/schemalab2.jpg" />
</p>

Сконфигурировать в своём домашнем каталоге репозитории svn и git и загрузить в них начальную ревизию файлов с исходными кодами (в соответствии с выданным вариантом).

Воспроизвести последовательность команд для систем контроля версий svn и git, осуществляющих операции над исходным кодом, приведённые на блок-схеме.

При составлении последовательности команд необходимо учитывать следующие условия:
1) Цвет элементов схемы указывает на пользователя, совершившего действие (красный - первый, синий - второй).
2) Цифры над узлами - номер ревизии. Ревизии создаются последовательно.
3) Необходимо разрешать конфликты между версиями, если они возникают.

Отчёт по работе должен содержать:
1) Задание и блок-схему в соответствии с вариантом.
2) Список команд, использованных при создании и конфигурации репозиториев в домашнем каталоге пользователя.
3) Номера ревизий и соответствующие им последовательности команд с комментариями (для svn и git).
4) Выводы по работе.

# Laboratory work 3 #
**Variant : 27427**

Написать сценарий для утилиты Apache Ant, реализующий компиляцию, тестирование и упаковку в jar-архив кода проекта из лабораторной работы №3 по дисциплине "Веб-программирование".

Каждый этап должен быть выделен в отдельный блок сценария; все переменные и константы, используемые в сценарии, должны быть вынесены в отдельный файл параметров; MANIFEST.MF должен содержать информацию о версии и о запускаемом классе.

**Cценарий должен реализовывать следующие цели (**targets**):**

1. **compile** -- компиляция исходных кодов проекта.
2. **build** -- компиляция исходных кодов проекта и их упаковка в исполняемый jar-архив. Компиляцию исходных кодов реализовать посредством вызова цели **compile**.
3. **clean** -- удаление скомпилированных классов проекта и всех временных файлов (если они есть).
4. **test** -- запуск junit-тестов проекта. Перед запуском тестов необходимо осуществить сборку проекта (цель **build**).
5. **xml** - валидация всех xml-файлов в проекте.
6. **diff** - осуществляет проверку состояния рабочей копии, и, если изменения касаются классов, указанных в файле параметров выполняет commit в репозиторий svn.
