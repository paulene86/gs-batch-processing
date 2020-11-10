package com.example.batchprocessing.job;

import com.example.batchprocessing.domain.Person;
import org.springframework.batch.item.ItemReader;

public class PersonItemReader implements ItemReader<Person> {

    @Override
    public Person read() {
        return null;
    }
}
