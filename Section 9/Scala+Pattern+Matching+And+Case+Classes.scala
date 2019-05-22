
def matchTest(x: Any): Any = x match {
  case 7 => "seven"
  case "two" => 2
  case _ => "something"
}
val isItTwo = matchTest("two")
val isItTest = matchTest("test")
val isItSeven = matchTest(7)


case class Car(brand: String, model: String)
val buickLeSabre = Car("Buick", "LeSabre")

def carType(car: Car) = car match {
  case Car("Honda", "Accord") => "sedan"
  case Car("GM", "Denali") => "suv"
  case Car("Mercedes", "300") => "luxury"
  case Car("Buick", "LeSabre") => "sedan"
  case _ => "Car: is of unknown type"
}
val typeOfBuick = carType(buickLeSabre)
