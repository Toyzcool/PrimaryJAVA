package com.primary.newInnerClass;
/*方法内部类
 * 1.由于方法内部类不能在外部类的方法以外的地方使用，因此方法内部类不能使用访问控制符和 static 修饰符
 */
public class methodClass {
	//定义外部变量
	private String name = "Toyz";
	//定义外部方法
	public void show() {
		//定义内部类
		class MInner {
			int score = 80;
			//定义内部方法，修改成绩
			public int getScore() {
				return (score+10);
			}
		}
		//创建内部类对象
		MInner mi = new MInner();
		//使用内部类对象的方法
		int newScore = mi.getScore();
		//输出数据
		System.out.println("学生姓名："+name);
		System.out.println("学生成绩："+newScore);
	}
	public static void main(String[] args) {
		//创建外部类对象
		methodClass mo = new methodClass();
		mo.show();
	}
}
