package Employee;
public class Commission_Employee extends Employee{
    public Commission_Employee(){
        super();
    }
    public Commission_Employee(int salary,int time_sale){
        super(salary,time_sale);
    }
    @Override
    public int getEarnings(int commissionRate, int grossSales) {
        return commissionRate*grossSales;
    }
    @Override
    public String toString(){
        return "您的佣金比例為˙:"+salary+"銷售金額為:"+time_sale+",薪資為:"+getEarnings(salary,time_sale);
    }
}
