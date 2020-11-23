package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		
		
		System.out.println(LocalDateTime.parse("1987-09-01 25:25").format(DateTimeFormatter.ISO_DATE_TIME));
	    }
	}