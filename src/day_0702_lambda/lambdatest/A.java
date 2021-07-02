package day_0702_lambda.lambdatest;

@FunctionalInterface
interface B{
    public int run(int x, int y);
}

public class A {
    public static void main(String[] args){
        B b = Integer::sum;
        System.out.println(b.run(5,7));

        b = Integer::sum;
        System.out.println(b.run(5,5));

        b = A::sum;
        System.out.println(b.run(3,2));
    }
    public static int sum(int x,int y){
        return x+y;
    }
}
