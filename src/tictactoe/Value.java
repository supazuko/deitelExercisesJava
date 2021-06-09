package tictactoe;

public enum Value {
    X,
    O,
    EMPTY;

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

    public static void main(String[] args) {
        System.out.println(Value.X.name());
        System.out.println(Value.X.ordinal());
    }
}

