package Laba122;

public class Worker extends Human{
    private double weekSalary;
    private double workHoursPerDay;
    private final double hourSalary;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) throws Exception {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
        hourSalary = weekSalary / (7*workHoursPerDay);

        if (lastName.length()  <= 3 )
            throw new Exception("Expected length more than 3 symbols! Argument: worker lastName");
    }


    private void setWeekSalary(double weekSalary) throws Exception {
        if(weekSalary <= 10)
            throw new Exception("Expected value mismatch! Argument: weekSalary");
        this.weekSalary = weekSalary;
    }
    private void setWorkHoursPerDay(double workHoursPerDay) throws Exception {
        if (1 > workHoursPerDay || workHoursPerDay > 12)
            throw new Exception("Expected value mismatch! Argument: workHoursPerDay");
        this.workHoursPerDay = workHoursPerDay;
    }
    public String getInfo(){
        return String.format("""
                        First Name: %s
                        Last Name: %s
                        Week Salary: %s
                        Hours per day: %s
                        Salary per hour: %s
                        """,
                firstName,
                lastName,
                weekSalary,
                workHoursPerDay,
                hourSalary);
    }
}
