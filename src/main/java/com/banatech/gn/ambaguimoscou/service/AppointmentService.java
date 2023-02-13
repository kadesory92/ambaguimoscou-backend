package com.banatech.gn.ambaguimoscou.service;

import com.banatech.gn.ambaguimoscou.model.AppointmentDTO;

import java.util.List;

public interface AppointmentService {
    public List<AppointmentDTO> getAllAppointmentList();
    public void save(AppointmentDTO appointmentDTO);
    public AppointmentDTO findById(Integer id);
    public AppointmentDTO update(AppointmentDTO appointmentDTO);
    public void delete(AppointmentDTO appointmentDTO);
    public AppointmentDTO changeStatusAppointment(AppointmentDTO appointmentDTO);
}
