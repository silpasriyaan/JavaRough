
public class BudzDemo4 {
public static void main(String[] args) {
int grossSalary=10000;
BudzDemo4 bd1=new BudzDemo4();
int charges=bd1.houseCharges();
int netSalary=grossSalary-charges;
System.out.println(netSalary);
int taxCal=30*charges;
System.out.println(taxCal);
	}
int houseCharges()
{
	System.out.println("houseCharges is invoking");
	int rent=1000;
	int childFee=2000;
	int totalCharges=rent+childFee;
	System.out.println(totalCharges);
	return totalCharges;
}
}
