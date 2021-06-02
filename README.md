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

# Laboratory work 4 #
**Variant : 27628**
1. Для своей программы из лабораторной работы #4 по дисциплине "Программирование интернет-приложений" реализовать:

+) MBean, считающий общее число установленных пользователем точек, а также число точек, не попадающих в область. В случае, если пользователь совершил 2 "промаха" подряд, разработанный MBean должен отправлять оповещение об этом событии.

+) MBean, определяющий средний интервал между кликами пользователя по координатной плоскости.

2. С помощью утилиты JConsole провести мониторинг программы:

+) Снять показания MBean-классов, разработанных в ходе выполнения задания 1.

+) Определить наименование и версию JVM, поставщика виртуальной машины Java и номер её сборки.

3. С помощью утилиты VisualVM провести мониторинг и профилирование программы:

+) Снять график изменения показаний MBean-классов, разработанных в ходе выполнения задания 1, с течением времени.
    
+) Определить имя потока, потребляющего наибольший процент времени CPU.

4. Получить HeapDump, и с помощью утилиты VisualVM локализовать и устранить "утечку памяти" в программе ниже:
```java
// var. 27628
public class Lab4 {
  public static void main(String[] args) {
    A a = new A();
    A b = new D();
    D c = new D();
    b.y35();
    a.y31();
    a.y47();
    a.y27();
    a.y33();
    b.y1();
    c.y29();
    c.y42();
    a.y25();
    a.y38();
    c.y15(a);
    c.y15(b);
    b.y15(c);
    c.y6();
    c.y48();
    c.y7();
    Thread t = new Thread(new Runnable() {
      public void run() {
        while(true) {
          try {
             D d = new D();
             d.y10();
             Thread.sleep(8);
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
}
class A {
  int y24;
  int y5;
  int y32;
  int y30;
  int y16;
  long y21;
  long y50;
  long y23;
  java.io.ObjectOutputStream fileOutput;
  java.io.ObjectOutputStream sampleOutput;
  java.io.ObjectOutputStream printStream;
  int[] y41 = {-3, -3, 3, 3, 2};
  int[] y20 = {-1, -1, -1, -2, 2};
  int[] y39 = {2, -2, 1, 0, 2};
  static java.util.Map<java.net.URI,byte[]> cache = new java.util.HashMap<>();
  static int y28;
  static int y14;
  static int y34;
  static int y12;
  static int y45;
  java.util.List<String> y46 = new java.util.ArrayList<>();
  java.util.List<String> y13 = new java.util.ArrayList<>();
  java.util.List<String> y4 = new java.util.ArrayList<>();
  public A() {
    y24 = 2;
    y5 = 6;
    y32 = 5;
    y30 = 1;
    y16 = 9;
    y21 = 9L;
    y50 = 7L;
    y23 = 1L;
    try {
        fileOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileOutput.txt"));
        sampleOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOutput.txt"));
        printStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printStream.txt"));
    } catch (java.lang.Exception e) {
      // Do nothing
    }
  }
  public void init() {
    try {
      if (fileOutput == null) fileOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileOutput.txt"));
      System.out.println("Thread : " + Thread.currentThread() + ", fileOutput = " + fileOutput);
    } catch(Exception e) {
      // Ignore it
    }
    try {
      if (sampleOutput == null) sampleOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOutput.txt"));
      System.out.println("Thread : " + Thread.currentThread() + ", sampleOutput = " + sampleOutput);
    } catch(Exception e) {
      // Ignore it
    }
    try {
      if (printStream == null) printStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printStream.txt"));
      System.out.println("Thread : " + Thread.currentThread() + ", printStream = " + printStream);
    } catch(Exception e) {
      // Ignore it
    }
  }
  public byte[] getValueFromCache(String s) {
    try {
      java.net.URI url = new java.net.URI(s);
      if(!cache.containsKey(url)) {
        cache.put(url, new byte[524288]);
      }
      return cache.get(url);
    } catch (Exception e) {
      System.out.println("Error: invalid URL!");
      return null;
    }
  }
  public void y35() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOutput) {
              sampleOutput.writeObject("метод y35 в классе A (#" + String.valueOf(i) + ")");
              Thread.sleep(5);
              sampleOutput.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y31() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(fileOutput) {
              fileOutput.writeObject("метод y31 в классе A (#" + String.valueOf(i) + ")");
              Thread.sleep(6);
              fileOutput.flush();
              fileOutput.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y47() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOutput) {
              sampleOutput.writeObject("метод y47 в классе A (#" + String.valueOf(i) + ")");
              Thread.sleep(5);
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y27() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(fileOutput) {
              fileOutput.writeObject("метод y27 в классе A (#" + String.valueOf(i) + ")");
              Thread.sleep(5);
              fileOutput.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y33() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOutput) {
              sampleOutput.writeObject("метод y33 в классе A (#" + String.valueOf(i) + ")");
              Thread.sleep(5);
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y1() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(printStream) {
              printStream.writeObject("метод y1 в классе A (#" + String.valueOf(i) + ")");
              Thread.sleep(5);
              printStream.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public static void y29() {
    System.out.println("метод y29 в классе A");
    System.out.println(y28);
  }
  public static void y42() {
    System.out.println("метод y42 в классе A");
    System.out.println((y28 - 2));
  }
  public static void y25() {
    System.out.println("метод y25 в классе A");
    System.out.println(y14);
  }
  public static void y38() {
    System.out.println("метод y38 в классе A");
    System.out.println((y14 - 2));
  }
  public void y15(A r) {
    r.y35();
  }
  public void y15(D r) {
    r.y31();
  }
}
class D extends A {
  public D() {
    y5 = 5;
    y32 = 4;
    y16 = 4;
    y21 = 8L;
    y50 = 7L;
  }
  public void y35() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(fileOutput) {
              fileOutput.writeObject("метод y35 в классе D (#" + String.valueOf(i) + ")");
              Thread.sleep(13);
              fileOutput.flush();
              fileOutput.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y31() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(printStream) {
              printStream.writeObject("метод y31 в классе D (#" + String.valueOf(i) + ")");
              Thread.sleep(5);
              printStream.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y27() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOutput) {
              sampleOutput.writeObject("метод y27 в классе D (#" + String.valueOf(i) + ")");
              Thread.sleep(5);
              sampleOutput.flush();
              sampleOutput.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y33() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOutput) {
              sampleOutput.writeObject("метод y33 в классе D (#" + String.valueOf(i) + ")");
              Thread.sleep(12);
              sampleOutput.flush();
              sampleOutput.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y1() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        init();
        int i = 0;
        while(true) {
          i++;
          try {
            synchronized(sampleOutput) {
              sampleOutput.writeObject("метод y1 в классе D (#" + String.valueOf(i) + ")");
              Thread.sleep(9);
              sampleOutput.reset();
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y6() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        while(true) {
          try {
            synchronized(cache) {
              getValueFromCache("https://www.google.com");
              Thread.sleep(12);
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y48() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        while(true) {
          try {
            synchronized(cache) {
              getValueFromCache("https://www.google.com");
              Thread.sleep(5);
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public void y7() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        while(true) {
          try {
            synchronized(cache) {
              getValueFromCache("https://www.google.com");
              Thread.sleep(5);
            }
          } catch(Exception e) {
            // Do nothing
          }
        }
      }
    });
    t.start();
  }
  public static void y29() {
    System.out.println("метод y29 в классе D");
    System.out.println(++y28);
  }
  public static void y42() {
    System.out.println("метод y42 в классе D");
    System.out.println(y14);
  }
  public static void y25() {
    System.out.println("метод y25 в классе D");
    System.out.println((y14 - 3));
  }
  public static void y38() {
    System.out.println("метод y38 в классе D");
    System.out.println(y14);
  }
  public void y3() {
    for(int i = 0; i < 6; i++) {
      this.y13.add(String.valueOf(System.nanoTime()));
      // System.out.println(this.y13.size());
    }
  }
  public void y10() {
    for(int i = 0; i < 6; i++) {
      this.y13.add(String.valueOf(System.nanoTime()));
      // System.out.println(this.y13.size());
    }
  }
  public void y9() {
    for(int i = 0; i < 5; i++) {
      this.y46.add(String.valueOf(System.nanoTime()));
      // System.out.println(this.y46.size());
    }
  }
  public void y43() {
    for(int i = 0; i < 7; i++) {
      this.y4.add(String.valueOf(System.nanoTime()));
      // System.out.println(this.y4.size());
    }
  }
  public void y15(A r) {
    r.y47();
  }
  public void y15(D r) {
    r.y27();
  }
}
```
