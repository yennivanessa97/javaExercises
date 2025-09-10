import java.util.ArrayList;
import java.util.List;

public class NamesList {
    public static void main(String[] args) {
        List<String> Names;
        Names = new ArrayList<>();

        Names.add("Colombia");
        Names.add("Bolivia");
        Names.add("México");

        // The function size() prints the size of the list

        System.out.println(Names.size());

        // The function .contains() prints true if the given parameter exists in the list, otherwise it returns false.

        System.out.println(Names.contains("Colombia"));



    }
}
