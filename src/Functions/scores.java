package Functions;

public class scores {
    int x = 0;
    int o = 0;

    public int scoreO() {
        o++;
        System.out.println(o);
        return o;
    }

    public int scoreX() {
        x++;
        System.out.println(x);
        return x;
    }
}
