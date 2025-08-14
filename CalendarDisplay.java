import java.util.Scanner;
public class CalendarDisplay {
// Method to get the name of the month
public static String getMonthName(int month) { 25
String[] months = {
"January", "February", "March", "April", "May", "June",
"July", "August", "September", "October", "November", "December"
};
return months[month - 1];
}
// Method to check if a year is a leap year
public static boolean isLeapYear(int year) {
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
return true;
}
return false;
}
// Method to get the number of days in a month
public static int getNumberOfDays(int month, int year) {
int[] daysInMonth = {
31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
};
// If the month is February and it's a leap year, return 29 days
if (month == 2 && isLeapYear(year)) {
return 29;
}
return daysInMonth[month - 1];
}
// Method to get the first day of the month using the Gregorian Calendar Algorithm
public static int getFirstDayOfMonth(int month, int year) {
// Adjust the month and year for the Gregorian calendar formula
int y0 = year - (14 - month) / 12;
int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
int m0 = month + 12 * ((14 - month) / 12) - 2;
int d0 = (1 + x + 31 * m0 / 12) % 7;
return d0;
}
// Method to display the calendar
public static void displayCalendar(int month, int year) {
// Get the first day of the month and the number of days
int firstDay = getFirstDayOfMonth(month, year);
int numberOfDays = getNumberOfDays(month, year); 26
// Get the month name
String monthName = getMonthName(month);
// Display the month and year
System.out.println("Calendar for " + monthName + " " + year);
System.out.println("Sun Mon Tue Wed Thu Fri Sat");
// Display leading spaces for the first day
for (int i = 0; i < firstDay; i++) {
System.out.print(" ");
}
// Display the days of the month
for (int day = 1; day <= numberOfDays; day++) {
System.out.printf("%3d ", day);
// Move to the next line after Saturday
if ((day + firstDay) % 7 == 0) {
System.out.println();
}
}
// New line after the last day of the month
System.out.println();
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take user input for month and year
System.out.print("Enter the month (1-12): ");
int month = scanner.nextInt();
System.out.print("Enter the year: ");
int year = scanner.nextInt();
// Display the calendar for the given month and year
displayCalendar(month, year);
scanner.close();
}
}