package Employee;
public class BasePlusCommission_Employee extends Commission_Employee{
    int base_pay;
    public BasePlusCommission_Employee(int base_pay){
        super();
        this.base_pay=0;
    }
    public BasePlusCommission_Employee(int salary,int time_sale,int base_pay){
        super(salary,time_sale);
        setBasepay(base_pay);
    }
    public void setBasepay(int bp){
        this.base_pay=bp;
    }
    public int getEarnings(int commissionRate,int grossSales,int base_pay) {
        return super.getEarnings(commissionRate, grossSales)+base_pay; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return "您的佣金比例為˙:"+salary+"銷售金額為:"+time_sale+"底薪為:"+base_pay+",薪資為:"+getEarnings(salary,time_sale,base_pay);
    }
}
