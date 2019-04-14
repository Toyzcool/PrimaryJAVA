package hireCarSystem;

public class Coach extends Vehicle {
	//载人构造方法
	public Coach(int num, String name, float charge, int volume) {
		super(num, name, charge, volume);
		System.out.println(num+"."+"  "+name+"   "+charge+"元/天"+"   "+"载人："+volume+"人");
		// TODO Auto-generated constructor stub
	}
}
