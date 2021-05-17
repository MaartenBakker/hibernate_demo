import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import persistence.entities.Student;

public class DbOperations {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Student tempStudent1 = new Student("Maarten", "Bakker", "maarten@maartenmusic.com");
            Student tempStudent2 = new Student("Kasper", "Bakker", "maarten@maartenmusic.com");
            Student tempStudent3 = new Student("Berend", "Bakker", "maarten@maartenmusic.com");
            session.beginTransaction();
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);
            session.getTransaction().commit();

        } finally {
            factory.close();
        }


    }
}
