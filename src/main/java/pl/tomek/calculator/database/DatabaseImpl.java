package pl.tomek.calculator.database;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Component
class DatabaseImpl implements Database {

    private final List<CalcEntity> data = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Optional<CalcEntity> getById(Long id) {
        return this.data.stream().filter(calcEntity -> calcEntity.getId().equals(id)).findFirst();
    }

    @Override
    public CalcEntity save(CalcEntity calcEntity) {
        calcEntity.setId(counter.incrementAndGet());;
        this.data.add(calcEntity);
        return calcEntity;
    }
}

