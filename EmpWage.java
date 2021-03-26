package Day6;

import java.util.Random;

public class EmpWage {
	int wage_per_hour;
	int working_days;
	int max_hours;	
	String company_name;
	EmpWage(String cmp,int wphr,int wrkdys,int max_hours){
		this.company_name=cmp;
		this.max_hours=max_hours;
		this.wage_per_hour=wphr;
		this.working_days=wrkdys;

	}


	public static void main(String[] args){
		EmpWage e1=new EmpWage("Dmart",27,23,100);
		EmpWage e2=new EmpWage("Star_marker",28,24,60);
		System.out.println(e1.company_name+" emp_wage= " +e1.calculate_wage());
		System.out.println(e2.company_name+" emp_wage= "+e2.calculate_wage());


	}


	int calculate_wage(){
		int work_hours=0;
		int wage_per_day=0;
		int wage_per_month=0;
		int days_worked=0;
		int hours=0;
		int IS_FULL_TIME=1;
		int IS_part_time=2;
				for(int i=1;i<=this.working_days && work_hours < this.max_hours ;i++) {
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
		return wage_per_month;
	}




}
