package rob.fra;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
	public static void main(String[] args) {
	
		LocalDate date  = LocalDate.of(2019, 3,17);
		date = date.minusDays(18);
		date.minusMonths(1);
		System.out.println(date);
		
		
		
		
	}

}
