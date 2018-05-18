package practice2;

public enum WeekDay {
    SUNDAYY,MONDAY,TUESDAY,WEDNESDAY,THIRSDAY,FRIDAY,SATURDAY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

