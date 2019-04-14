package hireCarSystem;
//导入键盘输入方法
import java.util.Scanner;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//显示“是否租车”提示
		System.out.println("是否租车，是请输入1，否请输入0");
		//获取是否租车指令
		Scanner input1 = new Scanner(System.in);
		int hireOrNot = input1.nextInt();
		//判断是否租车
		if( hireOrNot == 0 ) {
			System.out.println("不租车，结束");
			System.exit(0);
		}else if( hireOrNot == 1 ){
			//展示6种车辆
			System.out.println("序号"+" "+"车辆名称"+"    "+"租金"+"         "+"容量");
			Coach car1 = new Coach(1, "奥迪A4  ", 200, 5);
			Coach car2 = new Coach(2, "马自达6 ", 300, 4);
			PickUp car3 = new PickUp(3, "皮卡6   ", 600, 2, 20);
			Coach car4 = new Coach(4, "金龙    ", 800, 60);
			Lorry car5 = new Lorry(5,"松花江  ", 400,20);
			Lorry car6 = new Lorry(6,"五菱宏光", 1200,30);
			//显示“租车数量”提示
			System.out.println("请输入您要租车的数量：");
			//获取租车数量
			Scanner input2 = new Scanner(System.in);
			int hireNum = input2.nextInt();
			//获取租车的序号
			Scanner input3 = new Scanner(System.in);
			//收集车费的金额
			int sum1 = 0;
			for (int i = 1 ; i <= hireNum ; i++ ) {
				//显示“输入选择车辆的序号”
				System.out.println("请输入第"+i+"辆车的序号");
				int vehicleNum = input3.nextInt();
				//判断选择的序号，求和
				switch(vehicleNum)
				{
				case 1:
					sum1 += 200;
					break;
				case 2:
					sum1 += 300;
					break;
				case 3:
					sum1 += 600;
					break;
				case 4:
					sum1 += 800;
					break;
				case 5:
					sum1 += 400;
					break;
				case 6:
					sum1 += 1200;
					break;
				}
			}
			//显示“输入天数"提示
			System.out.println("请输入您需要租赁的天数");
			//获取租赁的天数
			Scanner input4 = new Scanner(System.in);
			int hireDay = input4.nextInt();
			//计算总租金
			int sum2 = sum1*hireDay;
			//显示总租金
			System.out.println("您的账单为："+sum2+"元");
			
		}else {
			System.out.println("指令错误，结束");
		}
	}
}
