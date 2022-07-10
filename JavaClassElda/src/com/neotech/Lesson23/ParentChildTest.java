package com.neotech.Lesson23;

import com.neotech.Lesson23.Parent.Child;

public class ParentChildTest {

	public static void main(String[] args) {
Parent p=new Parent();
//p.hello();//this is private we cannot access this method
Parent.bye();//I cant not say just bye because iam not in the same class
//it is working but iits not ccorect way to use p.bye
System.out.println();
Child ch =new Child();
//ch.hello we cant access because is private ony from Parent
Child.bye();




	}

}
