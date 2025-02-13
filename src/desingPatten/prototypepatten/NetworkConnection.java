package desingPatten.prototypepatten;

import Java8Function.DateTimeAPIClasses.NewDateTimeAPI;

import javax.versionx.java8v.A;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;

public class NetworkConnection implements  Cloneable {

    private Integer IP;
    private String Ip_Name;
    private List<String> list=new ArrayList<>();


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "IP=" + IP +
                ", Ip_Name='" + Ip_Name + '\'' +
                ", list=" + list +
                '}';
    }

    public Integer getIP() {
        return IP;
    }

    public void setIP(Integer IP) {
        this.IP = IP;
    }

    public String getIp_Name() {
        return Ip_Name;
    }

    public void setIp_Name(String ip_Name) {
        Ip_Name = ip_Name;
    }

    public  void IpAddressExecute() throws InterruptedException {
        System.out.println(this.Ip_Name+"=> "+this.IP+"=> "+"Execute !"+" \n "+list);
        Thread.sleep(2000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIP(this.getIP());
        networkConnection.setIp_Name(this.getIp_Name());

        for (String s: this.getList())
        {
            networkConnection.getList().add(s);
        }


        return networkConnection;
    }
}
