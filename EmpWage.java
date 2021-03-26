package Day5;
import java.util.Random;

public class EmpWage {

	public static void main(String[] args){
		int IS_FULL_TIME=1;
		int IS_part_time=2;
		int wage_per_hour=20;
		int hours;
		int working_days=20;
		int wage_per_day=0;
		int wage_per_month=0;
		int max_hours=100;
		int work_hours=0;
		int days_worked=0;

		for(int i=1;i<=working_days && work_hours < max_hours ;i++) {
			Random rand=new Random();
			int empcheck=rand.nextInt(10)%3;
			switch (empcheck){
			case 1:
				hours=12;
				break;
			case 2:

				hours=8;
				break;

			default:
				hours=0;	


			}
			
			work_hours=work_hours+hours;
			if(work_hours<=max_hours) {
			wage_per_day=hours*wage_per_hour;
			//System.out.println(" wage_per_day ="+ wage_per_day);
			wage_per_month= wage_per_month +wage_per_day;
			}
			else {
				work_hours=work_hours-hours;
			}
			
			
			
			
days_worked=i;
		}
		System.out.println("wage_per_month ="+wage_per_month+", hours_worked= "+work_hours+ ", days worked" +days_worked );
		
	}



}
