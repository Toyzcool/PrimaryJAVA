package polymorphic;
/*多态、引用类型转换
 * 引用多态：引用，oj2相当于Dog对象的标签，未分配给oj2内存。与String c = "b"赋值不同！！！
 * 1.父类引用可以指向本类的对象
 * 2.父类引用可以指向子类的对象
 * 3.父类引用指向子类的对象时，无法使用子类独有的方法
 */
public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal oj1 = new Animal();
		//父类引用指向子类对象
		Animal oj2 = new Dog();
		//Dog oj3 = new Animal();//子类引用不能指向父类对象
		//方法的多态
		oj1.eat();
		oj2.eat();
		//尝试用父类引用指向子类对象后，调用子类独有的方法
		//oj2.watchDoor();//失败
		
		//引用类型转换
		System.out.println("——————————引用类型转化————————");
		//创建dog对象
		Dog dog = new Dog();
		//父类引用指向子类对象，向上类型转换，可自动转换
		Animal animal = dog;
		//子类引用类型转换,向下类型转换，无法自动转换
		//Dog dog3 = animal;//报错
		//子类引用类型转换,强制转换
		Dog dog3 = (Dog)animal;
		//使用instanceof进行转换判断
		if(animal instanceof Dog) {
			Dog dog2 = (Dog)animal;
		}else {
			System.out.println("转换成Dog类型失败");
		}
		if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
		}else {
			System.out.println("转换成Cat类型失败");//animal引用转化成了dog对象，无法转成cat对象
	}
}
}
