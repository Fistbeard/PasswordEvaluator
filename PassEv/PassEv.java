/*
 * Password Eval Backend - the meat and bones of password evals
 * Zachary Ninteau
 * 4/27/2016
 * GNU Public v3
 * V 0.0.1
 * Quick Usage: Use PassEv.getBits(pass) to get an integer back stating how complex the password is, as a number of bits.
 */
import java.util.*;

class PassEv
{
    //takes: string representing password to be used
    //returns: integer n where n reprents 2^n bits of complexity. 
    public static int getBits(String pass)
    {
        return 0;
    }//end gb
    
    //takes string
    //returns: as above, but assume adversary knows type of each symbol (good for words in password)
    public static int getBitsAssumePosKnown(String pass)
    {
        return 0;
    }//end gbapk
    
    //takes: nothing!
    //returns: array list of all the common words!
    //uses commonpasswords.txt in same directory. Default is top 100 from 
    //https://github.com/danielmiessler/SecLists/tree/master/Passwords - replace file as needed.
    //Also, it's really funny that the 27th most common password is "pussy"...
    static List getCommonWords()
    {
        //just to compile
        List<String> words = new ArrayList<String>();
        
        return words;
    }//end gcw
}//end PassEv