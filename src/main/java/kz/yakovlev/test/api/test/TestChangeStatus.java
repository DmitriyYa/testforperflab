package kz.yakovlev.test.api.test;

import kz.yakovlev.test.api.action.ActionChangeStatus;
import kz.yakovlev.test.api.action.ActionCreateIssue;
import kz.yakovlev.test.api.helpers.GlobalProperties;
import kz.yakovlev.test.api.model.Expand;
import kz.yakovlev.test.api.model.Issue;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 20:02
 */
public class TestChangeStatus {

    @Test
    public void testChangeStatus() {
        ResponseEntity<Issue> responseEntity = ActionCreateIssue.createIssue();
        GlobalProperties.setIssueRequest(responseEntity.getBody());

        ResponseEntity<Expand> responseEntityToWork = ActionChangeStatus.actionChangeStatus(GlobalProperties.getIdStatusTowork());
        assertEquals(204, responseEntityToWork.getStatusCodeValue());

        ResponseEntity<Expand> responseEntityDone = ActionChangeStatus.actionChangeStatus(GlobalProperties.getIdStatusDone());
        assertEquals(204, responseEntityDone.getStatusCodeValue());
    }


}
