import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<Integer> Numbers;

        Numbers = new ArrayList<>();

        // With the function .add, you can add an element in the List
        Numbers.add(1);
        Numbers.add(15);
        Numbers.add(21);

        //With the function .remove, you can remove an element in the list
        Numbers.remove(1);


        System.out.println(Numbers.get(0));
        System.out.println(Numbers.get(1));
    }
}
