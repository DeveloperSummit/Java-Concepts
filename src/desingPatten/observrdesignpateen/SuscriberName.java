package desingPatten.observrdesignpateen;

public class SuscriberName implements Observer {


    private String name;
    private String videoTitle;


    public SuscriberName(String name, String videoTitle) {
        this.name = name;
        this.videoTitle = videoTitle;
    }

    @Override
    public void notifyUser() {
        System.out.println(this.name+" - "+"New "+videoTitle+"- "+"Good content");
    }
}
