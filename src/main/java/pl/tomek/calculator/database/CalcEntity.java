package pl.tomek.calculator.database;

import java.util.List;

class CalcEntity {

    private Long id;
    private Operator operator;
    private List<Long> numbers;
    private Long result;

    public CalcEntity(Long id, Operator operator, List<Long> numbers, Long result) {
        this.id = id;
        this.operator = operator;
        this.numbers = numbers;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Operator getOperator() {
        return operator;
    }

    public List<Long> getNumbers() {
        return numbers;
    }

    public Long getResult() {
        return result;
    }
}
