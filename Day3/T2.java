import java.util.ArrayList;

public class T2 {
    public static void main(String[] args) {
       ArrayList<Integer> no = new ArrayList<>();
       no.add(1);
       no.add(2);
       no.add(3);
       no.add(4);
       no.add(5);
       System.out.println(no);
       no.removeIf(n -> (n%2)==0);
       System.out.println(no);
    }
}
