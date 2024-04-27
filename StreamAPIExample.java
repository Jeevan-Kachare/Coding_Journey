import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {



    public static void main(String args[]){

        List<Integer> al = Arrays.asList(12,1,12,22,12);

       List<Integer> a=  al.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());

        System.out.println(a);


        List<Integer> aa= al.stream()
                .map(i-> i+10)
        .collect(Collectors.toList());

        System.out.println(aa);

        //this method returns number of elements present in the stream.

        long countnumber =al.stream()
                .count();

        System.out.println(countnumber);


        List<Integer> sort=al.stream()
                .sorted().collect(Collectors.toList());

        System.out.println("Natural Sorting Order"+sort);

        List<Integer> sort1=al.stream()
                .sorted((s1,s2)-> s1.compareTo(s2)).collect(Collectors.toList());

        System.out.println("customized sorting order"+sort1);


       int min= al.stream()
                .min((s1,s2)->s1.compareTo(s2)).get();

        System.out.println("minimum value"+min);

        int max=al.stream()
                .max((s1,s2)->s1.compareTo(s2)).get();

        System.out.println("maximum value"+max);


        al.stream()
                .forEach(s-> System.out.println(s));

        Integer[] ir = al.stream()
                .toArray(Integer[]:: new);

        int[] arr={10,2,3,4,5,66,0};

        Stream s= Stream.of(arr);

        s.forEach(System.out::println);





    }
}
