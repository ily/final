import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Question3 {
    int x;
    public static void main(String[] args) {
        Question3 q3 = new Question3();
        int a = 3;
        q3.x = a;
       // System.out.println(q3.x+ " " + a);
        int b = increment(a, q3, q3.x);
        //System.out.println("a= " + a + ", b= " + b + ", q3.x= " + q3.x);


       // System.out.println(rec(3));
       int[] arr =  {1,22,1,3,44,5,7};
       //System.out.println("sec "+ second(arr));
//
        Collection<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
//        System.out.println(list);
//        list.add(31);
//        System.out.println(list);
//        list.remove(31);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.size());
            list.remove(i); // remove item
        }
        System.out.println(list);

    }
    private static int increment(int a, Question3 q, int c){
        return a++ + q.x++ + c++;
    }

    public static int rec(int n){
        if (n==0){
            return 1;
        }else{
            return 1 + 1/rec(n-1);
        }
    }

    public static int second(int[] arr){
        int biggest = -1;
        int sec = -1;
        if (arr.length<=1){
            return -1;
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i]>biggest){
                sec=biggest;
                biggest=arr[i];
            }else if (arr[i]>sec){
                sec=arr[i];
            }
            System.out.println(arr[i]);
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i]==sec){
                return -1;
            }
        }
        return sec;
    }
}