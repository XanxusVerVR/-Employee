package Employee;
public class Salaried_Employee extends Employee{
    public Salaried_Employee(){
        super();
    }
    public Salaried_Employee(int salary,int time_sale){
        super(salary,time_sale);
    }
    @Override
    public int getEarnings(int weekly_salary,int working_weeks) {
        int pay=weekly_salary*working_weeks;
        return pay;
    }
    @Override
    public String toString(){
        return "您的週薪是:"+salary+"工作天數是:"+time_sale+",薪資為:"+getEarnings(salary,time_sale);
    }
}
