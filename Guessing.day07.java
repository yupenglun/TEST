package day07;
import java.util.Scanner;
//鐚滃瓧绗﹀皬娓告垙
public class Guessing {
	//涓绘柟娉�	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] chs = generate(); //鑾峰彇闅忔満瀛楃鏁扮粍
		System.out.println(chs); //浣滃紛
		int count = 0; //鐚滈敊鐨勬鏁�		while(true){ //鑷�姝诲惊鐜�			System.out.println("鐚滃惂!");
			String str = scan.next().toUpperCase(); //鑾峰彇鐢ㄦ埛杈撳叆鐨勫瓧绗︿覆
			if(str.equals("EXIT")){ //鍒ゆ柇瀛楃涓插唴瀹圭浉绛�				System.out.println("涓嬫鍐嶆潵鍚�");
				break;
			}
			char[] input = str.toCharArray(); //灏嗗瓧绗︿覆杞崲涓哄瓧绗︽暟缁�			int[] result = check(chs,input); //瀵规瘮:闅忔満瀛楃鏁扮粍涓庣敤鎴疯緭鍏ョ殑瀛楃鏁扮粍
			if(result[0]==chs.length){ //瀵�				int score = 100*chs.length-10*count; //涓�釜瀛楃100鍒嗭紝鐚滈敊涓�鎵�0鍒�				System.out.println("鎭枩浣狅紝鐚滃浜�寰楀垎涓�"+score);
				break; //缁堟寰幆
			}else{ //閿�				count++; //鐚滈敊娆℃暟澧�
				System.out.println("瀛楃瀵逛釜鏁颁负:"+result[1]+"锛屼綅缃涓暟涓�"+result[0]);
			}
		}
	}
	
	//鐢熸垚闅忔満瀛楃鏁扮粍chs
	public static char[] generate(){
		char[] chs = new char[5]; //闅忔満瀛楃鏁扮粍
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' }; //闅忔満瀛楃鑼冨洿鏁扮粍
		boolean[] flags = new boolean[letters.length]; //寮�叧鏁扮粍
		for(int i=0;i<chs.length;i++){ //閬嶅巻闅忔満瀛楃鏁扮粍
			int index;
			do{
				index = (int)(Math.random()*letters.length); //闅忔満涓嬫爣(0鍒�5)
			}while(flags[index]==true); //褰撲笅鏍噄ndex瀵瑰簲鐨勫紑鍏充负true鏃讹紝琛ㄧず瀵瑰簲瀛楃宸插瓨杩囷紝鍒欓噸鏂扮敓鎴愪笅鏍噄ndex
			                            //褰撲笅鏍噄ndex瀵瑰簲鐨勫紑鍏充负false鏃讹紝琛ㄧず瀵瑰簲瀛楃鏈瓨杩囷紝鍒欏惊鐜粨鏉�			chs[i] = letters[index]; //鍩轰簬涓嬫爣index鍒發etters鑾峰彇瀛楃骞惰祴鍊肩粰chs涓殑姣忎竴涓厓绱�			flags[index] = true; //灏嗕笅鏍噄ndex瀵瑰簲鐨勫紑鍏充慨鏀逛负true锛岃〃绀哄搴斿瓧绗﹀凡瀛樿繃
		}
		//i=0 index=0           chs[0]='A' flags[0]=true
		//i=1 index=25          chs[1]='Z' flags[25]=true
		//i=2 index=0/25/0/25/1 chs[2]='B' flags[1]=true
		return chs;
	}
	
	//瀵规瘮:闅忔満瀛楃鏁扮粍chs涓庣敤鎴疯緭鍏ョ殑瀛楃鏁扮粍input
	public static int[] check(char[] chs,char[] input){
		int[] result = new int[2]; //(0,0)锛屽亣璁緍esult[0]涓轰綅缃锛宺esult[1]涓哄瓧绗﹀
		for(int i=0;i<chs.length;i++){ //閬嶅巻闅忔満瀛楃鏁扮粍
			for(int j=0;j<input.length;j++){ //閬嶅巻鐢ㄦ埛杈撳叆鐨勫瓧绗︽暟缁�				if(chs[i]==input[j]){ //瀛楃瀵�					result[1]++; //瀛楃瀵逛釜鏁板1
					if(i==j){ //浣嶇疆瀵�						result[0]++; //浣嶇疆瀵逛釜鏁板1
					}
					break; //鍓╀綑input鍏冪礌涓嶅啀鍙備笌姣旇緝浜�				}
			}
		}
		return result;
	}

}



















