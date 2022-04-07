object GeneratorReport2 {

  case class PeaceWatcher(id: Int, latitude: Float, longitude: Float, people: Map[String, Int], word: List[String])
  case class People (name: String, peaceScore : Int)
  val nom = List("Clifford", "Charles", "Fredia", "Shawn", "Danny", "Jimmie", "Melissa", "Eugene", "Ismael", "Todd", "Bridget",
    "Howard", "Jack", "Chad", "Rita", "Clyde", "Kathryn", "Robert", "Joseph", "Marvin", "Fred", "Dorothy", "Jody", "Maureen",
    "Kendra", "Ellis", "David", "Emily", "Michelle", "Rosendo", "Daniel", "Joanne", "Sophie", "Kasi", "Victor", "Lula",
    "Erika", "Hazel", "Jack", "John", "Jennifer", "Gary", "Tara", "Christine", "Tammie", "Peter", "David", "Stacy",
    "Robert", "Michele", "Alice", "Carroll", "Christine", "Jason", "Carlos", "Sarah", "Carol", "Stanley", "David",
    "Alvin", "Annemarie", "Arlene", "Rose", "Tamika", "Willis", "Steven", "Michelle", "Joanne", "Terry", "Maria",
    "Trudie", "Diane", "Trevor", "Pia")

