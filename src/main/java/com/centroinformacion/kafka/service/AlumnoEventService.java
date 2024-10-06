package com.centroinformacion.kafka.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.centroinformacion.entity.Alumno;
import com.centroinformacion.kafka.config.Event;
import com.centroinformacion.kafka.config.EventType;
import com.centroinformacion.kafka.entity.AlumnoCreateEvent;

@Component
public class AlumnoEventService {

    @Autowired
    private KafkaTemplate<String, Event<?>> producer;

    @Value("${topic.alumno.name:topic-Alumno-GUTIERREZ-G3}")
    private String topic;

    public void publish(Alumno alumno) {  
        AlumnoCreateEvent event = new AlumnoCreateEvent();
        event.setId(UUID.randomUUID().toString());
        event.setDate(new Date());
        event.setType(EventType.CREATED);
        event.setData(alumno);

        this.producer.send(topic, event);
    }
}
