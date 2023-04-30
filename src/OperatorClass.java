import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class OperatorClass {

    public static void main(String[] args) {
        // +
        int x =10, y = 20;
        System.out.println( x+y);
        //-
        System.out.println(x-y);
        //*
        System.out.println( x * y);
        // /
        System.out.println(y /x);
        // %
        System.out.println(10%3);
        System.out.println(20%3);
        // ++ Increment
        int z = 20;
        System.out.println(++z);
        System.out.println(++z);
        System.out.println(++z);
        System.out.println(++z);;
         // -- Decrement

        System.out.println(--z);
        System.out.println(--z);
        System.out.println(--z);
        System.out.println(--z);

        z =20;
        z++;
        System.out.println(z);
        System.out.println(z);

        z--;
        System.out.println(z);
        // assignment operator =
         x = 40;
         y = 30;
         // +=
        x += 7;
        // x= x+4;;
        System.out.println(x);
        //-=
        y -= 3;
        //y = y-3;
        System.out.println(y);
        //*=
        x *= 2;
        System.out.println(x);
        // /=
        x /= 2;

        System.out.println(x);
        // %=
        x = 21;
        x %=2;
        System.out.println(x);
        // Comparison Operator
        x = 5;
        y = 6;
        //==
        System.out.println(x==y);
        x++;
        System.out.println(x == y);
        System.out.println(33==33);
        System.out.println(76==45);
        System.out.println(36==36);
        System.out.println( 'B'=='b');
        System.out.println("hello" =="Hello");
        System.out.println("Gul"=="Gul");
        System.out.println(1==1);
        // !=
        System.out.println(x !=y);
        System.out.println(5!=5);
        // >
        System.out.println(5>6);
        System.out.println(8>5);
        x= 6;
        y=10;
        System.out.println(y>x);
        //<
        System.out.println(9<9);
        System.out.println(9<10);
        System.out.println(10<8);
        // >=
        System.out.println(10>=9);
        System.out.println(20>=88);
        System.out.println(100>=100);
        // <=
        System.out.println(10<=11);
        System.out.println(15<=20);
        System.out.println(35<=25);
        System.out.println(11<=11);
        // ask user to enter 2 values => int
        // write java program to compare both values
        // print ==, !=,>,<,>=,<= will write later

        //LOGICAL OPERATORS
        //&& and
        System.out.println(4<5 && 5<8);
        System.out.println(9>5 && 7<=7);
        System.out.println(4>9 && 5 <10);
        // || or
        System.out.println(3!= 6 || 2>1);
        System.out.println(3!= 6 || 2>1);
        System.out.println(8==9 || 10>9);
        System.out.println(30 <20 || 20>100);
        // !
        System.out.println( !(10>5 || 10!=10 ));
        System.out.println(!(10==10 && 20<30));
















    }
}
