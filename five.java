package five;

import java.util.Scanner;


public class five{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("���������Ͷ�ʽ�Ԫ����");
		double touzi=scanner.nextInt();
		System.out.println("������������ޣ��꣩��");
		double year=scanner.nextFloat();
		System.out.println("�����������Ԫ����");
		int shouyi=scanner.nextInt();
		double	rate=(Math.pow((shouyi/touzi),(1/year))-1);
		System.out.println("�����ϣ����ʮ���ڽ�100��Ԫ���200��Ԫ��Ӧ���ҵ��������ڶ��ٵ�Ͷ�ʹ����������Ҵ��Ŀ�ꣿ�������5��󱾽𷭱��������ʾ�Ӧ����Ϊ���ٲ����أ�");
		System.out.println(rate);
}
	}