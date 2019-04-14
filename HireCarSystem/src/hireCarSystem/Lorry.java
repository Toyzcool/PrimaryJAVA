package hireCarSystem;

public class Lorry extends Vehicle {
	//载货构造方法
	public Lorry(int num, String name, float charge, float weight) {
		super(num, name, charge, weight);
		System.out.println(num+"."+"  "+name+"   "+charge+"元/天"+"   "+"载货："+weight+"吨");
		// TODO Auto-generated constructor stub
	}
}
