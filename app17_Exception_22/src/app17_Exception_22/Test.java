package app17_Exception_22;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Test {
    public static void main(String[] args) {
     
    	
    	
    	LocalDate localDate = LocalDate.of(2017,  Month.NOVEMBER, 5);
    	LocalTime localTime = LocalTime.of(1, 0);
    	ZoneId  zone = ZoneId.of("America/New_York");
    	ZonedDateTime z  = ZonedDateTime.of(localDate, localTime, zone);
    	
    	for(int i = 0; i<6;i++) {
    		z.plusHours(1);
    		System.out.println(z.getHour());
    	}
    	
    }
}