package test;

public class EnumDay {
    Day day;
    
    public EnumDay(Day day) {
        this.day = day;
    }
    
    public void saySomething() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case TUESDAY:
                System.out.println("Tuesdays are good.");
                break;        
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: 
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumDay firstDay = new EnumDay(Day.MONDAY);
        firstDay.saySomething();
        EnumDay secondDay = new EnumDay(Day.TUESDAY);
        secondDay.saySomething();
        EnumDay thirdDay = new EnumDay(Day.WEDNESDAY);
        thirdDay.saySomething();
        EnumDay fifthDay = new EnumDay(Day.FRIDAY);
        fifthDay.saySomething();
        EnumDay sixthDay = new EnumDay(Day.SATURDAY);
        sixthDay.saySomething();
        EnumDay seventhDay = new EnumDay(Day.SUNDAY);
        seventhDay.saySomething();
    }
}