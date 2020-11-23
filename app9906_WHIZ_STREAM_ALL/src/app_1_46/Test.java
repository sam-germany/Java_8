package app_1_46;

import java.util.function.Predicate;
import java.util.stream.Stream;

class Client{
	String name;
	String project;
	double budget;

	public Client(String name, String project,double budget) {
		this.name = name;
		this.project = project;
		this.budget = budget;
	}
	public double getBudget() {
		return budget;
	}
	public String getName() {
		return name;
	}
	public String getProject() {
		return project;
	}
	
	public String toString() {
		return name +" "+ budget;
	}
}
public class Test {
	public static void main(String[] args) {

		Stream<Client> c = Stream.of(
				                  new Client("Will",  "vps server",200),
				                  new Client("Rachel","Java program",1200),
				                  new Client("Anthony", "Configuration",000)
				                     );
		
		Predicate<Client> func = e ->{
			                          System.out.println(e.getName()+ "  ");
			                          return e.getBudget() > 1000.0;
		                              };
		c.noneMatch(func);
	}  //  if condition return false it continue checking further
       // if condition return true it stop checking
} 
