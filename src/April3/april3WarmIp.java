package April3;

public class april3WarmIp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ABCAADKAB";
		for(int i = 0; i<str.length()-1;i++) {
			System.out.print(str.charAt(i)+"-");	
		}
		System.out.print(str.charAt(str.length()-1));

	}

}
