package web;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import main.TrustpetPersistentManager;
import org.json.JSONArray;
import org.orm.PersistentSession;

public class Util {
    public static String hash(String original) {
        String res = original;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(original.getBytes("UTF-8")); // Change this to "UTF-16" if needed
            byte[] digest = md.digest();
            res = String.format("%064x", new java.math.BigInteger(1, digest));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public static PersistentSession getSession(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        PersistentSession session = null;
        try {
            Object hsession = httpSession.getAttribute("hsession");
            if(hsession!=null) {
                System.out.println("Reusing persistent session");
                session = (PersistentSession) hsession;
            } else {
                System.out.println("Creating new persistent session");
                session = TrustpetPersistentManager.instance().getSession();
                request.getSession().setAttribute("hsession", session);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return session;
    }

    public static Map<String,String> parseBody (BufferedReader reader) {
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            while ((line = reader.readLine()) != null)
                jb.append(line);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<String,String> parametersMap = new HashMap<>();
        String[] parameters = jb.toString().split("&");
        for (String p : parameters) {
            String key = p.split("=")[0];
            if(p.split("=").length==1) {
                parametersMap.put(key,"");
            }
            else {
                parametersMap.put(key,java.net.URLDecoder.decode(p.split("=")[1], StandardCharsets.UTF_8));
            }
        }
        return parametersMap;
    }

    public static Date parseDate (String dateString, String pattern) {
        Date date = null;
        try {
            date=new SimpleDateFormat(pattern).parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}