import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

<<<<<<< HEAD
    public static void main(String args[])
=======
    public static void main(String args[]) throws Exception
>>>>>>> SamDevOpsBranch
    {
        if (args.length > 0) 
        {
            try 
            {
                Arg1 = Integer.parseInt(args[0]);
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
<<<<<<< HEAD
        }
=======
        } else if (args.length == 0) {
			System.err.println("There has been no input detected.");
			System.exit(0);
		} else {
			System.err.println("Invalid input detected.");
			System.exit(0);
		}
>>>>>>> SamDevOpsBranch

    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         int rem, num;
	num = Arg1;
	String hexadecimal=""; 
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);
<<<<<<< HEAD

	//
=======
>>>>>>> SamDevOpsBranch
    }
}
