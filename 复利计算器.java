package ����������;

public class ���������� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        double money=200;  //����
        int years=5;   //��Ǯ����
        double sum=0;  //����ܶ�
        double rate=0.05;   //����
        double N=1;
        for(int i=1;i<years;i++){
        	N=(1+rate)*N;
        }
        sum=N*money;
        System.out.println("��������ֵΪ��"+sum);
	}

}
