package Employee;
public class Hourly_Employee extends Employee{
    public Hourly_Employee(){
        super();
    }
    public Hourly_Employee(int salary,int time_sale){
        super(salary,time_sale);
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
        return "您的時薪是:"+salary+"工作時間是:"+time_sale+",薪資為:"+getEarnings(salary,time_sale);
    }
}
