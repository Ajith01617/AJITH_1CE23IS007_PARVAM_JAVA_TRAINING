
import java.util.HashMap;

public class HM1 {

    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(1, "Ajith");
        student.put(3, "Arjun");
        student.put(2, "Akira");
        
        student.forEach((k, v) -> System.out.println(k + ":" + v));
        System.err.println("///////////");
        for (int i = student.size(); i > 0; i--) {
            System.out.println(i+":"+student.get(i));
        }

    }
}
