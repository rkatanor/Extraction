package com.payroll.outbound.test;

import java.util.List;

import org.joda.time.DateTime;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.JobParameters;

public class EnrollmentResultJobListener implements JobExecutionListener {

	private DateTime startTime, stopTime;

	public void beforeJob(JobExecution jobExecution) {
		JobParameters jobParameters = jobExecution.getJobParameters();
		startTime = new DateTime();
		System.out.println("Payroll Extraction Job starts at :" + startTime);
	}

	/*
	 * @Value("#{jobParameters['personid']}") String id;
	 */

	public void afterJob(JobExecution jobExecution) {

		stopTime = new DateTime();
		System.out.println("Payroll Extraction  Job stops at :" + stopTime);
		System.out.println("Total time take in millis :" + getTimeInMillis(startTime, stopTime));

		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			System.out.println("Payroll Extraction job completed successfully");
			// Here you can perform some other business logic like cleanup
		} else if (jobExecution.getStatus() == BatchStatus.FAILED) {
			System.out.println("Payroll Extraction job failed with following exceptions ");
			List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
			for (Throwable th : exceptionList) {
				System.err.println("exception :" + th.getLocalizedMessage());
			}
		}
	}

	private long getTimeInMillis(DateTime start, DateTime stop) {
		return stop.getMillis() - start.getMillis();
	}

}
