/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

/**
 *
 * @author KHK
 */
public class TemperatureCalculate extends Cal{

    public TemperatureCalculate() {
        super();
    }
    
    public float CtoF() {
        return (float) (((9.0 / 5.0) * V) + 32.0);
    }

    public float CtoK() {
        return (float) (V + 273.15);
    }

    public float FtoC() {
        return (float) (5.0 / 9.0 * (V - 32.0));
    }

    public float FtoK() {
        return (float) (5.0 / 9.0 * (V + 459.67));
    }

    public float KtoC() {
        return (float) (V - 273.15);
    }

    public float KtoF() {
        return (float) (((9.0 / 5.0) * V) - 459.67);
    }

}
