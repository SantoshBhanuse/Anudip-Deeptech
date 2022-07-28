class Encapsulation
{
	private long empAadhar;
	private String empName;
	private int empAge;
	public long getEmpAadhar()
	{
		return empAadhar;
	}
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpAge()
	{
		return empAge;
	}
	public void setEmpAge(int newValue)
	{
		empAge=newValue;
	}
	public void setEmpAadhar(long newValue)
	{
		empAadhar=newValue;
	}
	public void setEmpName(String newValue)
	{
		empName=newValue;
	}
	public static void main(String[] args)
	{
		Encapsulation obj=new Encapsulation();
		obj.setEmpName("Ramu");
		obj.setEmpAge(26);
		obj.setEmpAadhar(122212221222L);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("Employee Aadhar: " + obj.getEmpAadhar());
		obj.setEmpName("Ganesh");
		obj.setEmpAge(22);
		obj.setEmpAadhar(444444444444L);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("Employee Aadhar: " + obj.getEmpAadhar());
	}
}
	