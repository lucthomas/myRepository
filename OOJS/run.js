// Using carlike decorator code to make a car!

/*
var amy = carlike({}, 1);
amy.move();
var ben = carlike({}, 9);
ben.move();
*/

//------------------------------------------------------------------------------------

// Using Class Car to make a car!
/*
var amy = Car(1);
amy.move();
var ben = Car(9);
ben.move();
*/
//-------------------------------------------------------------------------------------

// Using new Class - pseudoclassical patters

var amy = new Car(1);
amy.move();
var ben = new Car(9);
ben.move();

// Using Superclass and Subclasses

var amy = Van(1);
amy.move();
var ben = Van(9);
ben.move();
var cali = Cop(2);
cali.move();
cali.call();