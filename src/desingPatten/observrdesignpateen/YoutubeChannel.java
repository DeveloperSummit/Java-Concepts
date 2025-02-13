package desingPatten.observrdesignpateen;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {


    List<Observer> list=new ArrayList<>();

    @Override
    public void suscribe(Observer observer) {
        list.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void newVideoUploaded() {

        for (Observer observer:list)
        {
            observer.notifyUser();
        }
    }
}
