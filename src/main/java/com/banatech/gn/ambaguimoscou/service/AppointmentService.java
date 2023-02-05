package com.banatech.gn.ambaguimoscou.service;

import com.banatech.gn.ambaguimoscou.domain.Appointment;

public interface AppointmentService {
    Appointment saveAppointment(Appointment appointment);
    void removeAppointment(Appointment appointment);
}
