package Employee;
public abstract class Employee {
    protected int salary;
    protected int time_sale;
    public Employee(){
        salary=0;
        time_sale=0;
    }
    public Employee(int salary,int time_sale){
        this.salary=salary;
        this.time_sale=time_sale;
    }
    public int getSalary(){
        return salary;
    }
    public int getTime_sale(){
        return time_sale;
    }
    public abstract int getEarnings(int work_money,int work_time);
    //public abstract int getUserInput();
    //public void start(){
    //}
    @Override
    public abstract String toString();
}
