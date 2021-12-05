package com.depts;

class SuperDept {
	String deptName = "Super Department";
	String TodaysWork = "No work as of now";
	String WorkDeadline = "Nil";
	String isTodayHoliday = "Today is not a holiday";
	
	public String getTodaysWork() {
	return TodaysWork;
	}
	public String getWorkDeadline( ) {
	return WorkDeadline;
	}
	public String deptname() {
	return deptName;
	}

}
class AdminDept extends SuperDept{
	String deptName = "Admin department";
	String TodaysWork = "Complete your documents submission";
	String WorkDeadline = "Complete by EOD";
	
	public String getTodaysWork() {
		return TodaysWork;
	}
	public String getWorkDeadline( ) {
		return WorkDeadline;
	
}
static class HrDept extends SuperDept{
	String deptName = "HR department";
	String TodaysWork = "Fill today’s timesheet and mark your attendance";
	String WorkDeadline = "Complete by EOD";
	String doActivity = "Team Lunch";
	
	public String getTodaysWork() {
		return TodaysWork;
	}
	public String getWorkDeadline( ) {
		return WorkDeadline;
	}
	
}
static class TechDept extends SuperDept{
	String deptName = "Tech department";
	String TodaysWork = "Complete coding of module 1";
	String WorkDeadline = "Complete by EOD";
	String TechStackInformation = "Core Java";

	public String getWorkDeadline( ) {
		return WorkDeadline;
	}
	public String getTechStackInformation( ) {
		return TechStackInformation;
	}
	
}

	public static void main(String args[]) {
		AdminDept ad = new AdminDept();
		HrDept hr = new HrDept();
		TechDept tech = new TechDept();
			System.out.println("Welcome to "+ ad.deptName);
			System.out.println( ad.getTodaysWork());
			System.out.println(ad.getWorkDeadline());
			System.out.println(ad.isTodayHoliday +"\n");
		
			System.out.println("Welcome to "+ hr.deptName);
			System.out.println(hr.doActivity);
			System.out.println( hr.getTodaysWork());
			System.out.println(hr.getWorkDeadline());
			System.out.println(hr.isTodayHoliday +"\n");
			System.out.println("Welcome to "+ tech.deptName);
			System.out.println(tech.TodaysWork);
			System.out.println(tech.getWorkDeadline());
			System.out.println(tech.TechStackInformation);
			System.out.println(tech.isTodayHoliday);
		
	}

}


