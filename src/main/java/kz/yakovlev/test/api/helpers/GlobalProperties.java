package kz.yakovlev.test.api.helpers;

import kz.yakovlev.test.api.model.Issue;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 21:31
 */
public class GlobalProperties {
    private static final String BASIC_URL = "https://testperflab.atlassian.net/rest/api/2/issue/";
    private static final String CREAMETA_URL = BASIC_URL + "createmeta";
    private static final String TRANSITIONS = "/transitions";
    private static final String ID_TO_DO = "11";
    private static final String ID_STATUS_TOWORK = "21";
    private static final String ID_STATUS_DONE = "31";
    private static Issue ISSUE_REQUEST;

    public static String getIdToDo() {
        return ID_TO_DO;
    }

    public static String getIdStatusTowork() {
        return ID_STATUS_TOWORK;
    }

    public static String getIdStatusDone() {
        return ID_STATUS_DONE;
    }
    public static Issue getIssueRequest() {
        return ISSUE_REQUEST;
    }

    public static void setIssueRequest(Issue issueRequest) {
        ISSUE_REQUEST = issueRequest;
    }

    public static String getBasicUrl() {
        return BASIC_URL;
    }

    public static String getCreametaUrl() {
        return CREAMETA_URL;
    }

    public static String getTransitions() {
        return TRANSITIONS;
    }
}
