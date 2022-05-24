package jenkinsTest;

public class testfibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int i = 0,j=1,num=10;
		System.out.println("Fibonnaci series");
		for(int k = 0;k<num ;k++) {
			
			int swap = i + j ;
			System.out.println(swap);
			i = j;
			j= swap;
			
		}

	}

}
