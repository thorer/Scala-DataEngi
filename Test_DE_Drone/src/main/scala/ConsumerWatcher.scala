import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.kafka.clients.consumer.{ConsumerRecords, KafkaConsumer}
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.kafka.common.serialization.StringSerializer
import GeneratorReport2.PeaceWatcher

import java.util
import java.util.Properties
import java.time.Duration
import java.io.File
import scala.collection.JavaConverters._
import java.util.Properties

object ConsumerWatcher extends App {

    val consumerProperties = new Properties()
    consumerProperties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
    consumerProperties.put(ConsumerConfig.GROUP_ID_CONFIG, "1")
    consumerProperties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, classOf[StringDeserializer])
    consumerProperties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, classOf[StringDeserializer])

    val consumer = new KafkaConsumer[String, String](consumerProperties)
    consumer.subscribe(util.Collections.singletonList("PeaceWatcher4"))

    def ConsumerLoop(consumer: KafkaConsumer[String, String]) {
      val records = consumer.poll(Duration.ofMillis(2000))
      records.asScala.foreach(
        record => println("offset =" + record.offset() + ", key = " + record.key() + ", value = " + record.value() )
      )
      ConsumerLoop(consumer)
    }
    ConsumerLoop(consumer)


}
