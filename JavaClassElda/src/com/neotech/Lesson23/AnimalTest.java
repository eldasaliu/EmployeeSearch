package com.neotech.Lesson23;

public class AnimalTest {

	public static void main(String[] args) {
	Animal obj1=new Animal();
	//only methods of the animals class are avaiable
	obj1.eat();
	obj1.sleep();
Tiger obj2=new Tiger();
//all methods of the tiger clas are avalibale
obj2.eat();
obj2.sleep();
obj2.run();

Animal obj3=new Tiger();//we are casting ///non primitiv casting //Upcasting
//object of tiger class is assigned to Animal type object
obj3.eat();
obj3.sleep();
//obj3.run//we are getting compile error ,method run is not dfined in the animal class

//Down casting doesnt work like this Tiger obj4=new Anima();
//Downcasting
Tiger obj5=(Tiger) obj3;//you can downcast only objects that are tigers
obj5.run();
	}
	
	}
