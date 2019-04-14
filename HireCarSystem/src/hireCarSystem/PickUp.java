package hireCarSystem;

public class PickUp extends Vehicle {
	//载人和载货构造方法
	public PickUp(int num, String name, float charge, int volume, float weight) {
		super(num, name, charge, volume, weight);
		System.out.println(num+"."+"  "+name+"   "+charge+"元/天"+"   "+"载人："+volume+" "+"载货："+weight+"吨");
		// TODO Auto-generated constructor stub
	}
}
