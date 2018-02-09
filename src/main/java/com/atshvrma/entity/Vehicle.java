package com.atshvrma.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) //Least normalisation strategy
//@DiscriminatorColumn(name="Disc")
public class Vehicle 
{
		 @Id
		 @GeneratedValue(strategy=GenerationType.AUTO)
		 @Column(name="VEHICLE_ID")
		 private int vehicleId;
		 
		 @Column(name="VEHICLE_NAME")
		 private String vehicleName;
		 
		 public int getVehicleId() {
		  return vehicleId;
		 }
		 public void setVehicleId(int vehicleId) {
		  this.vehicleId = vehicleId;
		 }
		 public String getVehicleName() {
		  return vehicleName;
		 }
		 public void setVehicleName(String vehicleName) {
		  this.vehicleName = vehicleName;
		 }
}