package com.application.equipment;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EquipmentEmbeddable {

	
    @Column(name= "equipmentName")
    private String equipmentName;


    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

}
