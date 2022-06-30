package pl.tomek.calculator.database;

import java.util.Optional;

public interface Database {
    Optional<CalcEntity> getById(Long id);

    CalcEntity save(CalcEntity calcEntity);
}
