package desingPatten.prototypepatten;

import java.util.ArrayList;
import java.util.List;

public class ProtoTypeMain {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        List<String> list=new ArrayList<>();
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIP(1);
        networkConnection.setIp_Name("Hapur");
        list.add("Data_1");
        list.add("Data_2");
        list.add("Data_3");
        networkConnection.setList(list);
        networkConnection.IpAddressExecute();


        NetworkConnection networkConnection1 = (NetworkConnection)networkConnection.clone();
        networkConnection1.setIP(2);
        networkConnection1.setIp_Name("Pilkhuwa");
        networkConnection1.getList().remove(0);
        networkConnection1.IpAddressExecute();

        NetworkConnection networkConnection2 = (NetworkConnection)networkConnection.clone();
        networkConnection2.setIP(2);
        networkConnection2.setIp_Name("Ghaziabad");
        networkConnection2.IpAddressExecute();

        NetworkConnection networkConnection3 = (NetworkConnection)networkConnection.clone();
        networkConnection3.setIP(4);
        networkConnection3.setIp_Name("Noida");
        networkConnection3.IpAddressExecute();



    }
}
