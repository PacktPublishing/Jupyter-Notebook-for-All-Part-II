
var factor = 7
val multiplier = (i:Int) => i * factor
val a = multiplier(11)
val b = multiplier(12)

def squared(x: Int): Int = x * x
def cubed(x: Int): Int = x * x * x

def process(a: Int, processor: Int => Int): Int = {processor(a) }

val fiveSquared = process(5, squared)
val sevenCubed = process(7, cubed)


