package com.telephone1;
/**做一个手机类，有属性和方法，再编写实例对象调用*/

public class MyTelephone1 {
	//成员变量
	float screen;
	float cpu;
	float mem;
	
	//定义静态变量
	static String str = "我是静态变量";
	
	//定义静态方法
	public static void staticFunc(){
		System.out.println("我是静态方法");
	}
	
	/*类里面的方法*/
	void print(){
		System.out.println("我是类里面的方法");
	}
	
	void show(){
		System.out.println("screen:" + screen + "cpu:" + cpu + "mem:" + mem + "我是类里面的方法");
	}
	
	//编写无参的构造方法
	public MyTelephone1(){
		System.out.println("我是无参的构造方法");
	}
	
	//编写有参的构造方法
	public MyTelephone1(float newScreen,float newCpu,float newMem){
		if(newScreen >= 3.5){
			screen = newScreen;
		}else{
			System.out.println("没有那么小尺寸的手机屏幕，系统默认为0.0");
		}
		
		cpu = newCpu;
		mem = newMem;
		System.out.println("screen:" + screen + "cpu:" + cpu + "mem:" + mem + "我有参的构造方法");
	}
}
