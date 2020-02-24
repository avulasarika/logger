package com.epam.loggingDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Compoundinterest {
	private static final Logger LOGGER = LogManager.getLogger(Compoundinterest.class);

	double amount;
	double principal_ci;
	double rate_ci;
	double time_ci;
	Compoundinterest(double x,double y,double z)
	{
		principal_ci=x;
		rate_ci=y;
		time_ci=z;
	}
void CalculateCI()
{
	amount=principal_ci * Math.pow(1 + rate_ci/100, time_ci);
	LOGGER.error("The compound interest for a year is : " +amount);
}
}

