package employee;
public abstract class Employee {
    public Employee(){
    }
    public abstract int getSalary();
    public abstract int getEarnings(int work_money,int work_time);
    @Override
    public abstract String toString();
}