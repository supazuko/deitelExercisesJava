package tictactoe;

public enum Value {
    X, O, EMPTY;

    @Override
    public String toString() {
        String value = "";
        switch (this) {
            case X -> value = "O";
            case O -> value = "X";
            case EMPTY -> value = "";
        }
        return value;
    }
}
