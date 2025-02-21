import java.util.*;
import java.util.stream.Collectors;

public class Test {

    /*1,2,4,5,0,5,6,0,2,0
    "1,2,4,5,5,6,2,0,0,0"
     */

    static List<Integer> putZerosAtEnd(List<Integer> numbers){
        List<Integer> result=
        numbers.stream().filter(integer -> integer!=0).collect(Collectors.toList());
        int zercounttoBeadded=numbers.size()-result.size();
        while (zercounttoBeadded>=1){
            result.add(0);
            zercounttoBeadded--;
        }
        return  result;
    }

    public static void main(String[] args) {
   
    }
}
