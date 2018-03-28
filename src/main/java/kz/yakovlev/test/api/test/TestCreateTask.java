package kz.yakovlev.test.api.test;


import kz.yakovlev.test.api.action.ActionCreateIssue;
import kz.yakovlev.test.api.helpers.GlobalProperties;
import kz.yakovlev.test.api.model.Issue;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class TestCreateTask {

    @Test
    public void createTask() {
        ResponseEntity<Issue> responseEntity = ActionCreateIssue.createIssue();
        GlobalProperties.setIssueRequest(responseEntity.getBody());
        assertEquals(201, responseEntity.getStatusCodeValue());
    }
}
