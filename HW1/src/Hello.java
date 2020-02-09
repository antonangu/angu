// Создать метод
public class Hello {
    public static void main(String[] args) {
    }
    // Создать переменные всех пройденных типов данных, и инициализировать их значения;
       static void lesson2() {
           byte b = 110;
           short st = 1249;
           char ch = 't';
           int integer = 15;
           long lg = 15648L;
           float fl = 1.54646f;
           double dl = 85.99;
           boolean bool = true;
       }
       // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    static int lesson3() {
            int a = 5;
            int b = 10;
            int c = 3;
            int d = 15;
            int f = a * (b + (c / d));
            System.out.println("f= " + f);
            return a * (b + (c / d));


    }
    //4. Написать метод, принимающий на вход два числа
    public static boolean lesson4(int a,int b) {
        return 10 <= a + b && a + b <= 20;
    }
    // 5.Написать метод, которому в качестве параметра передается целое число
    public static void lesson5(){
        int a=10;
        if (0<=a){
            System.out.println(a + "положительное число");
        }else{
            System.out.println(a +" число отрицальное");
        }
        }
        //6.Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean lesson6(int a){
        return a<0;
    }
    //7.Написать метод, которому в качестве параметра передается строка, обозначающая имя
    public static void lesson7(String name){
        System.out.println("Привет "+ name);
    }
       }

