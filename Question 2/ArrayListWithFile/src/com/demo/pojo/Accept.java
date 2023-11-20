package com.demo.pojo;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Accept {
	Scanner scan=new Scanner(System.in);
	
	static List<String>list1=new ArrayList<String>();
	
	static List<String>list2=new ArrayList<String>();
	
	
	public void acceptData()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the string");
			String input=scan.next();
			
			list1.add(input);
			
			
		}
		

		
		for(String s:list1)
		{
			if(s.length()>5)
			{
				list2.add(s);
			}
		}
		
	}
	

	
	
	public void writeToFile()
	{
		File f=new File("data.txt");
		
		
		
		
		try(DataOutputStream ds=new DataOutputStream(new FileOutputStream("data.txt"));){
			
			if(f.exists()) {
				
			for(String input:list2)
			{
				ds.writeChars(input);
			}
				
			}	
		}catch(FileNotFoundException e)
		{
			e.getMessage();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}
	
	
	

}
