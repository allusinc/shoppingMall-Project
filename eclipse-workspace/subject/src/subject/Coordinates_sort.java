package subject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Coordinates_sort {
	
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	String N = in.nextLine();
	String[] arr=N.split(",");
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr[i].replaceAll("[()]", "");
	}
	//����ȯ
	int[] k=new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		k[i]=Integer.parseInt(arr[i]);	
//		System.out.println(k[i]);
	}
	//2�����迭�� �ֱ�
	int num[][]=new int[k.length/2][2];
	for(int i=0;i<k.length/2;i++) {
		for(int j=0;j<(i+1)*2;j++) {
			if(j%2==0) {
				
					num[i][0]=k[j];
			}
			if(j%2==1) {				
					num[i][1]=k[j];				
			}
			}
		}
			
	Arrays.sort(num,new Comparator<int[]>() { //Comparator �������̽� ������

		@Override
		public int compare(int[] o1, int[] o2) {
			
				
			 if(o1[0]==o2[0])// x��ǥ�� ���� ���ٸ� y��ǥ�� �������� ����		
				return Integer.compare(o1[1], o2[1]);
				
				return Integer.compare(o1[0], o2[0]); // �������� x��ǥ�� �������� ����
		
		}		
		
	});

//	for(int i=0;i<num.length;i++) {
//		
//		System.out.println(num[i][0]+" "+num[i][1]);
//
//}

	String[] result=new String[5];
	for(int i=0;i<num.length;i++) {
		
		result[i]="("+num[i][0]+","+num[i][1]+")";
		System.out.println(result[i]);
}
	
}


	

	
//	int[][] arr = new int[N][2];
//	
//	for(int i = 0; i < N; i++) {
//		arr[i][0] = in.nextInt();
//		arr[i][1] = in.nextInt();
//	}
//	
//	Arrays.sort(arr, (e1, e2) -> {
//		if(e1[0] == e2[0]) {
//			return e1[1] - e2[1];
//		} else {
//			return e1[0] - e2[0];
//		}
//	});
//	
//	StringBuilder sb = new StringBuilder();
//	for(int i = 0; i < N; i++) {
//		sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
//	}
//		
//	System.out.println(sb);
	
	
	
	
	
	
	
	
}

