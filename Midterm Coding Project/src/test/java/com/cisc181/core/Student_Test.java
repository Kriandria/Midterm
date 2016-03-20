package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import com.cisc181.eNums.*;

import exceptions.PersonException;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@Test
	public void test() throws PersonException {
		Student Joe = new Student("Joe","James" , "John", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student Rick = new Student("Rick", "Bob", "Lehman", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.COMPSI, null, "5555555555", null);
		Student Mike = new Student("Mike", "Shangles", "Guy", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.PHYSICS, null, "5555555555", null);
		Student Josh = new Student("Josh","James" , "John", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student James = new Student("James","James" , "John", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student Jake = new Student("Jake","James" , "John", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student Joanna = new Student("Joanna","James" , "John", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student John = new Student("John","James" , "John", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student Jacob = new Student("Jacob","James" , "John", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.CHEM, null, "555-555-5555", null);
		Student Rob = new Student("Rob","James" , "John", new GregorianCalendar(1997, 8, 29).getTime(), eMajor.CHEM, null, "555-555-5555", null);
	    ArrayList<Student> people = new ArrayList<Student>();
	    people.add(Joe);
	    people.add(Rick);
		people.add(Mike);
	    people.add(Josh);
	    people.add(James);
	    people.add(Jake);
	    people.add(Joanna);
	    people.add(John);
	    people.add(Jacob);
	    people.add(Rob);
		     
	    Semester Fall = new Semester(UUID.randomUUID(), new GregorianCalendar(2015, 8, 28).getTime(), new GregorianCalendar(2015, 12, 15).getTime());
	    Semester Spring = new Semester(UUID.randomUUID(), new GregorianCalendar(2016, 2, 8).getTime(), new GregorianCalendar(2016, 5, 30).getTime());
	    ArrayList<Semester> semesters = new ArrayList<Semester>();
	    semesters.add(Fall);
	    semesters.add(Spring);

	    Course Physics = new Course(UUID.randomUUID(), "PHYS207", 0, eMajor.PHYSICS);
	    Course CompSi = new Course(UUID.randomUUID(), "CISC181", 0, eMajor.COMPSI);
	    Course Chem = new Course(UUID.randomUUID(), "CHEM103", 0, eMajor.CHEM);
	    ArrayList<Course> courses = new ArrayList<Course>();
	    courses.add(Physics);
	    courses.add(CompSi);
	    courses.add(Chem);
		    
	    Section Physics1 = new Section(Physics.getCourseID(), Physics.getCourseName(), 0, eMajor.PHYSICS, Fall.getSemesterID(), UUID.randomUUID(), 210);
	    Section Physics2 = new Section(Physics.getCourseID(), Physics.getCourseName(), 0, eMajor.PHYSICS, Spring.getSemesterID(), UUID.randomUUID(), 211);
	    Section CompSi1 = new Section(CompSi.getCourseID(), CompSi.getCourseName(), 0, eMajor.COMPSI, Fall.getSemesterID(), UUID.randomUUID(), 110);
	    Section CompSi2 = new Section(CompSi.getCourseID(), CompSi.getCourseName(), 0, eMajor.COMPSI, Spring.getSemesterID(), UUID.randomUUID(), 111);
	    Section Chem1 = new Section(Chem.getCourseID(), Chem.getCourseName(), 0, eMajor.CHEM, Fall.getSemesterID(), UUID.randomUUID(), 315);
	    Section Chem2 = new Section(Chem.getCourseID(), Chem.getCourseName(), 0, eMajor.CHEM, Spring.getSemesterID(), UUID.randomUUID(), 317);
	    ArrayList<Section> sections = new ArrayList<Section>();
	    sections.add(Physics1);
	    sections.add(Physics2);
	    sections.add(CompSi1);
	    sections.add(CompSi2);
	    sections.add(Chem1);
	    sections.add(Chem2);
	    
	    
	    ArrayList<Student> phys1 = new ArrayList<Student>();
	    phys1.add(Joe);
	    phys1.add(Mike);
	    ArrayList<Student> phys2 = new ArrayList<Student>();
	    phys1.add(Josh);
	    phys1.add(James);
	    ArrayList<Student> cs1 = new ArrayList<Student>();
	    phys1.add(Jake);
	    phys1.add(Joanna);
	    ArrayList<Student> cs2 = new ArrayList<Student>();
	    phys1.add(John);
	    phys1.add(Jacob);
	    ArrayList<Student> chem1 = new ArrayList<Student>();
	    phys1.add(Rob);	    
	    ArrayList<Student> chem2 = new ArrayList<Student>();
	    phys1.add(Rick);
	    
	    
	    
	    
	    
	    
	    people.get(0).setMajor(eMajor.NURSING);
	    assertEquals(people.get(0).getMajor(),eMajor.NURSING);
	    
	    
	    
	    
	    
	    
	    
	    
	}
}