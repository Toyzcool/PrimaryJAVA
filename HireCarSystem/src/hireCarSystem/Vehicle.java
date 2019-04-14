package hireCarSystem;

public class Vehicle {
	//规定必须具备的变量
	public int num;
	public String name;
	public float charge;
	public int volume;
	public float weight;
	//载人构造方法
	public Vehicle(int num,String name,float charge,int volume) {
		this.num = num;
		this.name = name;
		this.charge = charge;
		this.volume = volume;
	}
	//载货构造方法
	public Vehicle(int num,String name,float charge,float weight) {
		this.num = num;
		this.name = name;
		this.charge = charge;
		this.weight = weight;
	}
	//载人和载货构造方法
	public Vehicle(int num,String name,float charge,int volume,float weight) {
		this.num = num;
		this.name = name;
		this.charge = charge;
		this.volume = volume;
		this.weight = weight;
	}
}
