package vamosJuntos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CocheController {
    @Autowired
    CocheRepository cocheRepository;

    @GetMapping("/vamosJuntos/coche/{id}")
    public ResponseEntity<Coche> getCoche(@PathVariable long id){
        Optional<Coche>cocheOptional=cocheRepository.findById(id);
        if(cocheOptional.isPresent()){
            Coche coche=cocheOptional.get();
            return new ResponseEntity<Coche>(coche, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/vamosJuntos/coche")
    public Iterable<Coche> getEventos(){
        return cocheRepository.findAll();
    }

    @PostMapping("/vamosJuntos/coche")
    public ResponseEntity<Coche> addCoche(@RequestBody Coche coche){
        if(coche!=null){
            cocheRepository.save(coche);
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
