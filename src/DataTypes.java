import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DataTypes {
    public static void main(String[] args) {
        //short
        short short1 = 1000, short2 = 500, short3 = (short) (short1-short2);
        System.out.println( "the difference is" + short3);
        // int
        int int1 = 1000, int2 = 5000, int3 =int1+int2;
        System.out.println( int3);
        //long
        long long1 = 50, long2 = 100, long3 = long2 - long1;
        System.out.println(long3);
        // float
        float float1 = 10.55f, float2 = 5.95f, float3 = float1 +float2;
        System.out.println(float3);
        // double
        double double1 = 3.5, double2 = 6.8d,double3 = double1- double2;
        System.out.println(double3);
        // eggs, milk, bread, apple, honey
        float eggS = 3.99f;
        double eggD = eggS;

        System.out.println();
        byte milk = 6;
        double bread = 4.50, eggOrganic = 5.99;
        long apple = 10;
        float sum3 = (float) (apple+milk + eggD +bread);
        int  honey = 100;
        short honeyS = (short)honey;
        int sum = honey +milk;
        int sum2 = (int) (honey + apple);
        // daily shopping list of 5 items
        // create var with diff data types
        // find sum all the products
        byte paper = 3 ;
        short toy = 20;
        int aldoBag = 200;
        long Iphone14 = 4500;
        float towel = 10.50f;
        double spray = 15.50;

        float spray1 =(float) (spray + towel);//explicit casting
        System.out.println( spray1);
         int aldoBag2 = aldoBag + toy;// implicit casting
        System.out.println( aldoBag2);
        int aldoBag3 = (int) (aldoBag + spray);
        System.out.println( aldoBag3);
        double sum5 = paper+ toy +aldoBag +spray;
        System.out.println( sum5);






        



    }


}
