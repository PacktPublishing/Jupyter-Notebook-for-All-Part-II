
var mutableList = List(1, 2, 3);
var immutableList = scala.collection.immutable.List(4, 5, 6);
mutableList.updated(1, 400);
immutableList.updated(1, 700);


