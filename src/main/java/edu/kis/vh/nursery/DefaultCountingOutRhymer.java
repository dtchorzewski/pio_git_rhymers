package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int FULL = 11;

    private final int[] numbers = new int[NUMBERS_SIZE];

    private int total = EMPTY;

    /**
     * Count in.
     *
     * @param in the in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Gets total.
     *
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Call check boolean.
     *
     * @return the boolean
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Is full boolean.
     *
     * @return the boolean
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * Peekaboo int.
     *
     * @return the int
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Count out int.
     *
     * @return the int
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}