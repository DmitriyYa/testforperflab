package kz.yakovlev.test.api.action;

import com.google.gson.Gson;
import kz.yakovlev.test.api.helpers.GlobalProperties;
import kz.yakovlev.test.api.helpers.HttpHeaderMy;
import kz.yakovlev.test.api.model.Fields;
import kz.yakovlev.test.api.model.Issue;
import kz.yakovlev.test.api.model.Issuetype;
import kz.yakovlev.test.api.model.Project;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 19:55
 */
public class ActionCreateIssue {

    public static ResponseEntity<Issue> createIssue() {

        HttpHeaders headers = HttpHeaderMy.getHttpHeaders();
        RestTemplate restTemplate = new RestTemplate();

        //       создать задачу
        Gson gson = new Gson();
        Issue issue = new Issue(
                new Fields(
                        new Project("TPL"),
                        "REST created issue",
                        "Creating of an issue using project keys and issue type names using the REST API",
                        new Issuetype("10002")));

        String json = gson.toJson(issue);

        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(json, headers);
        ResponseEntity<Issue> responseEntity = restTemplate.exchange(GlobalProperties.getBasicUrl(), HttpMethod.POST, entity, Issue.class);

        return responseEntity;
    }
}
