package com.camunda.clovity.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import javax.inject.Named;

@Named
public class QuizGame2 implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String capital = "";
        String response = "";
        capital = (String) delegateExecution.getVariable("capital");
       

        if (capital.equalsIgnoreCase("Delhi")) {
        	response = "Correct Answer.";
        } else {
        	response = "Wrong Answer.";
        }

        delegateExecution.setVariable("Qes_1_Result", response);
    }
}

