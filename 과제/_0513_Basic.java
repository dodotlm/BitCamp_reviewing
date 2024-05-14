package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class _0513_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	// 1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.
	public class GenericCla<T>{
		private T t;
		
		public void getT(T t) {
			this.t = t;
		}
		
		public T setT() {
			return t;
		}
	// 2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 
	// 매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.

		public static <T> String add(T t1, T t2) {
			String str1 = (String) t1;
			String str2 = (String) t2;
			
			return str1+str2;
		}
		
	// 3. public static Integer sum(List<?> list) 와일드 카드를 이용하여 리스트의 총합을 구하는 메소드를 구현하세요.
		
		public static Integer sum(List<?> list) {
			int sum = 0;
			for(int i= 0 ; i < list.size(); i++) {
				sum = sum + list.indexOf(i);
			}
			return sum;
		}
		
	// 4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.(와일드 카드 사용)
		
		public static List<?> thirdBae(Object[] obj){
			List<Integer> threeList = new ArrayList<>();
			
			for(int i=0; i < obj.length; i++) {
				if((int)obj[i]%3 == 0) {
					threeList.add((int)obj[i]);
				}
			}
			return threeList;
			
		}
		


		
	}

}
