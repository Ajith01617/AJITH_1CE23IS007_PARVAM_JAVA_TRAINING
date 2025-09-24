
import java.util.ArrayList;

class User {

    Integer id;

    String name;

    public User(Integer ids, String name) {
        this.id = ids;
        this.name = name;
    }

    public Integer getIds() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User [ids=" + id + ", name=" + name + "]";
    }

}

public class Challenge {

    public static void main(String[] args) {
        ArrayList<User> emp = new ArrayList<>();
        emp.add(new User(2, "Ajith"));
        emp.add(new User(3, "Arjun"));
        int k = 2;
        for (User i : emp) {
            if (i.getIds() == k) {
                System.out.println(i.getName());
                return;
            }

        }
         System.out.println("id not present");
    }

}
