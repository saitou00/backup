/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Helloworld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Hello world!の出力

     String[]name={"田中","高橋","斉藤",};
     name[0]= "加藤" ;

     		System.out.println(name[0]);

     		String[][]country=
     			{
     					{"日本","タイ"},
     					{"アメリカ","ブラジル"},
     					{"フランス","ロシア"}
     			};
     		System.out.println(country[0][1]);

     		for(int i=0;i < 3;i++){
     			System.out.println(i);
     		}

 			for(int j=0;j<=5;j++){
 				String b =j%2 == 0?"☆":"★";
 				System.out.println(b);
 			}
 			for(int k=1;k<=10;k++){
 				if(k%2 ==0){
 					System.out.println(k+"\n");
 				}
 			}
 			int i=5;
 					do{
 						System.out.println(i);
 						i++;
 					}while(i<=10);
}
}
