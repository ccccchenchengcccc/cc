package danli;

import java.util.Scanner;


public class danli {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������ı���Ԫ����");
		int principal=scanner.nextInt();//����
		System.out.println("��������������ʣ�%����");//����
		double rate=scanner.nextFloat();
		System.out.println("������Ͷ�����ޣ��꣩��");//Ͷ������
		int year=scanner.nextInt();
		double sum=principal;
		double d=0;
		for(int i=1;i<=year;i++){
			d= (1+(rate/100)*year)*sum;
		}
		sum=d;
		System.out.println("����������,������ñ�ϢΪ��"+sum);
	}
	

}