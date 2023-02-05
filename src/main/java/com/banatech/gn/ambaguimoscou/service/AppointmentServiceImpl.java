package com.banatech.gn.ambaguimoscou.service;

import com.banatech.gn.ambaguimoscou.domain.Appointment;
import com.banatech.gn.ambaguimoscou.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentServiceImpl implements AppointmentService{
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Override
    public Appointment saveAppointment(Appointment appointment) {
         appointment=appointmentRepository.save(appointment);
        return appointment;
    }

    @Override
    public void removeAppointment(Appointment appointment) {

    }
}
