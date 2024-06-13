package vn.codegym.qlclient.services;

import vn.codegym.qlclient.entitys.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClientService implements HandleClientService {

    private final List<Client> clients = new ArrayList<>();

    @Override
    public List<Client> findAll() {
        return clients;
    }

    @Override
    public Client findById(long id) {
        return clients.stream().filter(client -> client.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void save(Client client) {
        clients.add(client);
    }

    @Override
    public void delete(long id) {
        clients.removeIf(client -> client.getId() == id);
    }

    @Override
    public void edit(long id, Client clientnew) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                clientnew.setId(id);
                clients.set(i, clientnew);
                return;
            }
        }
    }
}
