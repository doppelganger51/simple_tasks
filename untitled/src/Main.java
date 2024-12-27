import java.util.Random;

public class Main {

    public static void main(String[] args) {
/*
        int a = 10;
        int b = 20;
        int t;
        t = a;
        b = t;
        a = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(t);
    }
}
*/


/*
        double res = 0.0;
        Random rand = new Random();
        double angle = 0;

        for (int i = 0; i < 1000; i++) {
            angle = rand.nextDouble(0.0, 360.0);
            res = Math.pow(Math.sin(angle), 2) + Math.pow(Math.cos(angle), 2);

            if (res < 1.0) break;
        }
        System.out.println(angle);
        System.out.println(res);
*/

/*
    boolean a = true;
    boolean b = false;

        System.out.println((!(a && b) && (a||b)) || ((a && b) || !(a||b)));
*/
/*
    Random rand = new Random();

    int a = rand.nextInt();
    int b = rand.nextInt();
    boolean c;
    c = (!(a < b) && !(a > b));
    System.out.println(c);
*/

/*
        System.out.println(2 + "bc"); //2bc
        System.out.println(2 + 3 + "bc"); //5bc
        System.out.println((2 + 3) + "bc"); //5bc
        System.out.println("bc" + (2+3)); //bc5
        System.out.println("bc" + 2 + 3); //bc23
*/
/*
        System.out.println('b');
        System.out.println('b' + 'a');
        System.out.println((char) ('a' + 5));
*/
/*
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(a+1);
        System.out.println(2-a);
        System.out.println(-2-a);
        System.out.println(2*a);
        System.out.println(4*a);

        System.out.println("Max_value = " + Integer.MAX_VALUE);
        System.out.println("Min_value = " + Integer.MIN_VALUE);
*/

/*
    double a = 3.14159;
        System.out.println(a); //3.14159
        System.out.println(a+1); //4.14159
        System.out.println(8/(int)a); //2
        System.out.println(8/a); //2....
        System.out.println((int)(8/a)); //2
*/

/*
        boolean c = (Math.sqrt(2) * Math.sqrt(2)) ==2;
        System.out.println(Math.sqrt(2) * Math.sqrt(2));
        System.out.println(c);
*/

/*
    Random rand = new Random();
    int a = rand.nextInt(0, 10);
    int b = rand.nextInt(1, 10);
    boolean c;

    if ((a%b) ==0) {
        c = true;
    }
    else {
        c = false;
    }
    System.out.println(a + " " + b);
    System.out.println(c);
*/
/*
    Random rand = new Random();
    int a = rand.nextInt(1, 100);
    int b = rand.nextInt(1, 100);
    int c = rand.nextInt(1, 100);
    boolean d;
    if (a >= (b+c)) {
        d = false;
        System.out.println(d);
    }
    else
        d = true;
        System.out.println(d);
*/
/*
    Random rand = new Random();
    double a = rand.nextDouble(1, 100);
    double b = rand.nextDouble(1, 100);
    double c = 0.0;

    c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    System.out.println(c);
*/

/*
    Random rand = new Random();
    int a = rand.nextInt(100);
    int b = rand.nextInt(100);
    int c = rand.nextInt(a, b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
*/
    }
}
