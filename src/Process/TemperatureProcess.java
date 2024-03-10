/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import DataModel.TemperatureCalculate;

/**
 *
 * @author KHK
 */
public class TemperatureProcess extends SecondProcess{
    TemperatureCalculate TP = new TemperatureCalculate();
    public TemperatureProcess() {
        this.setProcess(TP);
    }
    
    @Override
    public String Calculate() {
        String res = "";
        System.out.println("Value exists : " + this.P.getValue());
        System.out.println("FirstIndex : "+FIndex+"\n"+"SecondIndex : "+SIndex);
        switch (FIndex) {
            case 0: res = Fto();break;
            case 1: res = Cto(); break;
            case 2: res = Kto(); break;
            default: break;
        }
        System.out.println("Result : "+res+"\n==============");
        return res;
    }

    private String Fto() {
        String st = "";
        switch(SIndex){
            case 0 : st = String.valueOf(this.P.getValue()); System.out.println("FtoF"); break;
            case 1 : st = String.valueOf((this.TP).FtoC()); System.out.println("FtoC"); break;
            case 2 : st = String.valueOf((this.TP).FtoK()); System.out.println("FotK"); break;
        }
        return st;
    }

    private String Cto() {
        String st = "";
        switch(SIndex){
            case 0 : st = String.valueOf(this.TP.CtoF()); System.out.println("CtoF"); break;
            case 1 : st = String.valueOf(this.P.getValue()); System.out.println("CtoC"); break;
            case 2 : st = String.valueOf(this.TP.CtoK()); System.out.println("CtoK"); break;
        }
        return st;
    }

    private String Kto() {
        String st = "";
        switch(SIndex){
            case 0 : st = String.valueOf(this.TP.KtoF()); System.out.println("KtoF"); break; 
            case 1 : st = String.valueOf(this.TP.KtoC()); System.out.println("KtoC"); break;
            case 2 : st = String.valueOf(this.P.getValue()); System.out.println("KtoK"); break;
        }
        return st;
    }

}
