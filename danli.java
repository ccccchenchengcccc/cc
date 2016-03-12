package danli;

import java.util.Scanner;


public class danli {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你的本金（元）：");
		int principal=scanner.nextInt();//本金
		System.out.println("请输入你的年利率（%）：");//利率
		double rate=scanner.nextFloat();
		System.out.println("请输入投资年限（年）：");//投资年限
		int year=scanner.nextInt();
		double sum=principal;
		double d=0;
		for(int i=1;i<=year;i++){
			d= (1+(rate/100)*year)*sum;
		}
		sum=d;
		System.out.println("按单利计算,你的所得本息为："+sum);
	}
	

}