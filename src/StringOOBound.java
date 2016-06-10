import java.util.Scanner;

public class StringOOBound {

	public static void main(String[] args){
	
        String[] names = new String[] { "Bijay Kumar Swain" ,"Hritik Roshan","Akshay Kumar",
                "John Abraham","Sylvester Stallon","Tom Cruise"};
        
        int a,c,d,b = names.length;
        Scanner input = new Scanner(System.in);
        try{
    		System.out.println("Enter Index No of Name for Display and Length of Name :");
        	a = input.nextInt();
        	c = input.nextInt();
            d = names[a].length();
        	
            System.out.println("String Has " + b + " Names");
            System.out.println("Displaying Name " + names[a] );
            System.out.println("Actual Size " + d );

            for(int i =0;i < c;i++){
            	System.out.println(names[a].charAt(i));
            }
            
        }
        catch(ArrayIndexOutOfBoundsException e){
        	System.out.println("Invalid Entry for Name Display");
        }
        catch(StringIndexOutOfBoundsException e){
        	System.out.println("Invalid Name Size Entered");
        }
        catch(Exception e){
        	e.printStackTrace();
			System.out.println("Something wrong out there: "+e.getMessage());
        }
		finally{
			input.close();
		}
        
	}
}