package com.telephone1;

public class InitialTelephone1 {

	public static void main(String[] args) {//程序的入口
		// TODO Auto-generated method stub
		/*//创建对象，实例化MyTelephone1类
		MyTelephone1 phone = new MyTelephone1();
		//调用类的实例属性
		System.out.println("screen:" + phone.screen);
		//调用类的实例方法
		phone.print();
		phone.show();*/
		
		/*//调用无参的构造方法
		MyTelephone1 phone = new MyTelephone1();
		//调用有参的构造方法
		MyTelephone1 phone2 = new MyTelephone1(5.5f,4.0f,64.0f);*/
		
		//打印出静态变量
		System.out.println(MyTelephone1.str);
		//调用静态方法
		MyTelephone1.staticFunc();
	}

}
