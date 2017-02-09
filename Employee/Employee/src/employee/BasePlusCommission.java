package employee;
import employee.Commission;
public class BasePlusCommission extends Commission{//雇員(有底薪)
    private int basePay;//底薪
    public BasePlusCommission(int basePay){
        super();
        this.basePay=0;
    }
    public BasePlusCommission(int commissionRate,int grossSales,int basePay){
        super(commissionRate,grossSales);
        setBasePay(basePay);
    }
    public int getBasePay(){
        return basePay;
    }
    public void setBasePay(int basePay){
        this.basePay=basePay;
    }
    public int getEarnings(int commissionRate,int grossSales,int basePay) {
        return super.getEarnings(commissionRate, grossSales)+basePay;
    }
    @Override
    public String toString(){
        return "您的佣金比例為:"+super.getSalary()+"銷售金額為:"+super.getGrossSales()+"底薪為:"+getBasePay()+",薪資為:"+getEarnings(super.getSalary(),super.getGrossSales(),basePay);
    }
}