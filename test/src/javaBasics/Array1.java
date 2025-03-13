package javaBasics;
import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {

		// 중복없는 로또번호(1 ~ 45) 6개 뽑아서 출력하기

		// 기본 세팅
		int[] lotto = new int[6];
		int idx = 0;
		
		// 무한반복문 while
		while(idx < 6) {
			// 1. 로또 번호 뽑기
			int num = (int)(Math.random() * 45) + 1;
			
			// 2. 중복확인
			// ** 배열의 '전체 요소들'에 대한 중복확인이 이루어져야함 --> flag 활용
			boolean flag = false;
			for (int i=0; i<lotto.length; i++) {
				if (lotto[i] == num) {
					flag = true;
					break;
				}
			}
			
			// 3. 중복확인 통과하면 배열에 저장
			if (flag == false) {
				lotto[idx] = num;
				idx += 1;
			}

		}
		
		// 완성된 로또 번호 출력
		System.out.println("완성된 로또 배열: " + Arrays.toString(lotto));
		
	}
}
