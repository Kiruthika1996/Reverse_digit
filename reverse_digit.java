import java.io.*;

import java.util.*;

public class reverse_digit

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

System.out.println("Enter an Integer to reverse");

int n=s.nextInt();

int reverse=0;

while(n!=0)
{reverse=reverse*10;

reverse=reverse+n%10;

n=n/10;

}

System.out.println("Reverse digit of the given integer"+reverse);

}

}
