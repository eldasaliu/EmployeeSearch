package com.neotech.Lesson20;
public class Students {//Write a java program of Class Students that takes students name and 3 subject grades. 
//Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
//Your program should print an average mark of each studentsname.package com.neotech.Lesson20;
	String name;
	int grade1,grade2,grade3;
	
	Students(String studentname,int g1,int g2,int g3 ){
		
		name=studentname;
		grade1=g1;
		grade2=g2;
		grade3=g3;
	}
	int average()

	{
		return(grade1+grade2+grade3)/3;
		
			
		
	}
	public static void main(String[] args) {
		
	
Students a=new Students("Elda",100,95,90);
Students b=new Students("Liam",80,95,97);
Students c=new Students("JAcob",70,85,90);
System.out.println(a.name+"has the average of"+a.average());
System.out.println(b.name+"has the average of"+b.average());
System.out.println(c.name+"has the average of"+c.average());

// if we have no constructor and java calls default
//Student d = new Student(); // does not work if you have defined a constructor but not a default one


}
}
