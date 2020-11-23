package app_1_50;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Client{
	
	double budget;
	String name;
	String project;
	public Client( String name, String project, double budget) {
		this.budget = budget;
		this.name = name;
		this.project = project;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name +" "+ budget;
	}
}
public class Test {

	public static void main(String[] args) {

		Stream<Client> c = Stream.of(
				                    new Client("Sunny", "vps server",200),
				                    new Client("Sunny","Java programmer",1200),
				                    new Client("Bunny", "Configuration",1000),
				                    new Client("Bunny", "PHP Script",900)
				                   );
		
		Map<String,List<Client>> g = c.collect(Collectors.groupingBy(Client::getName));
		
		System.out.println(g);
		
	//	g.forEach(System.out::print);  this will not work as  .groupingBy() return Map<>
	//                                and .forEach() we call on Stream  but not on Map	
		
		
	}
}
