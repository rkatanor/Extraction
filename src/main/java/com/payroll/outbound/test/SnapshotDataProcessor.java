package com.payroll.outbound.test;

import java.util.List;

import org.springframework.batch.item.ItemProcessor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.payroll.outbound.test.model.Benefits;
import com.payroll.outbound.test.model.MemberSnapshot;
import com.payroll.outbound.test.model.Subscriber;

public class SnapshotDataProcessor implements ItemProcessor<Snapshot, MemberSnapshot> {

	public MemberSnapshot process(Snapshot snapshot) throws Exception {
		// TODO Auto-generated method stub
		String snapshotData = snapshot.getSnapshot();
		XmlMapper mapper = new XmlMapper();
		MemberSnapshot memberSnapshot = mapper.readValue(snapshotData, MemberSnapshot.class);
		System.out.println(memberSnapshot);
		List<Subscriber> subscriber = memberSnapshot.getSubscriber();
		List<Benefits> benefits = subscriber.get(0).getBenefits();
		for(Benefits b:benefits) {
					if(b.getBenefit_name().equals("Medical")) {
						   return null;
					}
		}
		return memberSnapshot;

	}

}
