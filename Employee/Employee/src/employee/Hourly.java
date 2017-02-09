package employee;
public class Hourly extends Employee{//時薪
    private int wage;
    private int hours;
    public Hourly(){
        this.wage=0;
        this.hours=0;
    }
    public Hourly(int wage,int hours){
        this.wage=wage;
        this.hours=hours;
    }
    @Override
    public int getSalary() {
         return wage;
    }
    public int getHours(){
        return hours;
    }
    @Override
    public int getEarnings(int wage,int hours) {
        int pay=0;
        if(hours>40){
            pay=(int)((hours-40)*1.5*wage+40*wage);
        }
        else
            pay=wage*hours;
        return pay;
    }
    @Override
    public String toString(){
        return "您的時薪是:"+getSalary()+"工作時間是:"+getHours()+",薪資為:"+getEarnings(wage,hours);
    }
}