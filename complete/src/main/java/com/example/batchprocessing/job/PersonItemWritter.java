package com.example.batchprocessing.job;

import com.example.batchprocessing.domain.Person;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class PersonItemWritter implements ItemWriter<Person> {

    @Override
    public void write(List<? extends Person> list) throws Exception {
        /** new JdbcBatchItemWriterBuilder<Person>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO people (first_name, last_name) VALUES (:firstName, :lastName)")
                .dataSource(null)
                .build();
         */

    }
}
