package color;

import java.util.ArrayList;
import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			String temp=sc.next();	
			al.add(temp);
		}
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
