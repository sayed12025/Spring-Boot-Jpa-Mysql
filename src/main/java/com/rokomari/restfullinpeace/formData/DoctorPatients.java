package com.rokomari.restfullinpeace.formData;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sayed on 7/14/2017.
 */
public class DoctorPatients  implements Serializable {
    private Integer doctorId;
    private List<Integer> patientIds;

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public List<Integer> getPatientIds() {
        return patientIds;
    }

    public void setPatientIds(List<Integer> patientIds) {
        this.patientIds = patientIds;
    }
}
