import java.util.LinkedList;
public class link {
    public static void main(String[] args) {
        LinkedList<String> l1= new LinkedList<>();
        l1.add("apple");
        l1.add("banana");
        // l1.remove();
        // l1.remove();
  l1.set(0,"cherry");
  int size =l1.size();
        // l1.remove("banana");
        // l1.remove("cherry");

        System.out.println(size );
        System.out.println(l1 );

    }
}
