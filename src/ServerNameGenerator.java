import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    String[] adjective = {
            "tall", "big", "strong", "cool", "hungry",
            "evil", "happy", "sad", "sexy", "boring"
    };

    String[] noun = {
            "boy", "dog", "blue", "cup", "orange",
            "sky", "plane", "building", "god", "boot"
    };

    String[] server(String[] adjective, String[] noun){
        Random rand = new Random();
        String[] serverName =  {adjective[(rand.nextInt(9) + 1)], noun[(rand.nextInt(9) + 1)]};

        return serverName;
    }
    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
        String[] serName = (sng.server(sng.adjective, sng.noun));

        String adjective = serName[0];
        String noun = serName[1];

//        System.out.println(Arrays.toString(sng.server(sng.adjective, sng.noun)));
        System.out.printf("Here is your server name:\n%s-%s", adjective, noun);
    }
}
