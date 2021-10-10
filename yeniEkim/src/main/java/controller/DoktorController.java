package controller;

import entity.Doktor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.DoktorRepository;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doktorlar")
public class DoktorController {
    @Autowired
    DoktorRepository service;
    @GetMapping("/allDoktor")
    public List<Doktor> getAllDoktor()
    {
        return service.findAll();
    }
    @GetMapping("/{Id}")
    public Optional<Doktor> getDoktorById(@PathVariable("Id") Long Id)
    {
        return service.findById(Id);
    }
    @PostMapping("/saveDoktor")
    public void saveDoktor(@RequestBody Doktor d)
    {
        service.save(d);
    }
    @DeleteMapping("/deleteDoktor")
    public void deleteDoktorById(@PathVariable ("Id") Long Id)
    {
        service.deleteById(Id);
    }

}
