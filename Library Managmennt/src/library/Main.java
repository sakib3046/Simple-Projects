package library;
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	static String[] books={"C","JAVA","PYTHON"};
	static final float dicStudent=0.5f;
	static final float dicTeacher=0.3f;
	static final float dicPublic=0.1f;
	static String choice;
	static String[] people={"student","teacher","public"};
	static String name;
	private static float x;
	
// Main Method Start..................................................................................
	
	public static void main(String[] args) {
		
		pr("\t<---Welcome To My Book Store--->\n");
		pr("\n\tSir,What Are You Want?\nAll Books Price is 200 Taka.\n\n Please Enter Your Choice:");
		choice=sc.nextLine().toUpperCase();
		
		pr("Are You=> Student/Teacher/Public/Etc\nEnter Please-->");
		name=sc.nextLine();
		
		if(books[0].equals(choice)){
			pr("\nYour choice is:"+books[0]+"\n");
			pr("\nAs a Student please give "+discount(name)+" Taka");
			
		}
		else if(books[1].equals(choice)){
			pr("\nYour choice is:"+books[1]);
			pr("\nAs a Teacher please give "+discount(name)+" Taka");
		}
		else if(books[2].equals(choice)){
			pr("\nYour choice is:"+books[2]);
			pr("\nAs a Public please give "+discount(name)+" Taka");
		}
		else{
			pr("\n Out of stock.Sorry!!!!!");
		}
		
	
		
	}
	
	//Main Method End.......................................................................................
	
	static float discount(Object anyObject){
		if(people[0].toLowerCase().endsWith(name)){
		 x=(float) (200-(200*dicStudent));
			
		}
		else if(people[1].toLowerCase().endsWith(name)){
			 x=(float) (200-(200*dicTeacher));
			}
		else if(people[2].toLowerCase().endsWith(name)){
			 x=(float) (200-(200*dicPublic));
			}
		else{
			pr("Sorry... We haven't any Discount for you. Give me 200 Taka.");
		}
		
	return x;
	
	}
	static void pr(Object anyObject){
		
			System.out.print(anyObject);
		}
	
		
	}


