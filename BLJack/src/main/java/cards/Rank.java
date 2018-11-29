package cards;

/**
 * Created by ruslangramatic on 11/19/18.
 */
public enum Rank {
    R6(6),
    R7(7),
    R8(8),
    R9(9),
    R10(10),
    J(10), //валет
    Q(10), //дама
    K(10), //король
    A(11); //туз

    private Integer value;
    Rank(Integer value) {
        this.value = value;
    }
    public Integer getValue() {
        return value;
    }
}
