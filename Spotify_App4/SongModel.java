public class SongModel {
    String songName;
    String singerName;
    String songImageUrl;
    String songUrl;
    float songPrice;

    SongModel(String songName, String singerName, String songImageUrl, String songUrl, float songPrice) {
        this.songName = songName;
        this.singerName = singerName;
        this.songImageUrl = songImageUrl;
        this.songUrl = songUrl;
        this.songPrice = songPrice;
    }
}
