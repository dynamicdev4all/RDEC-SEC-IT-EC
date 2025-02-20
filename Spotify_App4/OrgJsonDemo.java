import org.json.JSONArray;
import org.json.JSONObject;

public class OrgJsonDemo {
    public static void main(String[] args) {
        String data = """
                [{"trackID":"1234","artistName":"Arijit Singh","trackName":"Kesariya"},

                {"trackID":"2345","artistName":"Honey Singh","trackName":"High Heels"},

                {"trackID":"3456","artistName":"Mika Singh","trackName":"Khamosh"},

                {"trackID":"4567","artistName":"AR Rahman","trackName":"Jai Ho"},

                {"trackID":"5678","artistName":"Satendra Sartaj","trackName":"Akhir"},

                {"trackID":"6789","artistName":"Sonu Nigam","trackName":"Kal Ho"},]
                """;

                JSONObject
        JSONArray dataArray = new JSONArray(data);

        for (int i = 0; i < dataArray.length(); i++) {
            JSONObject songObject = dataArray.getJSONObject(i);
            System.out.println(songObject.getString("trackName"));
        }

        // System.out.println(dataArray.length());
    }
}
