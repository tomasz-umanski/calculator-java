package pl.tomek.calculator.api;

import java.util.List;

class CalcOutputDTO {

    private Long id;
    private Operator operator;
    private List<Long> numbers;
    private Long result;

    public CalcOutputDTO(Long id, Operator operator, List<Long> numbers, Long result) {
        this.id = id;
        this.operator = operator;
        this.numbers = numbers;
        this.result = result;
    }

    public Long getId() {
        return id;
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
