public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {

        System.out.println("\nЗадача_1\n");
        for (int i = 1; i <= 11; i++){
            System.out.println("Итерация цикла : " + i);
        }
    }

    public static void task2() {

        System.out.println("\nЗадача_2\n");
        for( int n = 10; n > 0; n = n - 1 ){
            System.out.println("Итерация цикла : " + n);
        }
    }

    public static void task3() {

        System.out.println("\nЗадача_3\n");
        for ( int c = 0; c <= 17; c = c + 2  ){
            System.out.println("Четные ребятушки : " + c);
        }
    }

    public static void task4() {

        System.out.println("\nЗадача_4\n");
        for (int r = 10; r >= -10; r = r - 1){
            System.out.println(r);
        }
    }

    public static void task5() {

        System.out.println("\nЗадача_5\n");
        for ( int y = 1904; y <= 2096; y = y + 4){
            System.out.println("Високосные года : " + y);
        }
    }

    public static void task6() {

        System.out.println("\nЗадача_6\n");
        for ( int a = 7; a <= 98; a=a+7){
            System.out.print( a + "," );
        }
    }

    public static void task7() {
        System.out.println("\nЗадача_7\n");

        for( int f = 1; f<=512;f = f * 2 ){
            System.out.print(f + ",");
        }

    }

    public static void task8() {
        System.out.println("\nЗадача_8\n");
        int inBox = 29_000;
        int total = 0 ;
        for( int f = 1; f<=12; f=f+1 ){
            total = inBox + total;
            System.out.println( "Месяц " + f + ", сумма накоплений равна " + total + " рублей");
        }

    }
    public static void task9() {
        System.out.println("\nЗадача_9\n");
        int inBox = 29_000;
        int total = 0 ;
        for( int f = 1; f<=12; f=f+1 ){
            inBox = inBox + inBox/100;
            total = inBox + total;
            System.out.println( "Месяц " + f + ", сумма накоплений равна " + total + " рублей");
        }

    }
    public static void task10() {
        System.out.println("\nЗадача_10\n");
        int a = 2;
        for( int f = 1; f<=10 ;f = f + 1 ){
            int c = a * f ;
            System.out.println(a + " * " + f + " = " + c);
        }

    }
}