﻿public class Test0422{
	public static void main(String[] args){
		System.out.println("20150422開發流程練習");
		int x=10, y=5;
		new A().minFunc(x, y);
		new B().maxFunc(x, y);
		new C().avgFunc(x, y);
	}
}

<<<<<<< HEAD
class A{


  void minFunc(int x,int y){

    if(x>y)
     {System.out.println("min:"+y);}
    if(y>x)
     {System.out.println("min"+x);}

  }

	
}
=======
class c
{
	void avgFunc(int x,int y){


	System.out.printf("%.2f",(float)(x+y)/2);



    }

}
>>>>>>> develope
