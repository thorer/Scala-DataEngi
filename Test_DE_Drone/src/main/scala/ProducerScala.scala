import GeneratorReport2.{PeaceWatcher, People}

import scala.util.Random
import java.time.format.DateTimeFormatter
import java.time.LocalDateTime
import java.util.Properties
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}
import org.apache.kafka.common.serialization.StringSerializer
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.kafka.streams.StreamsConfig

import scala.annotation.tailrec
import scala.math.Ordered.orderingToOrdered
import scala.math.Ordering.Implicits.infixOrderingOps


object ProducerScala extends App {

  val producerProperties: Properties = new Properties()
  producerProperties.put("bootstrap.servers","localhost:9092")
  producerProperties.put(ProducerConfig.CLIENT_ID_CONFIG, "Watcher_test2")
  producerProperties.put("key.serializer", classOf[StringSerializer].getName)
  producerProperties.put("value.serializer", classOf[StringSerializer].getName)
  val producer = new KafkaProducer[String, String](producerProperties)
  val topic = "PeaceWatcher4"


  def createReportString(t: PeaceWatcher): Unit = {
    t.people.foreach {
      case(name, peaceScore) if peaceScore > 95 => println(" BIG ALERT !!!  {The citizen " + name + " with a PeaceScore of :  " +
        peaceScore + " is in Danger, please help him !  Send a team to the location: " +
        t.latitude + "/" + t.longitude + " End of BIG ALERT} THANK YOU AND NICE PEACE ")
      case _ =>
    }
  }



  def normalAlertReport(t :PeaceWatcher): String = {
    "The PEACE WATCHER report { The Drone id :  " + t.id + ", the position :  " +
      t.latitude.toString + " / " + t.longitude.toString +
      ", The peoples : " + t.people + ", The words heard : " + t.word + ", End of Report } THANK YOU AND NICE PEACE"
  }

  def reportMessage(k: KafkaProducer[String, String]) {
    val reportWatcher = GeneratorReport2.create_report()
    val createReportString2 = normalAlertReport(reportWatcher)
    val message = new ProducerRecord[String, String](topic,reportWatcher.id.toString,createReportString2)
    k.send(message)
    Thread.sleep(2000)
    createReportString(reportWatcher)
    reportMessage(k)
  }
  reportMessage(producer)




}


