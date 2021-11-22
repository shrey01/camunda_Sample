package com.camunda.clovity.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import camundajar.impl.scala.collection.immutable.List;

import javax.inject.Named;

@Named
public class CalculateResult implements JavaDelegate {

	@Override
	public void execute(DelegateExecution delegateExecution) throws Exception {
		QuizGame q1 = new QuizGame();
		QuizGame2 q2 = new QuizGame2();
		
		if(delegateExecution.getCurrentActivityId().equalsIgnoreCase("Activity_1nnuw04"))
				q2.execute(delegateExecution);
		if(delegateExecution.getCurrentActivityId().equalsIgnoreCase("Activity_16hmg52"))
				q1.execute(delegateExecution);
			
	}
}
