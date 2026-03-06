package com.foro.foroapi.service;

import com.foro.foroapi.model.Topic;
import com.foro.foroapi.repository.TopicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    private final TopicRepository repository;

    public TopicService(TopicRepository repository) {
        this.repository = repository;
    }

    public Topic crear(Topic topic){
        return repository.save(topic);
    }

    public List<Topic> listar(){
        return repository.findAll();
    }

    public Topic obtener(Long id){
        return repository.findById(id).orElse(null);
    }

    public Topic actualizar(Long id, Topic topic){
        Topic t = repository.findById(id).orElse(null);

        if(t != null){
            t.setTitulo(topic.getTitulo());
            t.setMensaje(topic.getMensaje());
            t.setAutor(topic.getAutor());
            t.setCurso(topic.getCurso());
            return repository.save(t);
        }

        return null;
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}