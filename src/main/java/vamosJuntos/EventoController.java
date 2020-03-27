package vamosJuntos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class EventoController {
    @Autowired
    EventoRepository eventoRepository;

    @GetMapping("/vamosJuntos/evento/{id}")
    public ResponseEntity<Evento> getCoche(@PathVariable long id){
        Optional<Evento> cocheOptional=eventoRepository.findById(id);
        if(cocheOptional.isPresent()){
            Evento coche=cocheOptional.get();
            return new ResponseEntity<Evento>(coche, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/vamosJuntos/evento")
    public Iterable<Evento> getEventos(){
        return eventoRepository.findAll();
    }


    @PostMapping("/vamosJuntos/evento")
    public ResponseEntity<Evento> addCoche(@RequestBody Evento evento){
        if(evento!=null){
            eventoRepository.save(evento);
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
