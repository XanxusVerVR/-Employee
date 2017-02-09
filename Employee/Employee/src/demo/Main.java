package demo;
import employee.*;
import java.util.Scanner;
public class Main {
    private static int totalSalay=0;//儲存總薪資
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee[] employee=new Employee[4];
        int category=0;
        while(category!=-1){
            System.out.println("選擇員工類型\n1:員工週薪 2:員工時薪 3:外聘人員 4:外聘人員(底薪) -1:跳出");
            category = sc.nextInt();
            if(category==1){
                System.out.print("請輸入每週工資：");
                int weeklySalary = sc.nextInt();
                System.out.print("請輸入工作週數：");
                int workingWeeks = sc.nextInt();
                employee[0]=new Salaried(weeklySalary,workingWeeks);
                totalSalay+=employee[0].getEarnings(weeklySalary,workingWeeks);
            }
            else if(category==2){
                System.out.print("請輸入每小時工資：");
                int wage = sc.nextInt();
                System.out.print("請輸入工作時數：");
                int hours = sc.nextInt();
                employee[1]=new Hourly(wage,hours);
                totalSalay+=employee[1].getEarnings(wage,hours);
            }
            else if(category==3){
                System.out.print("請輸入佣金比例：");
                int commissionRate= sc.nextInt();
                System.out.print("請輸入銷售金額：");
                int grossSales= sc.nextInt();
                employee[2]=new Commission(commissionRate,grossSales);
                totalSalay+=employee[2].getEarnings(commissionRate,grossSales);
            }
            else if(category==4){
                System.out.print("請輸入佣金比例：");
                int commissionRate = sc.nextInt();
                System.out.print("請輸入銷售金額：");
                int grossSales = sc.nextInt();
                System.out.print("請輸入底薪：");
                int basePay = sc.nextInt();
                BasePlusCommission BasP=new BasePlusCommission(commissionRate,grossSales,basePay);
                employee[3]=new BasePlusCommission(commissionRate,grossSales,basePay);
                totalSalay+=BasP.getEarnings(commissionRate,grossSales,basePay);
            }
            else if(category==-1){
                Earn(employee);
                break;
            }
            else{
                System.out.println("無此類型，請重新輸入");
            }
        }//while結束
    }//main結束
    public static void Earn(Employee[] employee){
        for(int i=0;i<=employee.length-1;i++){
            if(employee[i]!=null){
                System.out.println(employee[i]);
            }
        }
        System.out.println("總薪資為："+totalSalay);
    }
}//class Main結尾