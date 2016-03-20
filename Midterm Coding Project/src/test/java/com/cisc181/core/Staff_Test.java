package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.core.Staff;

import exceptions.PersonException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Staff_Test {
	@Rule
	 public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void test() throws PersonException {
		Staff Joe = new Staff("A", "B", "C", new GregorianCalendar(1997, 8, 29).getTime(), "400 Aademy Street", "555-555-5555", "c", "c", 1, 20000, null, null);
		Staff Rick = new Staff(null, null, null, new GregorianCalendar(1997, 8, 29).getTime(), null, "555-555-5555", null, null, 0, 30000, null, null);
		Staff Mike = new Staff(null, null, null, new GregorianCalendar(1997, 8, 29).getTime(), null, "555-555-5555", null, null, 0, 40000, null, null);
		Staff Sandra = new Staff(null, null, null, new GregorianCalendar(1797, 8, 29).getTime(), null, "555-555-5555", null, null, 0, 50000, null, null);
		Staff Guy = new Staff(null, null, null, new GregorianCalendar(1997, 8, 29).getTime(), null, "55-555-5555", null, null, 0, 60000, null, null);
		
	     ArrayList<Staff> people = new ArrayList<Staff>();
	     people.add(Joe);
	     people.add(Rick);
	     people.add(Mike);
	     people.add(Sandra);
	     people.add(Guy);
		
		assertEquals((people.get(0).getSalary() + people.get(1).getSalary() + people.get(2).getSalary() + people.get(3).getSalary() + people.get(4).getSalary())/5,40000,0.01);
	


			    Staff staffT = new Staff(null, null, null, new GregorianCalendar(1797, 8, 29).getTime(), null, "55-555-5555", null, null, 0, 60000, null, null);

			    final String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
			    boolean test = false;
			    
			    Pattern pattern = Pattern.compile(regex);

			    String number = staffT.getPhone();
			    Matcher matcher = pattern.matcher(number);
			    
			    if (!matcher.matches()) {
			    	 test = true;
			         
			    }
			           
			    assertEquals(test, true);
		    
			    test = false;
			    
				Calendar now = Calendar.getInstance();
			    now.add(Calendar.YEAR,-100);
			    
				if (staffT.getDOB().before(now.getTime())) {
					test = true;
				} 
		    
			    assertEquals(test,true);
		}
		       
		
			
	

}
