import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> set0 = new HashSet<>();
        set0.add(1);
        set0.add(1); //OK
        set0.add(null); // ok
        set0.add(null); // ok
        set0.add(4);

        int q = 1;
    }
}
