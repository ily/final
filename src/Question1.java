public class Question1 {

    public static void main(String[] args){
        System.out.println(triangleType(100,5,3));
    }

    public static String triangleType(int a, int b, int c){
        if (a+b>=c || b+c>=a || a+c>=b){
            throw new IllegalArgumentException("hata amik");
        }
        if (a==b && a==c) {
            return "Equilateral";
        }else if ((a==b && a!=c) || (b==c && b!=a) || (a==c && b!=a)){
            return "Isosceles";
        }else{
            return "Scalene";
        }

    }
}
