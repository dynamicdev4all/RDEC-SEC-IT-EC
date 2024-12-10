import org.json.JSONArray;
import org.json.JSONObject;

public class Demo {
    public static void main(String[] args) {
        String data = """
                [{"name":"Kuldeep","age":"20"},
                {"name":"Aman","age":"19"},
                {"name":"Aadesh","age":"21"},
                {"name":"Siddharth","age":"21"},
                {"name":"Aryan","age":"20"}]
                """;

        JSONArray arr = new JSONArray(data);
        System.out.println(arr.length());
        for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            System.out.println(obj.getString("name"));
            System.out.println(obj.getString("age"));
        }
    }
}
