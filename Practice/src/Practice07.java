
public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 10;
		if(a>6){
			System.out.println("A");
		}


		int b = 80;
		if(b<90){
			System.out.println("C");
		}

		int c = 5;
		if(c>=5||c<=0){
			System.out.println("B");
		}

		int d =32;
		if(d<20&&d>3){
			System.out.println("D");
		}

		int f =6;
		if(f<4){
			System.out.println("F");
		}else if(f>2){
			System.out.println("FF");
		}

		int g = 10;
		if(g>20){
			System.out.println("BB");
		}else if(g<3){
			System.out.println("CC");
		}else{
			System.out.println("other");
		}

		int h =24;

		if(h<20){
			System.out.println("未成年");
		}else if(h>=20&&h<=65){
			System.out.println("成人");
		}else{
			System.out.println("高齢");
		}

		String j ="赤";

		switch(j){
		case "赤":
			System.out.println("赤組です");
			break;

		case "白":
			System.out.println("白");
			break;
		}

		String o ="青";

			switch(o){
			case "bb":
				System.out.println("aka");
				break;

			case "ccc":
				System.out.println("cc");
				break;

			default:
				System.out.println("エラーです");

		}

	}

}
