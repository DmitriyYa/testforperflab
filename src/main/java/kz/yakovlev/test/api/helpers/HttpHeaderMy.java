package kz.yakovlev.test.api.helpers;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 19:36
 */
public class HttpHeaderMy {


    public static HttpHeaders getHttpHeaders() {
        String userPassword = "admin:!Q2w3e4r";
        byte[] plainCredsBytes = userPassword.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + base64Creds);
        headers.setContentType(MediaType.APPLICATION_JSON);

        return headers;
    }

}
