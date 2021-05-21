package day_0521_api_class;

import java.util.Arrays;

public class ArraysTest {
	//Arrays클래스의 모든 메소드는 정적이다
	/**
	 * copyOf(원본배열, 복사할 길이):복사할 길이만큼 복하한 배열 리턴
	 * 
	 * copyOf(원본배열, 시작인덱스, 끝인덱스):시작인덱스에서 끝 인덱스 까지 복사
	 *  
	 * deepEquals(배열, 배열):두 배열의 깊은 비교 
	 * 
	 * equals(배열, 배열):en qodufdml dixdms qlry
	 * 
	 * sort(배열):배열의 전체 항목을 오름차순으로 정렬
	 * 
	 * binarySearch(배열,찾는값) : 전체 배열 항목에서 찾는 값이 있는 인덱스 리턴
	 */
	
	void copyOfTest() {
		char[] arr1 = {'J','A','V','A'};
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
	}
}
