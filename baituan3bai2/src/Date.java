import java.util.Calendar;

public class Date {
    private int day;
    private int month;
    private int year;
    public Date (int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public Date setDay(int day){
        this.day=day;
        return this;
    }
    public Date setMonth(int month){
        this.month=month;
        return this;
    }
    public Date setYear(int year){
        this.year=year;
        return this;
    }
    public boolean checkDate(int day, int month, int year){
        boolean check= false;
        if(day != -1){
            check = day == this.day;
        }
        if (month != 1){
            check = month == this.month;
        }
        if (year != -1){
            check = year == this.year;
        }
        return check;
    }
    @Override
    public String toString(){
        return day + "/" + month + "/" + year;
    }
    public long getTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(this.year, this.month, this.day, 0,0,0);
        return cal.getTimeInMillis();
    }
}