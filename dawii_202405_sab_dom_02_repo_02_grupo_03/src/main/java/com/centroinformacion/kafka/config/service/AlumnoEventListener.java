package com.centroinformacion.kafka.config.service;

import java.text.SimpleDateFormat;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.centroinformacion.entity.Alumno;
import com.centroinformacion.kafka.entity.AlumnoCreateEvent;

@Component
public class AlumnoEventListener {

    @KafkaListener(topics = "${topic.customer.name:topic-Alumno-GUTIERREZ-G3}",
                   containerFactory = "kafkaListenerContainerFactory",
                   groupId = "escuchador-alumno")
    public void consumer(AlumnoCreateEvent event) {
        System.out.println("1 Evento recibido: " + event);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        System.out.println("2 Evento Alumno " + event);
        
        String id = event.getId();
        String fecha = sdf.format(event.getDate());
        String tipo = event.getType().toString();
        Alumno objAlumno = event.getData();
        
        String nombres = objAlumno.getNombres();
        String apellidos = objAlumno.getApellidos();
        String telefono = objAlumno.getTelefono();
        String dni = objAlumno.getDni();
        String correo = objAlumno.getCorreo();
        String celular = objAlumno.getCelular();
        String tipoSangre = objAlumno.getTipoSangre();
        String fechaNacimiento = sdf.format(objAlumno.getFechaNacimiento());
        String fechaRegistro = sdf.format(objAlumno.getFechaRegistro());
        String fechaActualizacion = sdf.format(objAlumno.getFechaActualizacion());
        int estado = objAlumno.getEstado();
      

        System.out.println("3 ID: " + id);
        System.out.println("4 Fecha: " + fecha);
        System.out.println("5 Tipo: " + tipo);
        System.out.println("6 Nombres: " + nombres);
        System.out.println("7 Apellidos: " + apellidos);
        System.out.println("8 Teléfono: " + telefono);
        System.out.println("9 DNI: " + dni);
        System.out.println("10 Correo: " + correo);
        System.out.println("11 Celular: " + celular);
        System.out.println("12 Tipo de Sangre: " + tipoSangre);
        System.out.println("13 Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("14 Fecha de Registro: " + fechaRegistro);
        System.out.println("15 Fecha de Actualización: " + fechaActualizacion);
        System.out.println("16 Estado: " + estado);
     
    }
}
