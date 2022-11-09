package com.login;


 public class CutomerInfo {
	
  public int age ;//instance variables

public void Deposite() {
	
	age =25;
}
public static int sample;

public static void savings() {
	sample=18;

}
public static void main(String[] args) {
	
	CutomerInfo c=new CutomerInfo();
	System.out.println("before initialization:"+c.age);
	c.Deposite();
	System.out.println("after initialization:"+c.age);
	 
	CutomerInfo c1=new CutomerInfo();
	System.out.println("before initialization:"+c1.age);
	c1.Deposite();
    System.out.println("after initialization:"+c1.age);
	System.out.println("before initialization:"+sample);
	savings();
	System.out.println("after initialization:"+sample);
     
     
}


}
