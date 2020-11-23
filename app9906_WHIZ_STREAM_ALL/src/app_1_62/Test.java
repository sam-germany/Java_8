package app_1_62;

import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

class Client {

	double budget;
	String name;
	String project;

	public Client(String n, String pr, double p) {
		this.budget = p;
		this.name = n;
		this.project = pr;
	}

	public double getBudget() {
		return budget;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name + " " + budget;
	}
}

public class Test {
	public static void main(String[] args) {

		Stream<Client> c = Stream.of(
				              new Client("will","vps server",200),              
				              new Client("Rachel","java program",1200),   
				              new Client("Anthony","Configuration",1000)   
				             );
		
		Stream<Double> func = c.map(Client::getBudget);
	
		
		func.forEach(d -> System.out.println(d));
		
	}

}
