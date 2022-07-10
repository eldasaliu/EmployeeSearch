package com.neotech.Lesson21;

public class Barn {

	public static void main(String[] args) {
Animal a=new Animal();
a.size="Big";
a.color="Black";
a.age=5;

a.sleep();
a.eat();
a.displayInfo();
//when we creatin an object of the parent class
//we dont have access to the features of behavior of the child class
//a.breed="Tiger";
//a.bark()
System.out.println("=====");

Dog d=new Dog();
d.size="Medium";
d.color="Gray";
d.age=2;
//dog has an extra variable ,breed
d.breed="Husky";

d.eat();
d.sleep();
d.displayInfo();
//dog has an extra variable,breed
d.bark();

System.out.println();

Puppy p=new Puppy();
//feature coming from the Animal class
p.age=1;
p.color="White";
p.size="Small";
p.breed="Bulldog";
//behaviors coming from the Animal class
p.eat();
p.sleep();
p.displayInfo();
p.bark();
System.out.println();

Cat c=new Cat();
c.age=3;
c.size="Small";
c.color="White";
//we dont have access to the features or behaviors of the Dog class
//c.breed="Persian";
//c.bark();
c.sleep();
c.eat();
c.meow();



	}

}
