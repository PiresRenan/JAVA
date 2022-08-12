import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sArr = s.split(":");
        String regex = "PM";
        String regex2 = "AM";
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher m = pattern.matcher(s);
        Matcher m2 = pattern2.matcher(s);
        int hh = Integer.parseInt(sArr[0]),
        	mm = Integer.parseInt(sArr[1]),
        	ss = Integer.parseInt(sArr[2].substring(0, 2));
        
        if(m.find()) {
        	hh = hh + 12;
        	if(hh == 24) {
        		hh = 12;
        		System.out.printf("%02d:%02d:%02d",hh,mm,ss);
        	}else if( hh < 24 && hh > 0) {
        		System.out.printf("%02d:%02d:%02d",hh,mm,ss);
        	}else {
        		System.out.println("ERROR");
        	}
        }else if(m2.find()) {
        	if(hh == 12) {
        		hh = 0;
        	}
        	System.out.printf("%02d:%02d:%02d",hh,mm,ss);
        }else {
        	System.out.println("ERROR");
        }
    
	}

}
/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
        Example
 - '12:01:00PM'        
Return '12:01:00'.
 - '12:01:00AM'
Return '00:01:00'.
        Function Description
Complete the timeConversion function in the editor below. It should return a new
string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
 - string s: a time in 12 hour format
        Returns
 - string: the time in 24 hour format
        Input Format
A single string s that represents a time in 12-hour clock format (i.e.:hh:mm:ssAM or
hh:mm:ssPM).
        Constraints
  -  All input times are valid
        Sample Input 0
07:05:45PM
        Sample Output 0
19:05:45
*/