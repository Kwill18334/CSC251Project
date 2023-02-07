import java.text.DecimalFormat;
import java.util.Scanner;

public class Policy.java {

public static void main(String[] args) {
int policyNumber, age;
double height, weight;
String providerName, phFname, phLname, smoking;


// DecimalFormat class is used to format the output
DecimalFormat df = new DecimalFormat(".00");
/*
* Creating an Scanner class object which is used to get the inputs
* entered by the user
*/
Scanner sc = new Scanner(System.in);

// Getting the input entered by the user
System.out.print("Please enter the Policy Number: ");
policyNumber = sc.nextInt();
sc.nextLine();
System.out.print("Please enter the Provider Name: ");
providerName = sc.nextLine();
System.out.print("Please enter the Policyholder’s First Name: ");
phFname = sc.nextLine();
System.out.print("Please enter the Policyholder’s Last Name: ");
phLname = sc.nextLine();
System.out.print("Please enter the Policyholder’s Age: ");
age = sc.nextInt();
sc.nextLine();
System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
smoking = sc.nextLine();
System.out.print("Please enter the Policyholder’s Height (in inches): ");
height = sc.nextDouble();
System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
weight = sc.nextDouble();

InsurancePolicies ip = new InsurancePolicies(policyNumber,
providerName, phFname, phLname, age, smoking, height, weight);
System.out.println("\n\nPolicy Number: " + ip.getPolicyNumber());

System.out.println("Provider Name: " + ip.getProviderName());
System.out.println("Policyholder’s First Name: " + ip.getPhFirstname());

System.out.println("Policyholder’s Last Name: " + ip.getPhLastname());
System.out.println("Policyholder’s Age: " + ip.getPhAge());
System.out.println("Policyholder’s Smoking Status: "+ ip.getPhSmokeStatus());
System.out.println("Policyholder’s Height: " + ip.getInches()+ " inches");
System.out.println("Policyholder’s Weight: " + ip.getWeight()+ " pounds");
System.out.println("Policyholder’s BMI: " + df.format(ip.calculateBMI()));
System.out.println("Policy Price: $" + df.format(ip.calcInsurancePolicy()));

}

}