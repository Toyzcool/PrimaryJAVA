package com.primary.newTryCatch;
/*异常处理
 * try\catch\finally的使用
 */
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatch ct1 = new TryCatch();
		int result = ct1.test();
		System.out.println("主函数中抛出异常的result值为："+result);
	}
	//除数为零时，将会报错
	public int test() {
		int divider = 2;
		int result = 10;
		try {
			while ( divider > -1) {
				divider --;
				result = result + result/divider;
			}
		}catch (Exception e) {
			// TODO: handle exception
			//捕获到异常后抛出
			System.out.println("catch抛出异常了");
		}finally {
			System.out.println("finally执行了");
			return result;
		}
	}
}
