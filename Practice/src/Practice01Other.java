

public class Practice01Other {
	public static void main(String[] args){

//問１
		int x,y;

		x=8;
		y=6;

		if(x>y){
			System.out.println("xはyより大きい");
		}

		int n=2;

		if(n==0){
			System.out.println("0です");
		}else if(n>0){
			System.out.println("正です");
		}else {
			System.out.println("負です");
		}

		int j=6;

		String str;

		if(j>0){
		str = "正数";
		}

		int s =0;
		for(int i=1;i<=10;i++){
			s+=i;
		}System.out.println(s);

		int l=2;
		    y=l%2;

		if(y==0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}

		int m=-5;
		if(m>0){
			for( int i=m;i>=10;i--){
				System.out.println(i);
			}
	    	} else {
				for(int i=m;i<=0;i++);
				System.out.println(i);
			}


		}
	}




