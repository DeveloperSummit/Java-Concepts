package desingPatten.observrdesignpateen;

public interface Subject {

    void suscribe(Observer observer);
    void unSubscribe(Observer observer);
    void  newVideoUploaded();

}
