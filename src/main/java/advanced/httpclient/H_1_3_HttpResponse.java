package advanced.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.message.BasicHttpResponse;

/**
 * Created by MaMingJiang on 2016/5/20.
 */
public class H_1_3_HttpResponse {
    public static void main(String[] args) {
        HttpResponse httpResponse1 = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK,"ok");
        System.out.println("协议版本1：" + httpResponse1.getStatusLine().getProtocolVersion());
        System.out.println("状态码1：" + httpResponse1.getStatusLine().getStatusCode());
        System.out.println("reasonPhrase1:" + httpResponse1.getStatusLine().getReasonPhrase());
    }
}
