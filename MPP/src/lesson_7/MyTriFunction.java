package lesson_7;

@FunctionalInterface
public interface MyTriFunction <T> {
    T apply(T x, T y, T z);
    String toString();
    int hashCode();

}


