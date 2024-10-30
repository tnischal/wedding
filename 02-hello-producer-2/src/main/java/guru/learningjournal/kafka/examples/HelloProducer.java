package guru.learningjournal.kafka.examples;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HelloProducer {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String args[]){
        logger.info("Creating Kafka Producer");
        Properties properties = new Properties();
        properties.put(ProducerConfig.CLIENT_ID_CONFIG,AppConfigs.applicationID);
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

    }
}
