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
public abstract class Cal implements DataCalBase{
    
    protected float V;

    public Cal() {
        this.V = (float) 0.0;
    }

        @Override
    public void setValue(float V) {
        this.V = V;
    }

        @Override
    public float getValue() {
        return V;
    }
}
