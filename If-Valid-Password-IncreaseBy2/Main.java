import java.util.*;

public class Main
{
    public static boolean isValid(String str)
    {
        boolean hasupper=false,haslower=false,hasdigit=false,hasspecial=false;
        
        for(char ch : str.toCharArray())
        {
            if(Character.isUpperCase(ch)) 
            {
                hasupper = true;
            }
            else if(Character.isLowerCase(ch))
            {
                haslower = true;
            }
            else if(Character.isDigit(ch))
            {
                hasdigit = true;
            }
            else if(ch == '#' || ch== '@')
            {
                hasspecial = true;
            }
        }
        
        return hasupper && haslower && hasdigit && hasspecial;
    }
    public static String increasebytwo(String password)
    {
        StringBuilder newpassword = new StringBuilder();
        
        for(char ch : password.toCharArray())
        {
            if(ch == '@')
            {
                newpassword.append('#');
            }
            else if(ch == '#')
            {
                newpassword.append('@');
            }else{
            newpassword.append((char)(ch+2));
            }
        }
        return newpassword.toString();
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		int n = sc.nextInt();
		
		if(isValid(password))
		{
		   String res = increasebytwo(password);
		   System.out.println(res);
		}
		else{
		    System.out.println("not valid");
		}
	}
}
