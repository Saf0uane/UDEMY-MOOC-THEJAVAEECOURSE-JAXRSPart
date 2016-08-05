package com.airline.controllers;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.models.Airplane;
import com.airline.models.Flight;
import com.airline.models.FlightDestinations;

/**
 * Servlet implementation class AddFlight
 */
@WebServlet( "/AddFlight" )
public class AddFlight extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
            IOException {

        Flight f = new Flight();
        f.setFlightOrigin( FlightDestinations.Meknes );
        f.setFlightDestination( FlightDestinations.Dakhla );
        f.setPrice( 200 );

        Calendar cal = Calendar.getInstance();
        cal.set( Calendar.YEAR, 2016 );
        cal.set( Calendar.MONTH, 07 );
        cal.set( Calendar.DAY_OF_MONTH, 29 );
        cal.set( Calendar.HOUR_OF_DAY, 20 );
        cal.set( Calendar.MINUTE, 0 );

        Date flightTime = cal.getTime();

        System.out.println( flightTime );

        f.setFlightTime( flightTime );

        Airplane a = new Airplane();

        a.setModelName( "798" );
        a.setPlaneMake( "Boeing" );
        a.setSeatingCapacity( 100 );

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
            IOException {
        // TODO Auto-generated method stub
    }

}
