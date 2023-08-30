package enumExample;

import java.time.Month;

public class EnumExampleMonth {
	
	public enum Month{
	
	JANUARY(31),
    FEBRUARY(28), //leapyr
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int days;
//private data cant be change ..final fixed
    
     Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}

public static void main(String[] args) {
    Month selectedMonth = Month.MARCH;

    int daysInSelectedMonth = selectedMonth.getDays();
    System.out.println(selectedMonth + " has " + daysInSelectedMonth + " days.");
}

}
