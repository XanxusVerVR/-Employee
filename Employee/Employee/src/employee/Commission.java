package employee;
public class Commission extends Employee{//雇員(無底薪)
    private int commissionRate;//佣金比例
    private int grossSales;//銷售金額
    public Commission(){
        this.commissionRate=0;
        this.grossSales=0;
    }
    public Commission(int commissionRate,int grossSales){
        this.commissionRate=commissionRate;
        this.grossSales=grossSales;
    }
    @Override
    public int getSalary() {
        return commissionRate;
    }
    public int getGrossSales() {
        return grossSales;
    }
    @Override
    public int getEarnings(int commissionRate,int grossSales) {
        return commissionRate*grossSales;
    }
    @Override
    public String toString(){
        return "您的佣金比例為˙:"+commissionRate+"銷售金額為:"+grossSales+",薪資為:"+getEarnings(commissionRate,grossSales);
    }
}
