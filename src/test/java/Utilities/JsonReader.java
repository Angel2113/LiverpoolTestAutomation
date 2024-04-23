package Utilities;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JsonReader {

    public static Object[][] getJsonData(String fileName, String testName) throws IOException, ParseException {
        Object[][] data = null;
        System.out.println(fileName);
        FileReader fr = new FileReader((System.getProperty("user.dir") + "/src/test/resources/" + fileName + ".json"));
        JSONParser jsonParser = new JSONParser();
        JSONObject json = (JSONObject) jsonParser.parse(fr);
        JSONArray jsonArray = (JSONArray) json.get(testName);
        data = new Object[1][1];
        HashMap<String, String> map = null;

        for(int i=0; i < jsonArray.size(); i++) {
            JSONObject jsondata = (JSONObject) jsonArray.get(i);
            Set<String> keys = jsondata.keySet();
            Iterator<String> it = keys.iterator();
            map = new HashMap<String, String>();
            while(it.hasNext()) {
                String key = it.next();
                String value = jsondata.get(key).toString();
                map.put(key, value);
            }
            data[i][0] = map;
        }
        return data;
    }

}
