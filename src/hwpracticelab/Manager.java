package hwpracticelab;

public class Manager extends Habits implements Person {
    static int countm;
	private int mId;
	private String manName;
	private Double manSalary;
   Manager()
   {
	   countm++; //System.out.println("Total number of Managers " +countm);
   }
	public void eat()
	{
		System.out.println("Manager can eat");
	}
	public void sleep()
	{
		System.out.println("Manager can sleep");
	}
	public void reading()
	{
		System.out.println("Manager can read");

}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
	     
		this.mId = mId; 
	}
	public String getManName() {
		return manName;
	}
	public void setManName(String manName) {
		this.manName = manName;
	}
	public Double getManSalary() {
		return manSalary;
	}
	public void setManSalary(Double manSalary) {
		this.manSalary = manSalary;
	}
	/*static int getManCount()
	{
		return countm;
	}*/
}