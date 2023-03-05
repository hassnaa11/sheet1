import java.util.Scanner;

public class sheet_1 {
    public static void main(String[] args) {
        //Q0
        System.out.println("Hello");
        System.out.println("Hassnaa Hossam");
        //Q1
        //a)
        //Scanner sc= new Scanner(System.in);
        //float a= sc.nextFloat(101.0/3.0);
        System.out.println((101.0+0.0)/3.0);
        //b)
        System.out.println(Math.pow(3.0,-6)*10000000.1);
        //c)
        System.out.println((false&&false)||(true&&true));
        //d)
        System.out.println((false||false)&&(true&&true));
        //e)
        System.out.println(-5+8*6);
        //f)
        System.out.println((55+9)%9);
        //g)
        System.out.println(20+ -3*5/8);
        //h)
        System.out.println(5+15/3*2-8%3);

        //Q2
        Scanner sc= new Scanner(System.in);
        float d= sc.nextFloat();
        float h= sc.nextFloat();
        System.out.printf("Volume= %f \n",(3.14/4.0)*d*d*h);
        //Q3)
        System.out.println("enter number of minutes");
        int minutes= sc.nextInt();
        int hours= minutes/60;
        int remain= minutes-hours*60;
        System.out.printf("%d minute= %d hours + %d minute ",minutes , hours , remain );
        //Q4)
        System.out.println("enter number of days");
        int days= sc.nextInt();
        int years= days/365;
        int months=( days-years*365)/30;
        int remains= days-years*365-months*30;
        System.out.printf("%d day= %d years + %d months +%d day ",days , years , months ,remains);
        //Q5)
        int cars= sc.nextInt();
        int capacity= sc.nextInt();
        System.out.printf("\nthe number of garages needed is %d", Math.ceilDiv( cars, capacity) );
        //Q6)
        System.out.println("\ninput a degree in fahrenheit:");
        float degreef= sc.nextFloat();
        System.out.printf("%f degree fahrenheit is equal to %f in celsius",degreef,(degreef-32)*(5.0/9.0) );
        //Q7)
        System.out.println("\nenter (x1,y1) and (x2,y2) ");
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();
        System.out.printf("dist= %f ",Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        //Q8)
        System.out.println("\ninput a value for inch: ");
        float inches=sc.nextFloat();
        System.out.printf("\n%.1f inch is %f meters ",inches , inches*0.0254);
        //Q9)
        System.out.println("\ninput the number of minutes: ");
        int minutess= sc.nextInt();
        int yearss=minutess/60/24/365;
        int dayss=(minutess-yearss*365*24*60)/60/24;
        System.out.printf("\n%d minutes is approximately %d years and %d days",minutess,yearss,dayss);
        //Q10)
        System.out.println("\nInput distance in meters: ");
        int meters=sc.nextInt();
        System.out.println("\nInput hour: ");
        int hour=sc.nextInt();
        System.out.println("\nInput minutes: ");
        int minute=sc.nextInt();
        System.out.println("\nInput seconds: ");
        int seconds=sc.nextInt();
        float speed=(float)meters/((float)seconds+(float)hour*60*60+(float)minute*60);
        System.out.printf("\nYour speed in meters/second is %f",speed);
        System.out.printf("\nYour speed in km/h is %f",speed*18/5);
        //Q11)
        System.out.println("\nInput 1st integer: ");
        int i1 =sc.nextInt();
        System.out.println("\nInput 2nd integer: ");
        int i2 =sc.nextInt();
        System.out.printf("\nSum of two integers: %d\nDifference of two integers: %d\nProduct of two integers: %d\nAverage of two integers: %d\nMax integer: %d\nMin integer: %d\n",i1+i2,i1-i2,i1*i2,(i1+i2)/2,Math.max(i1,i2),Math.min(i1,i2));

    }
}
