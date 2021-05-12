import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Dima", "Kolia", "Vasyl");
//        int count = 0;
//        for (int i = 0; i <= names.size() - 1; i++) {
//            String name = names.get(i);
//            count++;
//            name = count + ". " + name + ", ";
//            if (count % 2 != 0) {
//               System.out.print(name);
//            }
//        }
        String s = fromListToString(names);
        System.out.println(s);
    }
    private static String fromListToString(List<String> names) {
        return names.stream()
                .filter(name -> names.indexOf(name) % 2 != 0)
                .map(name ->  names.indexOf(name) + ". " + name + ", ")
                .collect(Collectors.joining());
    }
}


