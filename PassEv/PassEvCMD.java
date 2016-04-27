/*
 * Zachary Ninteau
 * Password Eval CMD line
 * 4/27/2016
 * V 0.0.1
 */
import java.util.*;

class PassEvCMD
{
    //takes user input -> passwords
    //returns: displays integer representing complexity of the given password.
    public static void main(String[] args)
    {
        //Quick explaination of what the heck I'm on about.
        System.out.printf("_______________________________\n" +
                           "HELLO AND WELCOME TO THE MAGIC PASSWORD EXTRAVAGANZA\n" +
                           "PLEASE INPUT A PASSWORD AND I WILL TELL YOU HOW COMPLEX IT IS!\n" +
                           "REMEMBER: NO COMMON PASSWORDS SHOULD BE IN YOUR PASSWORD!\n" +
                           "ALSO REMEMBER, LENGTH >>>>> ALL!\n");
                           
        Scanner in = new Scanner(System.in);
        int complexity = -1;
        String password;
        
        System.out.println("Input password!");
        password = new String(in.nextLine());

        complexity = PassEv.getBits(password);
        
        System.out.println("COMPLEXITY IS 2^n, WHERE n = " + complexity);
    }//end main
}//end PEC