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