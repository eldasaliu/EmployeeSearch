package com.neotech.Lesson24;

import com.neotech.Lesson24.Computer.Apple;
import com.neotech.Lesson24.Computer.Dell;
import com.neotech.Lesson24.Computer.HP;
import com.neotech.Lesson24.Computer.Lenovo;

public class ComputerTest {

	public static void main(String[] args) {
		//create an object of Apple clas and assing it to an Apple variable type
		Apple app=new Apple("Apple");
		HP hp =new HP("HP");
		//array want same data types
		int[]values= {1,2,3,4,6,8,9,12};
		//all of the classes can be type of computer
		Computer c1,c2;
		c1=new Apple("Apple");//we did this double d1=4
		c2=new Apple("Lenovo","Black");
		
		//so we can create an array oof computers
		Computer [] comps= {new Apple("Apple"),new HP("HP"),new Dell("Dell"),new Lenovo("Lenovo","Red")};
		//or like this Compute[] c={c1,c2	}
for(Computer c: comps) {
	System.out.println("The brand is "+ c.brand);
	c.run();
	//wwhar if we try to access some other methods?
	//c.save()/;//thos method does not belong to Computer class
	
	
	//we can have arrays for the specific clsses
	//it has to include only instance of that class
	Apple[] apple = {new Apple("Apple1"), new Apple("Apple2")};
	
}


	
	}
}

