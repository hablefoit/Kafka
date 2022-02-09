package antonio.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.concurrent.ExecutionException;

public interface ConsumerFuncion<T> {
    void consume(ConsumerRecord<String,T> record) throws Exception;
}
