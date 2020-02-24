package com.epam.loggingDemo;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainHouseConstruction {
	private static final Logger LOGGER = LogManager.getLogger(MainHouseConstruction.class);

			public static void main(String args[])
			
			{
				String c;
				try (Scanner sc = new Scanner(System.in)) {
					LOGGER.error("enter area of House in square feet");
					double x =sc.nextDouble();
					LOGGER.error("enter materials standard usage");
				     sc.nextLine();
				    c = sc.nextLine();
                    Houseconstruction h=new Houseconstruction(x);
					h.calculation(c);
					
				}


			}

}

