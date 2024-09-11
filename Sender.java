package com.cisco.synchronization;

public class Sender 
{
	
	void Send(String msg) 
	{
		System.out.println("Sending msg.....: "+msg);
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Message Sent Successfully");
	}

}
