import java.util.Scanner;
public class decomp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串數字");
		String n = scn.next();
		decomp(n);
		
	}
	

	public static void decomp(String n){
		char a[] = n.toCharArray();
		int i = n.length();
		for(int j = 0;j<i;j++){
			System.out.print(a[j]+" ");
		}
		
	}
	
	
}



