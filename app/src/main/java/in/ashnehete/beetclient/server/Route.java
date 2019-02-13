package in.ashnehete.beetclient.server;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import androidx.annotation.NonNull;

public class Route {
    @SerializedName("_id")
    String id;
    String name;
    List<Checkpoint> checkpoints;

    public Route(String id, String name, List<Checkpoint> checkpoints) {
        this.id = id;
        this.name = name;
        this.checkpoints = checkpoints;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }

    public void setCheckpoints(List<Checkpoint> checkpoints) {
        this.checkpoints = checkpoints;
    }

    @NonNull
    @Override
    public String toString() {
        String str = "Id: " + id + "\n" +
                "Name: " + name + "\n" +
                "Checkpoints:\n";
        for (Checkpoint checkpoint : checkpoints) {
            str += checkpoint.toString();
        }
        return str;
    }

    public class Checkpoint {
        int id;
        double latitude;
        double longitude;

        public Checkpoint(int id, double latitude, double longitude) {
            this.id = id;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        @NonNull
        @Override
        public String toString() {
            return "Id: " + id + "\n" +
                    "Latitude: " + latitude + "\n" +
                    "Longitude: " + longitude;
        }
    }
}