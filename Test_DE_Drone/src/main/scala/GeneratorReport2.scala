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

  val mots = List("unlearnedness", "top-rim", "answerless",
    "cobbing", "selcouth", "Portage", "usherance", "remitment",
    "ubiquinone", "exponents", "megaohms", "immarcescible", "uncoop", "imitate", "Borah Peak", "roundball", "vantage",
    "theme", "smoothies", "Rikers Island", "synthetical", "lippitudes", "disorganised", "water-deer", "nestled", "fizzle", "chiliasms", "weaning", "undertreatment", "chromodynamics", "webers", "lysates",
    "lobbying", "advantage", "scharf", "clodhopping", "kalapooian", "reemerged", "ricers", "forestalls", "ungritted", "trainable", "raspberry-borer", "animanga", "canals", "generic", "budgetary", "amusical", "traditionalist", "goutte", "machination", "unathletically",
    "banqueting-hall", "lichanos", "traceably", "Symonds", "micro-electric", "buffalo", "endogenously", "bicoastals", "uncostliness", "flasks", "nonproportional", "viscosimeter", "vibrometer", "uncompact", "gardencraft", "cogging", "disrepute", "geomagnetically", "gennelman", "after-shaves", "weariless", "bunyon", "unmuddle",
    "transfat", "tremulant", "waldo", "remission", "wind-bag", "fossils", "daddy-longlegs", "Hauptmann", "blood-type", "jib-topsail", "rearrange", "posers", "gore vidal", "liquid-fueled", "nonaspirin", "putrefacient", "bestride", "cattiness", "Northeast", "bankster", "hemichannels", "springform", "sliest", "upbring", "wheezily", "veronica", "image-maker", "misgauge", "theosophist", "hot-house", "combining", "collusion",
    "retrogression", "Pears", "brewing", "eel-trap", "unoriginality", "loudmouths", "unbraids", "wing-net", "soleus", "operatories", "clairvoyance", "Cockaigne", "unaspiring", "ascendant", "peeled", "pareidolia", "kabaya", "speedcubers", "empery", "armedness", "podesta", "Ranke", "mu-meson", "syntelic", "tebeth", "undrugged", "intracellular", "unreligiously", "saltwater", "tawks", "unches", "manichord", "chikore", "tallowing", "moider",
                  "yearly", "tradie", "Vesuvius", "tazzle", "buying", "dessiatinas", "Nafpaktos", "timbal", "Nightingale", "echogram", "crampon", "misimpressions", "nolid", "Meri-Tuuli", "compeers", "olena", "radioactinium", "Orient", "hi-fi", "dyschezia", "unspeckled", "zoophilic",
    "blastments", "recorded", "La Mesa", "Judaeans", "brewing", "scrouges", "corpse-plant", "megaphones", "joggles", "pearl-shell", "gin-fizz", "mantric", "tousles", "transfiguration", "yestermorning", "addenda", "supergenius", "donning", "cheeked", "karyokinetic", "bottom-rot", "reconcilability", "Mordvin", "rewme", "slash", "codder", "logarithm", "masseters", "half-hourly", "mascots", "antiferromagnet", "mead-benches", "retears", 
                  "designs", "osteoarthritis", "nongraphic", "creator", "bigot", "averseness", "thickens", "tirelire", "letter-drop", "attendant", "unrolled", "jovial", "lamp-post", "actinophrys", "budlike", "aurorally", "janitor", "immanently", "unsutured", "timelessness", "Upsidedownland", "rechauffe", "phototherapy", "whipstalk", "adoptive", "stannator", "consequences", "blissless", "bushmen", "bushveldt", "trend", "leptiform", "ultrabasic",
                  "governmental", "readably", "vernacular", "bloodstreams", "succeeded", "tomium", "sublimaze", "castilleia", "recede", "triple-crown", "needier", "Ballard", "peacock-blue", "firehose", "stereociliary", "substitute", "biochemists", "niggeresses", "maggle", "fancy-free", "pseudoseizure", "wynns", "tropicalistas", "feculency", "roominess", "nutmegging", "abrogator", "prolly", "Lake Biwa", "memorabilia", "overpost", "forenamed", "buffy", "apophthegms", "remission", "mailed", "receptor", "electromyograph", 
                  "unsystematized", "speeding", "suppress", "visualised", "trifurcates", "informatics", "unassigned", "arachnoid", "moufflons", "instructeth", "featherbone", "doomsday", "apodosis", "unchilled", "herculean", "locums", "forgettable", "unlegalized", "steamfitting", "large-headed", "monotonia", "wambled", "brewing", "rounders", "waste-valve", "puffinus", "recognizance", "bentwood", "poured", "Toxotes", "managers", "misworded", "vying", "unleafing", "palpability", "xxxvi", "noncanned", "multibillion", "terbinafine", "unrusted", "adsorbed", "diplomatist", "megameter", "trichome", "firelog", "nondrivers", "semi-official", "neurovirulence",
                  "self-starter", "kerygma", "gosmore", "straw-stem", "fourplay", "nightgown", "Quaker", "heartshaped", "trumped", "evince", "toffeelike", "elie wiesel", "wholeheartedly", "borough-court", "regianin", "tongue-lashings", "moaned", "compostables", "sommite", "Mastodons", "saber-legged", "Shetland", "insatiable", "\u00c6olis", "tiepin", "trestletree", "ligneous", "scurviest", "phylogenesis", "skulks", "melanochroic", "mister", "hell-haunted", "Puseyism", "streaked", "IBMer", "animators", "roasters", "haloed", "escarole", "merchantry", "sea-haar", "trophy", "letters", "rescoring", "thyroidectomy", "undern", "tribunician", "profund", "Palio di Siena", "nonintoxicating", "benumbedness", "pot-hole", "thinspiration", "babelike", "eightetethe", "rascetta", "inappropriate", "wrestled", "endorphin")

  def create_random_citizen() = {
    val random = scala.util.Random
    val Nom = nom(random.nextInt(nom.length))
    val Score = random.nextInt(100)

    People(Nom, Score)

  }

  
  def create_report(): PeaceWatcher = {
    val random = scala.util.Random
    val id = random.nextInt(1000)
    val latitude = random.between(-100,100)
    val longitude = random.between(-100,100)
    val people = List.fill(random.nextInt(4))(create_random_citizen().name,create_random_citizen().peaceScore).toMap
    val word = List.fill(random.nextInt(6))(mots(random.nextInt(mots.length)))
    PeaceWatcher(id, latitude, longitude, people, word)
  }
  
}
