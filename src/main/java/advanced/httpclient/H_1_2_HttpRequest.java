package advanced.httpclient;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by MaMingJiang on 2016/5/20.
 */
public class H_1_2_HttpRequest {
    public static void main(String[] args) throws URISyntaxException {
//        HttpGet httpGet = new HttpGet("http://www.baidu.com");

        URI uri = new URIBuilder().setScheme("http")
                .setHost("www.baidu.com")
                .setPath("/service")
                .setParameter("name","brian")
                .build();
        HttpGet httpGet = new HttpGet(uri);
//        http://www.baidu.com/service?name=brian
        System.out.println(httpGet.getURI());
    }
}
