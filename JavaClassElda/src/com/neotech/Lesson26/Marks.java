package com.neotech.Lesson26;

public abstract class Marks {
//	We have to calculate the average of marks obtained in three subjects by student A and by student B.
//	Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average 
//	percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'. 
//	The constructor of student A takes the marks in three subjects as its parameters and the marks in 
//	four subjects as its parameters for student B. Test your code!
	public abstract double getAverage();
	
}
class StudentA extends Marks
{
	int mark1,mark2,mark3;
	StudentA(int mark1,int mark2,int mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		return result;
	}
	@Override
	public double getAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class StudentB extends Marks
{
	int mark1,mark2,mark3,mark4;
	StudentB(int mark1,mark2,mark3,mark4){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
		
	}
	@Override
	public double getAverage() {
		return 0;
	}
}