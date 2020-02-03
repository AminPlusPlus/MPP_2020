package assignment_l9.prob_10;


@FunctionalInterface
public interface TrioFunction <T,U,S,R> {
    R apply(T t, U u, S s);
}
