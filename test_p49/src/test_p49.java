
public class test_p49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]test;
		test=new int[2][5];
		test[0][0]=80;
		test[0][1]=60;
		test[0][2]=22;
		test[0][3]=50;
		test[0][4]=75;
		test[1][0]=90;
		test[1][1]=55;
		test[1][2]=68;
		test[1][3]=72;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("��"+(i+1)+"��y���ƬO"+test[0][i]+"��");
			System.out.println("��"+(i+1)+"�ƾǤ��ƬO"+test[1][i]+"��");
		}

	}

}