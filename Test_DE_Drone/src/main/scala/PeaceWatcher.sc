object PeaceWatcher {

  case class PeaceWatcher(id: Int, latitude: String, longitude: String, people: Map[String, Int], word: List[String])

  def peaceWatcher_data(data: PeaceWatcher ) : String = {
    val t = "id :" + data.id + "latitude :" + data.latitude + "longitude :" + data.longitude + "people :" + data.people + "word :" + data.word
    return (t)
  }

}