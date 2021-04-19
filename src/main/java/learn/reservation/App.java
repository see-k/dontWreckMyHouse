/**
 * @mainpage Capsule project
 * @author Chike Okonta
 * @version 1.0.1
 * @since 04/19/2021
 * @file app.java
 * @page Mastery project Dev10
 * <p> created as a Dev10 project. Assessment: Don't wreck my house</p>
 * @see https://github.com/see-k/dontWreckMyHouse/blob/main/docs/README.md
 * */

package learn.reservation;
import learn.reservation.ui.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("classpath:data.properties")
public class App {
    public static void main(String[] args) {

        // 1. We pass the App.class, this class, as a constructor argument.
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        // 3. The context works the same as the XML context.
        Controller controller = context.getBean(Controller.class);
        // Run the app!
        controller.run();
    }
}