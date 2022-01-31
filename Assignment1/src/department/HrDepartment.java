package department;

import department.SuperDepartment;

public class HrDepartment extends SuperDepartment{
	
	public String departmentName(){
		return "Hr Department ";
	}
	
	public String getTodayWork(){
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadLine(){
		return "Complete by EOD" ;
	}
	
	public String doActivity(){
		return "Team Lunch";
	}
}
