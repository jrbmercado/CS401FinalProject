import java.util.*;
import java.lang.Math;
import java.util.Random;


public class dispatch {
	private  String report ;
	private double ETA;
	private String report2; 
	
	
	
	public String getReport() {
		return report; 
		
	}
	
	public void setReport(String rprt) {
		report=rprt; 
		
	}

	public void sendFire()
	{
		//will call FireStation function
	}
	
	public void sendMedical()
	{
		//will call AmbulanceStation function
	}
	
	public void sendPolice() 
	{
		//will call PoliceStation function 
	}
	
	public void setETA() {
		double time= (Math.random() *(180-1)) +1;
		ETA= time;
		
	}
	
	public double getETA() {
		return ETA; 
		
	}
	
	public void set911Report(String report_911) {
		report2=report_911;
		
	}
	
	public String get911Report()
	{
		return report2;
	}
	
	public String toString() 
	{
		return "Estimated Time is " + getETA() + " minutes for Report " + getReport();
	}
	
}
