package homework;

public class _0514_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class MonthDaysCalculator {
	    // 상수로 12달을 정의합니다.
	    enum Month {
	        JANUARY(31, 31),
	        FEBRUARY(28, 29), // 윤년인 경우 29일
	        MARCH(31, 31),
	        APRIL(30, 30),
	        MAY(31, 31),
	        JUNE(30, 30),
	        JULY(31, 31),
	        AUGUST(31, 31),
	        SEPTEMBER(30, 30),
	        OCTOBER(31, 31),
	        NOVEMBER(30, 30),
	        DECEMBER(31, 31);

	        private final int daysNormal; // 평년의 경우 해당 달의 일수
	        private final int daysLeap; // 윤년의 경우 해당 달의 일수

	        Month(int daysNormal, int daysLeap) {
	            this.daysNormal = daysNormal;
	            this.daysLeap = daysLeap;
	        }

	        public int getDays(int year) {
	            return isLeapYear(year) ? daysLeap : daysNormal;
	        }

	        // 윤년 여부를 확인하는 메소드
	        private boolean isLeapYear(int year) {
	            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	        }
	    }

	    // 입력된 년도의 1월부터 5월까지의 일수 합을 계산하는 메소드
	    public static int sumDays(int year) {
	        int sum = 0;
	        for (Month month : Month.values()) {
	            sum += month.getDays(year);
	            if (month == Month.MAY) {
	                break; // 5월까지의 합이므로 반복문 종료
	            }
	        }
	        return sum;
	    }
	}
}
