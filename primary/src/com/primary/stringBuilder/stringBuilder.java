package com.primary.stringBuilder;
/*字符串方法
 * 实现功能：将一个由英文字母组成的字符串转换成指定格式---从右边开始每三个字母用逗号分隔的形式。
 */
public class stringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		//追加字符串
		str.append("sdsafsdfsdfadsfa");
		//增加逗号分割
		for(int i = str.length() - 3 ; i > 0 ; i = i - 3 ) {
			str.insert(i,',');
		}
		System.out.println(str);	
	}
}
