package javaPackage;

public class SequenceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int i=5;
		int j=9,k=6;
		//5+6+7+8+9+8+7+6
		int sum=i;
		int m=0;
		while(m<(j-1)) {
			i++;
			m=i;
			sum=sum+m;
			
		}
		m=j;
		while(m>=k) {

			sum=sum+m;
			j--;
			m=j;
		}
	System.out.println(sum);
	}

}
