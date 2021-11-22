package com.camunda.clovity.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import javax.inject.Named;

@Named
public class QuizGame implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String river = "";
        String response = "";
        river = (String) delegateExecution.getVariable("river");
       

        if (river.equalsIgnoreCase("Nile")) {
        	response = "Correct Answer.";
        } else {
        	response = "Wrong Answer.";
        }

        delegateExecution.setVariable("Qes_2_Result", response);
    }
}

