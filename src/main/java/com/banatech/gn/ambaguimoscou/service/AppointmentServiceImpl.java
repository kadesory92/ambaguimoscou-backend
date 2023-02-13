package com.banatech.gn.ambaguimoscou.service;

import com.banatech.gn.ambaguimoscou.domain.Appointment;
import com.banatech.gn.ambaguimoscou.model.AppointmentDTO;
import com.banatech.gn.ambaguimoscou.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppointmentServiceImpl implements AppointmentService{
    @Override
    public List<AppointmentDTO> getAllAppointmentList() {
        return null;
    }

    @Override
    public void save(AppointmentDTO appointmentDTO) {

    }

    @Override
    public AppointmentDTO findById(Integer id) {
        return null;
    }

    @Override
    public AppointmentDTO update(AppointmentDTO appointmentDTO) {
        return null;
    }

    @Override
    public void delete(AppointmentDTO appointmentDTO) {

    }

    @Override
    public AppointmentDTO changeStatusAppointment(AppointmentDTO appointmentDTO) {
        return null;
    }
}
