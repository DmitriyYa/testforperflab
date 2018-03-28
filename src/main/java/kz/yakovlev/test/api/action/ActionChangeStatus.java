package kz.yakovlev.test.api.action;

import com.google.gson.Gson;
import kz.yakovlev.test.api.helpers.GlobalProperties;
import kz.yakovlev.test.api.helpers.HttpHeaderMy;
import kz.yakovlev.test.api.model.Expand;
import kz.yakovlev.test.api.model.Transition;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 21:40
 */
public class ActionChangeStatus {

    public static ResponseEntity<Expand> actionChangeStatus(String idStatus) {

        HttpHeaders headers = HttpHeaderMy.getHttpHeaders();
        RestTemplate restTemplate = new RestTemplate();

//        // Для изменения статуса нужно получить доступные переходы issue через запрос:
//        //GET http://jiraserver:9080/rest/api/2/issue/TP-6/transitions
//
//        HttpEntity<String> request = new HttpEntity<String>(headers);
//        ResponseEntity<Expand> response = restTemplate.exchange(GlobalProperties.getBasicUrl() + GlobalProperties.getIssueRequest().getKey() + GlobalProperties.getTransitions(), HttpMethod.GET, request, Expand.class);
//        Expand expand = response.getBody();
//        int id = Integer.parseInt(expand.getTransitions().get(0).getId());

//        Для изменения статуса надо выполнить запрос(обращу внимание, запрос post! это не обновлении статуса, а добавление перехода):
//        POST http://jiraserver:9080/rest/api/2/issue/TP-6/transitions
        Gson gson = new Gson();
        String json = gson.toJson(
                new Expand(
                        new Transition(idStatus)));
        HttpEntity<String> entity = new HttpEntity<>(json, headers);
        ResponseEntity<Expand> responseEntity = restTemplate.exchange(GlobalProperties.getBasicUrl() + GlobalProperties.getIssueRequest().getKey() + GlobalProperties.getTransitions(), HttpMethod.POST, entity, Expand.class);

        return responseEntity;

    }
}
