package com.airline.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Flight
 * 
 */
@Entity
public class Flight implements Serializable {

    private static final long serialVersionUID = 1L;

    public Flight() {
        super();
    }

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer            id;

    @Enumerated( EnumType.STRING )
    private FlightDestinations flightOrigin;

    @Enumerated( EnumType.STRING )
    private FlightDestinations flightDestination;

    private Integer            price;

    @Temporal( TemporalType.TIMESTAMP )
    private Date               flightTime;

    @OneToOne
    @JoinColumn( name = "airplane_fk" )
    private Airplane           airplaneDetail;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public FlightDestinations getFlightOrigin() {
        return flightOrigin;
    }

    public void setFlightOrigin( FlightDestinations flightOrigin ) {
        this.flightOrigin = flightOrigin;
    }

    public FlightDestinations getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination( FlightDestinations flightDestination ) {
        this.flightDestination = flightDestination;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice( Integer price ) {
        this.price = price;
    }

    public Date getFlightTime() {
        return flightTime;
    }

    public void setFlightTime( Date flightTime ) {
        this.flightTime = flightTime;
    }

    public Airplane getAirplaneDetail() {
        return airplaneDetail;
    }

    public void setAirplaneDetail( Airplane airplaneDetail ) {
        this.airplaneDetail = airplaneDetail;
    }

    @Override
    public String toString() {
        return "Flight [id=" + id + ", flightOrigin=" + flightOrigin + ", flightDestination=" + flightDestination
                + ", price=" + price + ", flightTime=" + flightTime + "]";
    }

}
