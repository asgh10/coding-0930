import java.util.Scanner;

public class Code66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//this.  ,  오버로딩
		int[] [] test = {
				{80, 60, 22, 50},
				{90, 55, 68, 72},
				{33, 75, 63}
		};
		
		for(int i = 0; i < test.length; i++) {
			System.out.println((i+1) + "번째 배열 요소의 길이는" + test[i].length + "입니다");
		}
		
		-----------------------------------------------------------------------

		int[] test = new int[5];
		int max = 0;
		
		System.out.println("5명의 시험 점수를 입력하십시오");
		
		for(int i = 0; i < test.length; i++) {
			test[i] = sc.nextInt();
			
			if(test[i] > max) {
				max = test[i];
			}
		}
		
		for(int i = 0; i < test.length; i++) {
			System.out.println((i+1) + "번째 사람의 점수는" + test[i] + "입니다");
		}
		System.out.println("최고점수는 " + max + "입니다");
		
		-------------------------------------------------------
		*/
		
		System.out.println("몇명의 점수를 입력하실 건지 입력하시오");
		int student = sc.nextInt();
		
		int[] test = new int[student];
		int max = 0;
		
		System.out.println( student + "명의 시험 점수를 입력하십시오");
		
		for(int i = 0; i < test.length; i++) {
			test[i] = sc.nextInt();
			
			if(test[i] > max) {
				max = test[i];
			}
		}
		
		for(int i = 0; i < test.length; i++) {
			System.out.println((i+1) + "번째 사람의 점수는" + test[i] + "입니다");
		}
		System.out.println("최고점수는 " + max + "입니다");

	}

}