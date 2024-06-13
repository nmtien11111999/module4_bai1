package vn.codegym.qlclient.services;

import vn.codegym.qlclient.entitys.Client;

import java.util.List;

public interface HandleClientService {
    List<Client> findAll();
    Client findById(long id);
    void save(Client client);
    void delete(long id);
    void edit(long id , Client client);
}
