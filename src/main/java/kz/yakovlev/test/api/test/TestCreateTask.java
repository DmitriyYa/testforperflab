package kz.yakovlev.test.api.test;


import kz.yakovlev.test.api.model.Example;
import kz.yakovlev.test.api.model.Issuetype;
import kz.yakovlev.test.api.model.Project;
import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.List;


public class TestCreateTask {

    @Test
    public void createTask() {
        String basicURL="https://testperflab.atlassian.net/rest/api/2/issue/";
        String creametaURL = basicURL+"createmeta";

        String userPassword = "admin:!Q2w3e4r";
        byte[] plainCredsBytes = userPassword.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + base64Creds);
        HttpEntity<String> request = new HttpEntity<String>(headers);


        RestTemplate restTemplate = new RestTemplate();

        // получить проекты
        ResponseEntity<Example> response = restTemplate.exchange(creametaURL, HttpMethod.GET, request, Example.class);
        Example example = response.getBody();



//----------

        List<Issuetype> linkedList=null;

        List<Project> projectList = example.getProjects();
        for (Project p:projectList){
            if (p.getKey().equals("TPL")){
                System.out.println(p.getKey());
                System.out.println(p.getId());
                System.out.println(p.getName());

                linkedList=p.getIssuetypes();
            }
        }

        for(Issuetype i:linkedList){
            System.out.println("issue id -"+ i.getId());
            System.out.println("issue key -"+ i.getSelf());
        }
    }
}
