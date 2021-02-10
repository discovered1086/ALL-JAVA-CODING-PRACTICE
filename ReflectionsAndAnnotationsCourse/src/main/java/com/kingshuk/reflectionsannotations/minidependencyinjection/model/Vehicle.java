package com.kingshuk.reflectionsannotations.minidependencyinjection.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Vehicle {

    private int id;

    private String vin;

    private String program;

    private String team;

    private String build;

    private String auth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return (this.id == vehicle.getId()) || new EqualsBuilder()
                .append(this.vin, vehicle.getVin())
                .append(this.program, vehicle.getProgram())
                .append(this.team, vehicle.getTeam())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.vin)
                .append(this.program)
                .append(this.team)
                .toHashCode();
    }
}
