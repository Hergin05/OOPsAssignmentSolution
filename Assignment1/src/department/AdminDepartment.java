package department;

import department.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	
	public String departmentName(){
		return "Admin Department";
	}
	
	public String getTodayWork(){
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadLine(){
		return "Complete by EOD";
	}
}
