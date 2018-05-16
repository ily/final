import java.util.*;

public class Hashcode_Demo {
    public static void main(String[] args){
//        Set<String> arr = new TreeSet<>();
//        String bok = "bok";
//        String koy = "bok";
//        String koy2 = "bok2";
//        String koy3 = "bok3";
//        String koy4 = "bok4";
//        arr.add(koy2);
//        arr.add(bok);
//        arr.add(koy);
//        arr.add(koy3);
//        System.out.println(arr);
//        arr.remove("bok3");
//        System.out.println(arr);

//        List<String> list = new LinkedList<>();
//        list.add(koy3);
//        list.add(koy2);
//        list.add(koy4);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);
//
        List<Integer> yaram = new ArrayList<>();
        yaram.add(5);
        yaram.add(7);
        yaram.add(11);
        yaram.add(12);
        yaram.add(21);

        System.out.println(yaram);
//        for(int i=0; i< yaram.size(); i++){
//            int element = yaram.get(i);
//            //delete numbers between 10 and 20
//            if ((element>=10)&&(element<20)){
//                yaram.remove(i);
//            }
//        }
//        System.out.println(yaram);

        Iterator<Integer> itr = yaram.iterator();
        while (itr.hasNext()){
            int element = itr.next();
            if ((element>=10)&&(element<20)){
                itr.remove();
            }
        }
        System.out.println(yaram);


    }
}
