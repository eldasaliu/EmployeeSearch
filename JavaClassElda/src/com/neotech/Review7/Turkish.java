package com.neotech.Review7;


	public class Turkish extends MethodOverridingHuman {
		Turkish (String name){
		super(name);
		
		}
		@Override
		//when overriding the signature must be the same
		public void talk() {
			System.out.println("Mehraba");
		}
		public void makeBakllava() {
			System.out.println(name+" makes the best bakllava in the World ");
}
		public static void main(String[] args) {
			Turkish t=new Turkish("Elda");//UP -casting ,automaticlly
			t.talk();
			t.makeBakllava();
			Turkish t1=(Turkish )t;
			t1.makeBakllava();//down casting has to be done manually
//		Turkish t2=(Turkish) h3;
//		t2.makeBakllava();//this will give run time error
//		
			System.out.println();
			American us1=new American("Donald"," 123-785-47");//we creating an object 
			us1.talk();
			us1.taxReturn();
			
			MethodOverridingHuman h5=us1;//up-casting,implicity
			System.out.println("Name-->"+ h5.name);
			h5.talk();
			//h5.taxReturn();
			American us2= (American)h5;//downcasting explicity or manually
			us2.taxReturn();
			
			
			System.out.println(" Power of Polymorphisem");
			
			
			
			MethodOverridingHuman [] humans=new MethodOverridingHuman [6];
		humans[0]=h1;
		humans[1]=h2;
		humans[2]=h3;
		humans[3]=h4;
		humans[4]=h5;
		humans[5]=new American("Eric","245-453-45");//up casting
		//this is possible only because of inheritance
		
		for(MethodOverridingHuman element:humans) {
			System.out.println("-----");
			element.talk();
			if(element instanceof Albanian) {
				Albanian alb=(Albanian) element;
				alb.AlbanianDance();
				else if (element instanceof Turkish) {
					Turkish tur=(Turkish ) element;
					tur.makeBakllava();
					
					else if(element instanceof American) {
						American amer=(American) element;
						amer.t
					}
				}
			}
			
		}
		
		
		
		
		
		
					
		}
					}