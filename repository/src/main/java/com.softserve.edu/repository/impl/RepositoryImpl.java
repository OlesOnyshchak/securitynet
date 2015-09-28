package repository.impl;


import entity.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import repository.Repository;

import javax.sql.DataSource;
import java.util.List;

@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(Person entity) {
        String sql = "INSERT INTO securitynet.person " +
        "(firstName, lastName, dateOfBirth) VALUES (?, ?, ?)";

        jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(sql, new Object[] { entity.getFirstName(),
                entity.getLastName(), entity.getDateOfBirth()
        });

    }

    @Override
    public void update(entity.Person entity) {

    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }
}
