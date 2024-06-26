package pl.edu.pbs.odwrocone_sterowanie_klasy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.Scanner;
@Service
//@Primary
@Profile("console")
public class ConsoleMessageProducer implements MessageProducer {
    private final Scanner scanner;
    public ConsoleMessageProducer(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public String getMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to print:");
        return scanner.nextLine();
    }
}
