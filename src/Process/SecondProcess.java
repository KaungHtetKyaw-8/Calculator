/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import DataModel.Cal;

/**
 *
 * @author KHK
 */
public abstract class SecondProcess implements ProcessBase {

    protected Cal P;
    protected int FIndex, SIndex;

    @Override
    public void reStart() {
        this.FIndex = 0;
        this.SIndex = 0;
        setValue("0.0");
    }

    @Override
    public void setProcess(Cal P) {
        this.P = P;
    }

    @Override
    public void setValue(String Value) {
        this.P.setValue(Float.valueOf(Value));
    }

    @Override
    public void setFIndex(int FIndex) {
        this.FIndex = FIndex;
    }

    @Override
    public void setSIndex(int SIndex) {
        this.SIndex = SIndex;
    }
}
