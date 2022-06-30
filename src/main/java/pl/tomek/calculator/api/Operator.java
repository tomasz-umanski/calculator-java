package pl.tomek.calculator.api;

enum Operator {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    private final String representation;

    Operator(String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return this.representation;
    }

    static Operator fromValue(String value) {
        switch(value) {
            case "+":
                return ADD;
            case "-":
                return SUB;
            case "*":
                return MUL;
            case "/":
                return DIV;
            default:
                return null;
        }
    }
}
