package br.daniel.programadores.controller;

import br.daniel.programadores.model.Programador;
import br.daniel.programadores.repository.ProgramadorRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@CrossOrigin //permite a comunicação cruzada entre backend e frontend
@RestController
@RequestMapping("/api")
public class ProgramadorController {

    @Autowired
    private ProgramadorRepository programadorRepository;

    @GetMapping("/programadores")
    public List<Programador> getAllProgramadores(){
        return programadorRepository.findAll();
    }

    @GetMapping(value = "/programadores/{id}")
    public ResponseEntity<Optional<Programador>> getProgramadorById(@PathVariable(value = "id") long id){
        Optional<Programador> programador = programadorRepository.findById(id);
        return ResponseEntity.ok().body(programador);
    }

    @PostMapping("/programadores")
    public Programador createProgramador(@RequestBody Programador programador){
        return programadorRepository.save(programador);
    }

    @DeleteMapping("/programadores/{id}")
    public Map<String, Boolean> deleteProgramador(@PathVariable(value = "id") Long id){
        Programador programador = programadorRepository.findById(id).orElse(new Programador());
        programadorRepository.delete(programador);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @PutMapping("/programadores/{id}")
    public ResponseEntity<Programador> updateProgramador(@PathVariable(value = "id") Long id, @RequestBody @NotNull Programador programadorNovo) {
        Programador programador = programadorRepository.findById(id).orElse(new Programador());
        programador.setIdade(programadorNovo.getIdade());
        programador.setNome(programadorNovo.getNome());
        programador.setSalario(programadorNovo.getSalario());
        final Programador updatedProgramador = programadorRepository.save(programador);
        return ResponseEntity.ok(updatedProgramador);
    }

}
