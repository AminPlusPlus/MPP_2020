package assignment_l9.prob_7.B;

@FunctionalInterface
public interface TrioFunction<Q,W,E,R> {
    R apply(Q q, W w, E e);
}
