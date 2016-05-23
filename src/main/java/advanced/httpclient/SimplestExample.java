package advanced.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpResponse;

import java.net.URI;

/**
 * Created by MaMingJiang on 2016/5/19.
 */
public class SimplestExample {
    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //方法1 ： 传url字符串给HttpGet构造器
        HttpGet httpGet = new HttpGet("http://www.baidu.com");
        //方法2 ： 传URI给HttpGet构造器
//        URI uri = new URIBuilder()
//                .setScheme("http")
//                .setHost("www.baidu.com")
//                .setPath("/page")
//                .setParameter("q","123")
//                .setParameter("w","22").build();
//        HttpGet get = new HttpGet(uri);
        try{
            HttpResponse httpResponse = httpClient.execute(httpGet);
            System.out.println("协议版本：" + httpResponse.getStatusLine().getProtocolVersion());
            System.out.println("状态码：" + httpResponse.getStatusLine().getStatusCode());
            System.out.println("reasonPhrase:" + httpResponse.getStatusLine().getReasonPhrase());
            HttpResponse httpResponse1 = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK,"ok");
            System.out.println("协议版本1：" + httpResponse1.getStatusLine().getProtocolVersion());
            System.out.println("状态码1：" + httpResponse1.getStatusLine().getStatusCode());
            System.out.println("reasonPhrase1:" + httpResponse1.getStatusLine().getReasonPhrase());

        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }finally{
            System.out.println();
        }
    }
}
