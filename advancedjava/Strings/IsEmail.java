package Strings;

import java.util.HashSet;
import java.util.Set;

public class IsEmail {
    static public int uniqueEmails(String[] emails) {

        Set<String> uniqueEmails = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {

            StringBuilder local = new StringBuilder(emails[i].split("@")[0]);
            StringBuilder domain = new StringBuilder(emails[i].split("@")[1]);

            if (local.indexOf("+") != -1)
                local.delete(local.indexOf("+"), local.length());

            while (local.indexOf(".") != -1)
                local.deleteCharAt(local.indexOf("."));

            String email = local + "@" + domain;
            if (!uniqueEmails.contains(email))
                uniqueEmails.add(email);
        }

        return uniqueEmails.size();
    }

    public static void main(String[] args) {

        String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        System.out.println(uniqueEmails(emails));
    }
}