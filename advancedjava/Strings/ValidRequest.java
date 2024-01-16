package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidRequest {

    static private boolean isValidToken(List<String> tokens, String token) {
        return tokens.contains(token);
    }

    static public List<String> getResponses(List<String> validTokens, List<List<String>> requests) {
        List<String> result = new ArrayList<String>();
        for (List<String> request : requests) {
            if (!request.get(1).contains("token=")
                    || (request.get(0).equals("POST") && !request.get(1).contains("csrf"))) {
                result.add("INVALID");
                continue;
            }
            String token = request.get(1).split("token=")[1].split("&")[0];
            if (isValidToken(validTokens, token)) {
                String name = request.get(1).split("&name=")[1];
                String id = request.get(1).split("id=")[1].split("&")[0];
                if (request.get(0).equals("POST")) {
                    String csrf = request.get(1).split("id=")[1].split("&")[0];
                    result.add(
                            new String(String.format("VALID,id,%s,token,%s,name,%s,csrf,%s", id, token, name, csrf)));
                } else
                    result.add(new String(String.format("VALID,id,%s,token,%s,name,%s", id, token, name)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String request1 = "http://example.com/api/data?token=token9&id=123&name=alex";
        String request2 = "http://example.com/api/data?token=token2&id=123&csrf=asdf&name=alex";
        String request3 = "http://example.com/api/data?id=456 ";
        List<String> validTokens = Arrays.asList("token1", "token2");
        List<List<String>> requests = Arrays.asList(
                Arrays.asList("POST", request1),
                Arrays.asList("POST", request2),
                Arrays.asList("GET", request3));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 2);
        getResponses(validTokens, requests).forEach((i) -> System.out.println(i));
    }
}
