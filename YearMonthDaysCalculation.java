class YearMonthDaysCalculation
{
	public static void main(String []args){
	int days =500;
	int year = days/365;
	int month=days%365/30;
	int d=days%365%30;
	System.out.println(year+" Year "+month+" Month "+d+" Days");
}		
}