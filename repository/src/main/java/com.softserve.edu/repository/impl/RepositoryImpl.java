package repository.impl;


import entity.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import repository.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    @PostConstruct
    private void init() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(Person entity) {
        String sql = "INSERT INTO securitynet.person " +
                "(firstName, lastName, dateOfBirth) VALUES (?, ?, ?)";

        jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(sql, entity.getFirstName(),
                entity.getLastName(), entity.getDateOfBirth()
        );
    }

    @Override
    public void update(Person entity) {

        System.out.println(entity);

        String sqlUpdate = "UPDATE securitynet.person SET firstName=?, lastName = ?, dateOfBirth = ? WHERE ID = ? ";
        jdbcTemplate.update(sqlUpdate, entity.getFirstName(), entity.getLastName(), entity.getDateOfBirth(), entity.getId());
    }

    @Override
    public Person findById(int id) {
        String sqlSelect = "SELECT * FROM securitynet.person WHERE ID = ?";
        Person person = (Person) jdbcTemplate.queryForObject(sqlSelect, new Object[]{id}, new BeanPropertyRowMapper(Person.class));
        return person;
    }

    @Override
    public List getAll() {
        String sqlSelect = "SELECT * FROM securitynet.person";
        List<Person> personList = jdbcTemplate.query(sqlSelect, new RowMapper<Person>() {


            public Person mapRow(ResultSet result, int rowNum) throws SQLException {
                Person person = new Person();
                person.setId(result.getInt("id"));
                person.setFirstName(result.getString("firstName"));
                person.setLastName(result.getString("lastName"));
                person.setDateOfBirth(result.getDate("dateOfBirth"));

                return person;
            }
        });
        return personList;
    }

    @Override
    public void delete(int id) {
        String sqlDelete = "DELETE FROM securitynet.person WHERE id=?";
        jdbcTemplate.update(sqlDelete, id);
    }
}
