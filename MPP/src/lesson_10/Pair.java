package lesson_10;

public class Pair <T,S> {
    T x;
    S y;


    public Pair() {
    }

    public Pair(T x, S y) {
        this.x = x;
        this.y = y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(S y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public S getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x.getClass().getSimpleName() +
                ", y='" + y.getClass().getSimpleName() + '\'' +
                '}';
    }
}
