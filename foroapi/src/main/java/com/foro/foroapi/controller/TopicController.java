package com.foro.foroapi.controller;

import com.foro.foroapi.model.Topic;
import com.foro.foroapi.service.TopicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {

    private final TopicService service;

    public TopicController(TopicService service) {
        this.service = service;
    }

    @PostMapping
    public Topic crear(@RequestBody Topic topic){
        return service.crear(topic);
    }

    @GetMapping
    public List<Topic> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Topic obtener(@PathVariable Long id){
        return service.obtener(id);
    }

    @PutMapping("/{id}")
    public Topic actualizar(@PathVariable Long id, @RequestBody Topic topic){
        return service.actualizar(id, topic);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }
}