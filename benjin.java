package benjin;

import java.util.Scanner;


public class benjin{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������ĵ�����Ϣ��Ԫ����");
		double principal=scanner.nextInt();//����
		System.out.println("��������������ʣ�%����");//����
		double rate=scanner.nextFloat();
		System.out.println("������Ͷ�����ޣ��꣩��");//Ͷ������
		int year=scanner.nextInt();
		
		double money=0;
		for(int i=1;i<=year;i++){
        	money=principal/(1+(rate/100)*year);
        }
		
	
		System.out.println("����������,����30��֮��Ҫ��뵽300��Ԫ�����Ͻ�ƽ������ر�����3%����ô�����ڱ���Ͷ��ı����ǣ�"+money);
	}
	

}