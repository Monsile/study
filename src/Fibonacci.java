

public class Fibonacci {

	public static void main(String[] args) {
		
		//1 1 2 3 5 8 13 21 34 .....
		//공식 : An = An-1 + An-2이며, n=3일때부터 적용됨
		//n = 1,2는 1로 초기화 값을 가짐
		
		//첫번째 방법(for)
		//배열크기설정(내맘대로)
		int []arr = new int[100];
		//1번과 2번 배열에 1로 초기값
		arr[1] = 1;
		arr[2] = 1;
		//for문을 사용하여 An = An-1 + An-2값 적용
		//ex) 2를 출력하기 위해선 2보다 전 배열인 1과 2보다 전전배열인 1을 더해주면 됨!
		for ( int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		for ( int i=1; i<10; i++) {
			//예쁘게 잘 출력됨
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		//두번째 방법 
		
		int firstNum = 1; //An-2
		int secondNum = 1; //An-1
		//1,1 출력
		System.out.print(firstNum + " ");
		System.out.print(secondNum + " ");
		
		for ( int i=3; i<10; i++) {
			//2 출력
			int nNum = firstNum+secondNum;
			System.out.print(nNum+ " ");
			
			secondNum = firstNum;
			//firstNum = 2가 됨 (for문 다음 값은 2+1인 3이되고, second는 2, first 3이됨.)
			firstNum = nNum;
			
		}
		
		
	}

}
