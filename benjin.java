package benjin;

import java.util.Scanner;


public class benjin{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你的单利本息（元）：");
		double principal=scanner.nextInt();//本金
		System.out.println("请输入你的年利率（%）：");//利率
		double rate=scanner.nextFloat();
		System.out.println("请输入投资年限（年）：");//投资年限
		int year=scanner.nextInt();
		
		double money=0;
		for(int i=1;i<=year;i++){
        	money=principal/(1+(rate/100)*year);
        }
		
	
		System.out.println("按单利计算,假如30年之后要筹措到300万元的养老金，平均的年回报率是3%，那么，现在必须投入的本金是："+money);
	}
	

}