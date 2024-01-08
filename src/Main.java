import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(120);
        list.add(450);
        list.add(450);
        list.add(8);
        list.add(43);
        list.add(92);
        list.add(33);
        list.add(8);
        list.add(10);
        list.add(1);

        list.forEach(System.out::println);
        System.out.println("_________________________________-");

        List<Integer> unique = list.stream().distinct().toList();
        unique.forEach(System.out::println);
        System.out.println("_________________________________-");

        List<Integer> even = unique.stream().filter(n -> (n % 2) == 0).toList();
        even.forEach(System.out::println);
        System.out.println("_________________________________-");

        int sum = even.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}