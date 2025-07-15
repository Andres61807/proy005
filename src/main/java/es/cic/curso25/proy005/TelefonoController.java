package es.cic.curso25.proy005;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {

    @Autowired
    private static TelefonoService telefonoService;

    @PostMapping("/{telefono}")
    public long create(@RequestBody Telefono telofono){
        return telefonoService.create(telofono);
    }

    @GetMapping("/listado")
    public List<Telefono> get(){
        List<Telefono> result=new ArrayList<>();
        Telefono tel1=new Telefono(0,"Paco","555",1);
        Telefono tel2=new Telefono(2,"Paco2","5552",1);
        Telefono tel3=new Telefono(3,"Paco3","5553",1);
        result.add(tel1);
        result.add(tel2);
        result.add(tel3);
        return result;
    }
    
    @GetMapping("/listado/{id}")
    public Telefono get(@PathVariable long id){
        Telefono tel1=new Telefono(0,"Paco","555",1);
        return tel1;
    }

    @PutMapping
    public void update(@RequestBody Telefono telefono){
        
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){

    }
}
