import config.PersistanceConfig;
import entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.Repository;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersistanceConfig.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD.MM.YYYY");

        context.getBean(Repository.class).save(new Person("name", "surname", simpleDateFormat.parse("03.10.1991")));

        System.out.println(simpleDateFormat.parse("03.10.1991"));
    }
}
