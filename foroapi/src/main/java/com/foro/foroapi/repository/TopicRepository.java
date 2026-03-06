package com.foro.foroapi.repository;

import com.foro.foroapi.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}