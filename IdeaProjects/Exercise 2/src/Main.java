//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
/*
1.Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser"
If the role is user print "welcome user" (tip:
use if else)
 */
   String role = "admin";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter role : admin,superuser,user");
    String role = sc.nextLine();

    if ("admin".equals(role)) {
        System.out.println("welcome admin");
    } else if ("superuser".equals(role)) {
        System.out.println("welcome superuser");
    } else if ("user".equals(role)) {
        System.out.println("welcome user");
    } else System.out.println("error");

    /*
    2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The
greatest: 87
     */
    System.out.println("enterfN");
    int fN = sc.nextInt();
    System.out.println("entersN");
    int sN = sc.nextInt();
    System.out.println("entertN");
    int tN = sc.nextInt();
    int max = fN;
    if (sN > max) {
        max = sN;
    }
    if (tN > max) {
        max = tN;
    }
    System.out.println("Thegreatest" + max);
    /*
     Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday
     */
    System.out.println("entar numberD 1-7");
    int numerD = sc.nextInt();
    switch (numerD) {
        case 1:
            System.out.println("sunday");
            break;
        case 2:
            System.out.println("monday");
            break;
        case 3:
            System.out.println("tuesday");
            break;
        case 4:
            System.out.println("wednesday");
            break;
        case 5:
            System.out.println("thursday");
            break;
        case 6:
            System.out.println("friday");
            break;
        default:
            System.out.println("starday");
    }
/*
Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69  F:
0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B
 */
    System.out.print("enter marks");
    int marks = sc.nextInt();
    if (marks >= 90) {
        System.out.print("G(A)");
    } else if (marks >= 80) {
        System.out.println("G(B)");
    } else if (marks >= 70) {
        System.out.println("G(C)");

    } else if (marks >= 60) {
        System.out.println("G(D)");

    } else {
        System.out.println("fail");

    }
/*
Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
"Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a
"Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output:
Enter your age: 25
You are an Adult.
 */
    System.out.println("enter age");
    int age = sc.nextInt();
    if (age < 13) {
        System.out.println("chid");
    } else if (age <= 19) {
        System.out.println("Teenager");

    } else {
        System.out.println("adult");
    }
}

