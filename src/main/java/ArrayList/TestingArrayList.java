package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30,10,20));
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);

        numbers.trimToSize();

        for (int i = 0; i < numbers.size(); i++){
            int element = numbers.get(i);
            System.out.println(element);
        }

        for (int item : numbers){
            System.out.println(item);
        }

        numbers.stream().forEach(element -> {
            System.out.println(element);
        });

        ArrayList<String> namesOfEmployees = new ArrayList<>(Arrays.asList("Steve", "Lily", "Sam"));
        namesOfEmployees.stream().forEach(names -> {
            String namesInCaps = names.toUpperCase();
            System.out.println(namesInCaps);
        } );

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            int el = it.next();
            System.out.println(el);
        }

    }
}
