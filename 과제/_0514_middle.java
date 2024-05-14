package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _0514_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. key와 value 모두 Number를 상속받은 클래스만 받고 매개변수로 Map이 주어졌을 때 key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.

	}
	
	
	public static <K extends Number, V extends Number> Entry<K, V> getMaxMul(Map<K, V> map) {
        Entry<K, V> maxEntry = null;
        double max = 0.0;

        for (Entry<K, V> entry : map.entrySet()) {
            double db = entry.getKey().doubleValue() * entry.getValue().doubleValue();
            if (db > max) {
                max = db;
                maxEntry = entry;
            }
        }
        
        return maxEntry;

	}
	
	
	// Number 클래스를 상속받은 클래스만 지정가능한 제네릭 클래스를 만들고 T 배열을 매개변수로 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 메소드를 구현하세요.
	// 각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.(Math.round()로 소수점 두자리까지만 표출)
	
	public class Calculator<T extends Number> {
	    private T[] array;

	    public Calculator(T[] array) {
	        this.array = array;
	    }

	    public double add() {
	        double sum = 0;
	        for (T element : array) {
	            sum += element.doubleValue();
	        }
	        return Math.round(sum * 100.0) / 100.0; // 소수점 두 자리까지 반올림
	    }

	    public double sub() {
	        if (array.length == 0) return 0;

	        double result = array[0].doubleValue();
	        for (int i = 1; i < array.length; i++) {
	            result -= array[i].doubleValue();
	        }
	        return Math.round(result * 100.0) / 100.0; // 소수점 두 자리까지 반올림
	    }

	    public double mul() {
	        double result = 1;
	        for (T element : array) {
	            result *= element.doubleValue();
	        }
	        return Math.round(result * 100.0) / 100.0; // 소수점 두 자리까지 반올림
	    }

	    public double div() {
	        if (array.length == 0) return 0;

	        double result = array[0].doubleValue();
	        for (int i = 1; i < array.length; i++) {
	            double value = array[i].doubleValue();
	            if (value == 0) {
	                System.out.println("나눗셈의 분모가 0입니다.");
	                return Double.NaN; // 유효하지 않은 결과
	            }
	            result /= value;
	        }
	        return Math.round(result * 100.0) / 100.0; // 소수점 두 자리까지 반올림
	    }

	    
	}
	
	
	// Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요.
	// 매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.
	
	public class OverHundred {
	    public static List<Entry<Integer, Integer>> getOverHundred(Map<Integer, Integer> map) {
	        List<Entry<Integer, Integer>> resultList = new ArrayList<>();

	        for (Entry<Integer, Integer> entry : map.entrySet()) {
	            int product = entry.getKey() * entry.getValue();
	            if (product > 1000) {
	                resultList.add(entry);
	            }
	        }

	        return resultList;
	    }
	}
	
	
	// 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 리스트로 나누는 기능을구현하세요.
	// (리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)
	
	
	public class TList<T> {
	    private List<T> list;

	    public TList(List<T> list) {
	        this.list = list;
	    }

	    public List<List<T>> splitList() {
	        List<List<T>> resultList = new ArrayList<>();
	        int size = list.size();
	        int mid = size / 2;

	        List<T> firstHalf = new ArrayList<>(list.subList(0, mid));
	        List<T> secondHalf = new ArrayList<>(list.subList(mid, size));

	        // 요소 개수가 홀수일 경우, 첫 번째 리스트에 하나 더 추가
	        if (size % 2 != 0) {
	            firstHalf.add(list.get(size - 1));
	        }

	        resultList.add(firstHalf);
	        resultList.add(secondHalf);

	        return resultList;
	    }
	
	}
	
	
	
	
	
}