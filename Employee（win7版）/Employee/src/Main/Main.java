package Main;
import Employee.*;
import java.util.Scanner;
public class Main {
    private static int base_pays;
    public static void main(String[] args) {
        int s,t,category=0;
        Scanner sc = new Scanner(System.in);
        while(category!=-1){
            System.out.println("選擇員工類型\n1:員工週薪 2:員工時薪 3:外聘人員 4:外聘人員(底薪) -1:跳出");
            category = sc.nextInt();
            if(category==1){
                System.out.print("請輸入每週工資：");
                s = sc.nextInt();
                System.out.print("請輸入工作週數：");
                t = sc.nextInt();
                Salaried_Employee SalE=new Salaried_Employee(s,t);
                System.out.println(SalE.toString()+"\n-------------------------------------");
            }
            else if(category==2){
                System.out.print("請輸入每小時工資：");
                s = sc.nextInt();
                System.out.print("請輸入工作時數：");
                t = sc.nextInt();
                Hourly_Employee HouE=new Hourly_Employee(s,t);
                System.out.println(HouE.toString()+"\n-------------------------------------");
            }
            else if(category==3){
                System.out.print("請輸入佣金比例：");
                s = sc.nextInt();
                System.out.print("請輸入銷售金額：");
                t = sc.nextInt();
                Commission_Employee ComE=new Commission_Employee(s,t);
                System.out.println(ComE.toString()+"\n-------------------------------------");
            }
            else if(category==4){
                System.out.print("請輸入佣金比例：");
                s = sc.nextInt();
                System.out.print("請輸入銷售金額：");
                t = sc.nextInt();
                System.out.print("請輸入底薪：");
                base_pays = sc.nextInt();
                BasePlusCommission_Employee BasE=new BasePlusCommission_Employee(s,t,base_pays);
                System.out.println(BasE.toString()+"\n-------------------------------------");
            }
            else{
                System.out.println("無此類型，請重新輸入");
            }
            if(category==-1) break;
        }
    }
    /*static int Earn(Employee employee,int a,int b){
        //System.out.println(Earn(BasE,s,t));
        return employee.getEarnings(a, b);
    }*/ //版本1
    static String Earn(Employee employee){
        //System.out.println(Earn(BasE,s,t));
        return employee.toString();
    } //版本2
}
