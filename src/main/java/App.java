import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = context.getBean("helloworld", HelloWorld.class);
        HelloWorld bean2 = context.getBean("helloworld", HelloWorld.class);
        System.out.println(bean1 == bean2);

        Cat cat1 = context.getBean("cat", Cat.class);
        Cat cat2 = context.getBean("cat", Cat.class);
        System.out.println(cat1 == cat2);
    }
}