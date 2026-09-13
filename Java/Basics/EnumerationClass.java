//Java program to demonstrate enum class
/*In Java, an enum (short for enumeration) is a special data type used to define a fixed set of predefined constants in a type-safe way.*/

class EnumerationClass {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }
    }
    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        System.out.println(today + " is weekend? " + today.isWeekend());

        for (Day d : Day.values()) {
            System.out.println(d.ordinal() + ": " + d.name());
        }
        switch (today) {
            case SATURDAY, SUNDAY -> System.out.println("Relax!");
            default -> System.out.println("Work day.");
        }
    }
}