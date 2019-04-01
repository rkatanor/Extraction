package com.payroll.outbound.test;

import org.springframework.batch.item.ItemProcessor;

import com.payroll.outbound.test.groups.TestGroup;
import com.payroll.outbound.test.model.Enrollment;

public class EnrollmentItemProcessor implements ItemProcessor<Enrollment, Enrollment>{
	
	
	public Enrollment process(Enrollment result) throws Exception {
		System.out.println("Processing result :"+result);
		
				return	TestGroup.rules(result);
	}

}
