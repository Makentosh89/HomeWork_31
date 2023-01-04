public enum DaysOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");


    DaysOfWeek(String s) {
        this.daysInRussian=s;
    }

    private String daysInRussian;

    public String getDaysInRussian() {
        return daysInRussian;
    }
}
