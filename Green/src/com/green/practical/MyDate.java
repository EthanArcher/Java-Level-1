package com.green.practical;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 22:20
 */
class MyDate
{
    private int day;
    private String month;
    private int year;
    private String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
private int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // normal lengths
// Construct a new date object, given the three components
public MyDate (int d, String m, int y)
        {
        setDate(1, "January", 0); // First, set to a default date, in case d,m,y is invalid
setDate(d, m, y); // Sets this date to d, m, y if they are valid
}
public MyDate () // No specific date supplied – set to default date
        {
        setDate(1, "January", 0); // default date
}
public int getDay()
        { return day; }
public String getMonth()
        { return month; }
public int getYear()
        { return year; }

    public String toString() {
        return day + "/" + month + "/" + year;
    }


// Re-set to the supplied date, if valid; otherwise leave it
public void setDate(int d, String m, int y)
        {
        if (isValidDate(d, m, y)) // see below for code to test this
        {
        day = d;
month = m;
year = y;
} // otherwise will be left unchanged
        }
private int findMonth(String m)
        // Returns month index, 0..11, or -1 if m is not a valid month name
        {
        for (int i=0; i<12; i++)
        if (months[i].equals(m)) return i;
return -1;
}
public void print ()
        // Print this date without taking a new line
        { System.out.print(day + " " + month + " " + year); }  public void println ()
        // Print this date and take a new line
        { System.out.println(day + " " + month + " " + year); }
private int daysInMonth(String m, int y)
        { // returns the no. of days in the month m (in year y), or 0 if m is not a valid month
        if (m.equals("February"))
        if ((y%4 > 0) || ((y%100==0) && (y%400!=0))) // not a leap year
        return 28;
else return 29;
else // the normal case
        { int monthId = findMonth(m); // 0..11 if valid month, else -1
if (monthId >= 0) return numDays[monthId];
else return 0; // because it wasn’t a valid month name
}
        }
public boolean isValidDate(int d, String m, int y)
        // Returns 'true' if the 3 components constitute a valid date; false otherwise
        {
        int lastDay;
lastDay = daysInMonth(m, y); // will be 0 if m is invalid
if ((d >= 1) && (d <= lastDay))
        return true;
else
        return false;
}
        } // End of MyDate
