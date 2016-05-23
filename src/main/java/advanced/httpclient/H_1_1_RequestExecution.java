package advanced.httpclient;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Created by MaMingJiang on 2016/5/20.
 */
public class H_1_1_RequestExecution {
    public static void main(String[] args) throws Exception{
    /* CloseableHttpClient 执行execute方法后的返回对象是CloseableHttpResponse对象 */
    CloseableHttpClient httpClient = HttpClients.createDefault();
    String target = "http://www.baidu.com";
    HttpGet httpGet = new HttpGet(target);
    CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
    System.out.println(httpResponse.getStatusLine());
    httpResponse.close();
    }
}
