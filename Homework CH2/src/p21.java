
public class p21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請問要選哪條路線");
		System.out.println("請輸入整數");
		BufferedReader br = new 
			BufferedReader(new InputStreamReader(System.in));
		int res=Integer.parseInt(br.readLine());

		char ans=(res==1)?'A':'B';
		System.out.println("選擇了"+ans+"路線");
	}

}
