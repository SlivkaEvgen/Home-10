import java.util.Arrays;
import java.util.List;

public class T1 {     //gotovo!

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Dima", "Kolia", "Vasyl");
        int count = 0;
        for (int i = 0; i <= names.size() - 1; i++) {
            String name = names.get(i);
            count++;
            name = count + ". " + name + ", ";
            if (count % 2 != 0) {
               System.out.print(name);
            }
        }
    }
}

