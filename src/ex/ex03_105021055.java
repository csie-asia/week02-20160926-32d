package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021055 王浚維
 */
import java.util.Scanner;
public class ex03_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入幾點幾分(24小時制)");
		int a1 = scn.nextInt();
		int b1 = scn.nextInt();
		System.out.println("結束時間");
		int a2 = scn.nextInt();
		int b2 = scn.nextInt();
		int t = ((a1*60+b1)-(a2*60+b2))/30;
		int m = 0;
		if (t<=4) {m=t*30;
		}
		else if (t>4 && t<8){m=t*40;
		}
		else if (t>8){m=t*60;}
		
		System.out.println(-m);
	}

}
