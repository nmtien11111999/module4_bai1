package vn.codegym.qlclient.controllers;

import vn.codegym.qlclient.entitys.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import vn.codegym.qlclient.services.ClientService;

@Controller
@RequestMapping("/admin")
public class ClientController {

    @Autowired
    private ClientService clientService;

    public ClientController() {
    }

    @GetMapping("/home")
    public String getAllClient(ModelMap modelMap) {
        modelMap.addAttribute("clients", clientService.findAll());
        return "home";
    }

    @GetMapping("/client/{id}")
    public String getClientById(@PathVariable long id, ModelMap modelMap) {
        Client client = clientService.findById(id);
        if (client == null) {
            modelMap.addAttribute("message", "not found client");
            return "redirect:/admin/home";
        } else {
            modelMap.addAttribute("client", client);
            return "clientDetails";
        }
    }

    @GetMapping("/create")
    public String showFormCreate(ModelMap modelMap) {
        modelMap.addAttribute("client", new Client());
        return "create";
    }

    @PostMapping("/create")
    public String createClient(@ModelAttribute Client client) {
        clientService.save(client);
        return "redirect:/admin/home";
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable long id, ModelMap modelMap) {
        Client client = clientService.findById(id);
        if (client == null) {
            modelMap.addAttribute("message", "not found client");
            return "redirect:/admin/home";
        } else {
            modelMap.addAttribute("client", client);
            return "edit";
        }
    }

    @PostMapping("/edit/{id}")
    public String editClient(@PathVariable long id, @ModelAttribute Client client) {
        clientService.edit(id, client);
        return "redirect:/admin/home";
    }

    @PostMapping("/delete/{id}")
    public String deleteClient(@PathVariable long id) {
        clientService.delete(id);
        return "redirect:/admin/home";
    }
}
