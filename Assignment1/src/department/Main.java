package department;

public class Main {

	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment();
		System.out.println("Welcome to "+ad.departmentName());
		System.out.println(ad.getTodayWork());
		System.out.println(ad.getWorkDeadLine());
		System.out.println(ad.isTodayHoliday()+"\n");
		
		HrDepartment hd = new HrDepartment();
		System.out.println("Welcome to "+hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodayWork());
		System.out.println(hd.getWorkDeadLine());
		System.out.println(hd.isTodayHoliday()+"\n");
		
		TechDepartment td = new TechDepartment();
		System.out.println("Welcome to "+td.departmentName());
		System.out.println(td.getTodayWork());
		System.out.println(td.getWorkDeadLine());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayHoliday());
	}
}
