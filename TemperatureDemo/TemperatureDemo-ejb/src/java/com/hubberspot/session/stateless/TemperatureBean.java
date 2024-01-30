/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubberspot.session.stateless;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Tinip
 */
@Stateless
@LocalBean
public class TemperatureBean {

    public double fToC(int F){
        double C = (5/9.0) * (F-32);
        return C;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
