var Car = function(loc){
	//this = Object.create(Car.prototype);
	this.loc = loc;
	//return this;
};

Car.prototype.move = function(){
	this.loc++;
};

var Van = function(loc){
	//this = Object.create(Van.prototype);
    Car.call(this, loc); //We call upon Car with this (of Van) and loc (of Van)
	//return this;
};

Van.prototype = Object.create(Car.prototype); //In order to use .move() we copy the
// Car.prototype object into Van.prototype. The problem however is that the
// .constructor (console.log(amy.constructor))refers to Car instead of Van.
// We can solve this problem doing the following:
Van.prototype.constructor = Van;
// Now, we declared the constructor of Van.prototype to be Van!

// Finally, we add functions specific to Van:
Van.prototype.grab = function(){
	/*...*/
};