package department;

import department.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	
	public String departmentName(){
		return "Tech Department ";
	}
	
	public String getTodayWork(){
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadLine(){
		return "Complete by EOD ";
	}
	
	public String getTechStackInformation(){
		return "Core Java";
	}
}