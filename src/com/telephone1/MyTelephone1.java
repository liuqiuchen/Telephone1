package com.telephone1;
/**��һ���ֻ��࣬�����Ժͷ������ٱ�дʵ���������*/

public class MyTelephone1 {
	//��Ա����
	float screen;
	float cpu;
	float mem;
	
	//���徲̬����
	static String str = "���Ǿ�̬����";
	
	//���徲̬����
	public static void staticFunc(){
		System.out.println("���Ǿ�̬����");
	}
	
	/*������ķ���*/
	void print(){
		System.out.println("����������ķ���");
	}
	
	void show(){
		System.out.println("screen:" + screen + "cpu:" + cpu + "mem:" + mem + "����������ķ���");
	}
	
	//��д�޲εĹ��췽��
	public MyTelephone1(){
		System.out.println("�����޲εĹ��췽��");
	}
	
	//��д�вεĹ��췽��
	public MyTelephone1(float newScreen,float newCpu,float newMem){
		if(newScreen >= 3.5){
			screen = newScreen;
		}else{
			System.out.println("û����ôС�ߴ���ֻ���Ļ��ϵͳĬ��Ϊ0.0");
		}
		
		cpu = newCpu;
		mem = newMem;
		System.out.println("screen:" + screen + "cpu:" + cpu + "mem:" + mem + "���вεĹ��췽��");
	}
}
