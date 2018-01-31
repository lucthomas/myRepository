// Placing the move function inside the carlike function has an advantage and
// disadvantage:

// 1. Disadvantage: move is a local function an therefore must be made everytime it
// is being called by an object (a car such as Amy or Ben). This means that more
// memory is being used (memory for every move function of every car).

// 2. Advantage: we don't need to refer to an object using 'this'.

/*
var carlike = function(obj, loc){
	obj.loc = loc;
	obj.move = function(){
		obj.loc++;
	};
	return obj;
};
*/

// Using a global function allows us to save memory, but 'this' is used to 
// refer to an object car.

/*
var move = function(){
	this.loc++;
};
*/
//------------------------------------------------------------------------------------

// Car Class (use of a lot of memory)

/*
var Car = function(loc){
	var obj = {loc: loc};
	obj.move = function(){
		obj.loc++;
	};
	return obj;
};
*/

// Car Class (use of a little memory)

/*
var Car = function(loc){
	var obj = {loc: loc};
	obj.move = move;
	return obj;
};

var move = function(){
	this.loc++;
};
*/

// Car Class (using extend function)
/*
var Car = function(loc){
	var obj = {loc: loc};
	extend(obj, Car.methods); // extends obj with Car.methods object
	return obj;
};
// Car.methods object
var Car.methods = {
	move: function(){
	this.loc++;
	}
};
// The only issue with the latter is that extend function is not part of native JS.
// So you need to import another opensource JS library.
*/

// Car Class (better version)
/*
var Car = function(loc){
	var obj = Object.create(Car.methods); //Object.create() creates a prototype object
	// This essentially means that we will delegate to Car.methods rather than 
	// copy Car.methods into the Car Class!
	obj.loc = loc;
	return obj;
};
// Car.methods object - Here we build instances of the Class Car!
var Car.methods = {
	move: function(){
	this.loc++;
	}
};
*/

// Car Class (better version - prototypical patterns)
/*
var Car = function(loc){
	var obj = Object.create(Car.prototype); //When using Object.create(), we create
	// a free prototype (not to be declared as var)! 
	obj.loc = loc;
	return obj;
};

Car.prototype.move = function(){
	this.loc++;
};
*/

// Car Class (better version - pseudoclassical patterns)

var Car = function(loc){

	//provided by 'new' automatically is commented

	//this = Object.create(Car.prototype);  
	this.loc = loc;
	//return this;
};

Car.prototype.move = function(){
	this.loc++;
};

// Superclass Car for Vans and Cops in the game

// Superclass Car
var Car = function(){
	var obj = {loc: loc};
	obj.move = function(){
		obj.loc++;
	};
	return obj;
};

// Subclass Van

var Van = function(loc){
	var obj = Car(loc); //refer to superclass
	obj.grab = function(){/*...*/};
	return obj;
};

var Cop = function(loc){
	var obj = Car(loc); //refer to superclass
	obj.call = function(){/*...*/};
	return obj;
};