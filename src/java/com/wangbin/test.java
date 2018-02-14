package com.wangbin;

/**
 * Created by wangbin on 2018/02/14.
 */
public class test {

   static double x;

    public static void main(String[] args){

        // 测试Math.random()
        testRandom();

        // 测试thread的lambda表达式
        //testThreadLambda();
    }

    private static void testThreadLambda() {
        Thread t = new Thread(){
            int x =0;
            @Override
            public void run() {
                while (x<10){
                    x++;
                    System.out.printf("匿名thread...%d...%n",x);
                }
            }
        };

        // lambda
        Thread t1 = new Thread(()->{
            int y=2;
           while (y<20){
               y+=2;
               System.out.printf("lambda...%d...%n",y);
           }
        });

        t.start();
        t1.start();
    }

    private static void testRandom() {
        System.out.println(x);
        /*for(int i=0;i<20;i++){
            int result = (int)(Math.random()*10);
            System.out.println("--->"+result);
        }*/
    }


}
