package desingPatten.observrdesignpateen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoMain {

    public static void main(String[] args) {

        SuscriberName ravi=new SuscriberName("Ravi","Java Video");
        SuscriberName anuj=new SuscriberName("Anuj","Java Video");
        SuscriberName kuldeep=new SuscriberName("Kuldeep","Java Video");
        SuscriberName sandeep=new SuscriberName("Sandeep","Java Video");
        SuscriberName aayushi=new SuscriberName("Aayushi","Java Video");

        YoutubeChannel youtubeChannel=new YoutubeChannel();
        youtubeChannel.suscribe(ravi);
        youtubeChannel.suscribe(anuj);
        youtubeChannel.suscribe(kuldeep);
        youtubeChannel.suscribe(sandeep);
        youtubeChannel.suscribe(aayushi);
        youtubeChannel.unSubscribe(anuj);

        youtubeChannel.newVideoUploaded();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {

        }

    }
}
