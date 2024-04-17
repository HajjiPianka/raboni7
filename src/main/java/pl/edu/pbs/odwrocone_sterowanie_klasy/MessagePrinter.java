package pl.edu.pbs.odwrocone_sterowanie_klasy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pbs.odwrocone_sterowanie_klasy.MessageProducer;
@Service
public class MessagePrinter {
    private final MessageProducer messageProducer; // zmieniony typ
    @Autowired
    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }
    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
