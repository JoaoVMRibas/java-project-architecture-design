package br.com.myproject.store.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaURLAdapter implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL url1 = new URL(url);
            URLConnection connection = url1.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Error sending http request", e);
        }
    }
}
