package com.payroll.outbound.test;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String areg[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-context.xml");

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("PayrollJob");

		try {
			JobParameters JobParams = new JobParametersBuilder()
			     	.addString("subscriberoid", "12661247")
					.addString("sponsoroid", "100100123")
					.toJobParameters();

			JobExecution execution = jobLauncher.run(job, JobParams);
			System.out.println("Job Exit Status : " + execution.getStatus());
			

		} catch (JobExecutionException e) {
			System.out.println("Job Payroll Outboud failed");
			e.printStackTrace();
		}
	}

}
