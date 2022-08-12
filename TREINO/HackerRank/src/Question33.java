import java.util.*;
public class Question33 {
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		Map<String,Integer> phoneBook = new HashMap<String,Integer>();
		int n;
		
		n = r.nextInt();
		
		if(n >= 1 && n <= Math.pow(10, 5)) {
			for(int i = 0 ; i < n ; i++) {
				String name = r.next();
				int phoneNumber = r.nextInt();
				phoneBook.put(name,phoneNumber);
			}
			while(r.hasNext()) {
				String name = r.next();
				if(phoneBook.containsKey(name)) {
					System.out.println(name + "=" + phoneBook.get(name));
				}else {
					System.out.println("Not found");
				}
			}
		r.close();
		}
	}
}
/*public class Question33 {
	public static void main(String[] args) {
		//English to Spanish Example of HashMap
		Map<String,String> englSpanDictionary = new HashMap<String,String>();
		//Putting things inside our dictionary
		englSpanDictionary.put("Monday", "Lunes");
		englSpanDictionary.put("Tuesday", "Martes");
		englSpanDictionary.put("Wednesday", "Miercoles");
		englSpanDictionary.put("Thursday", "Jueves");
		englSpanDictionary.put("Friday", "Viernes");
		englSpanDictionary.put("Saturday", "Sábado");
		englSpanDictionary.put("Sunday", "Domingo");
		//Retrieve things from our dictionary
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));
		System.out.println(englSpanDictionary.get("Wednesday"));
		System.out.println(englSpanDictionary.get("Thursday"));
		System.out.println(englSpanDictionary.get("Friday"));
		//Print out all Keys
		System.out.println(englSpanDictionary.keySet());
		//Print out all values
		System.out.println(englSpanDictionary.values());
		//Print out size
		System.out.println("The size of our Dictionary is " + englSpanDictionary.size());
		
		System.out.println();
		System.out.println();
		
		//Shopping List
		Map<String,Boolean>shoppingList = new HashMap<String,Boolean>();
		//Put some stuff in dictionary
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		//Retrieve items
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Oreos"));
		// Key-value pairs print out 
		System.out.println(shoppingList.toString());
		//Clear our Dictionary
		//shoppingList.clear();
		System.out.println(shoppingList.toString());
		//Is Empty?
		System.out.println(shoppingList.isEmpty());
		//Remove things
		shoppingList.remove("Eggs");
		System.out.println(shoppingList.toString());
		//Replace values for a certain key
		shoppingList.put("Bread", Boolean.FALSE);
		// Key-value pairs print out 
		System.out.println(shoppingList.toString());
	}
}*/
/*
Task
Given n names and phone numbers, assemble a phone book that maps friends' names to their respective 
phone numbers. You will then be given an unknown number of names to query your phone book for. 
For each name queried, print the associated entry from your phone book on a new line in the form 
name=phoneNumber; if an entry for name is not found, print Not found instead.
Note: Your phone book should be a Dictionary/Map/HashMap data structure.
          Input Format
The first line contains an integer, n, denoting the number of entries in the phone book.
Each of n the subsequent lines describes an entry in the form of 2 space-separated values on a single
line. The first value is a friend's name, and the second value is an 8-digit phone number.
After the n lines of phone book entries, there are an unknown number of lines of queries. Each line 
(query) contains a name to look up, and you must continue reading lines until there is no more input.
Note: Names consist of lowercase English alphabetic letters and are first names only.
          Constraints
 - 1 <= n <= 10^5
 - 1 <= queries <= 10^5          
          Output Format
On a new line for each query, print Not found if the name has no corresponding entry in the phone book;
otherwise, print the full name and phoneNumber in the format name=phoneNumber.
          Sample Input
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
          Sample Output
sam=99912222
Not found
harry=12299933
          Explanation
We add the following n = 3(Key,Value) pairs to our map so it looks like this:
phoneBook - {(sam,99912222),(tom,11122222),(harry,12299933)} 
We then process each query and print key=value if the queried keyis found in the map; otherwise, we print
Not found.
Query 0: sam
Sam is one of the keys in our dictionary, so we print sam=99912222.
Query 1: edward
Edward is not one of the keys in our dictionary, so we print Not found.
Query 2: harry
Harry is one of the keys in our dictionary, so we print harry=12299933.
*/