package Stepik.lesson_2_8.Sets;

import Stepik.lesson_2_8.Entities.Clients.Client;

import java.util.LinkedHashSet;

public class ClientsSet extends LinkedHashSet<Client> {

    public void addClient(Client client) {
        super.add(client);
    }

    public void removeClient(Client client) {
        super.remove(client);
    }

    public String getClientList() {
        StringBuilder str = new StringBuilder();
        int empNum = 1;
        if (super.size() == 0) return "";
        for (Client client : super.toArray(new Client[0])) {
            str.append(empNum++);
            str.append(". ");
            str.append(client.toStringShort());
            if (empNum<=super.size()) {
                str.append(";\n");
            } else {
                str.append(".");
            }
        }
        return str.toString();
    }

    public Client getClientByNumber(int number) throws Exception{
        if (number == 0 || number > super.size()) throw new Exception("No such book in the list");
        Client[] clients = super.toArray(new Client[0]);
        return clients[number - 1];
    }
}