package employee;
public class Salaried extends Employee{//週薪
    private int weeklySalary;
    private int workingWeeks;
    public Salaried(){
        this.weeklySalary=0;
        this.workingWeeks=0;
    }
    public Salaried(int weeklySalary,int workingWeeks){
        this.weeklySalary=weeklySalary;
        this.workingWeeks=workingWeeks;
    }
    @Override
    public int getSalary() {
        return weeklySalary;
    }
    public int getWorkingWeeks() {
        return workingWeeks;
    }
    @Override
    public int getEarnings(int weeklySalary,int workingWeeks) {
        int pay=weeklySalary*workingWeeks;
        return pay;
    }
    @Override
    public String toString(){
        return "您的週薪是:"+getSalary()+"工作天數是:"+getWorkingWeeks()+",薪資為:"+getEarnings(weeklySalary,workingWeeks);
    }
}
