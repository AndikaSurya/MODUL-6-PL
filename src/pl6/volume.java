/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl6;

import static java.lang.Math.PI;

/**
 *
 * @author SISTEM
 */
public class volume {
    double vol(PL6 p){
        return(PI*p.getJariJari()*p.getJariJari()*p.getJariJari()*4/3);
    }
}
