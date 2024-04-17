package pl.edu.pbs.odwrocone_sterowanie_klasy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.Scanner;
@SpringBootApplication
public class OdwroconeSterowanieKlasyApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OdwroconeSterowanieKlasyApplication.class, args);
		MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
		messagePrinter.printMessage();
		MessageController messageController = context.getBean(MessageController.class);
		messageController.mainLoop();
	}
	@Bean
	Scanner scanner() {
		return new Scanner(System.in);
	}
}

