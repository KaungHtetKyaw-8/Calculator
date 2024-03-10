/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import DataModel.DataModel;
import java.awt.event.KeyEvent;

/**
 *
 * @author KHK
 */
public class SimpleProcess extends NumberPad{

    private final DataModel DM = new DataModel();
    private float temp = 0;
    private String opt = "";
    
    public String ProcessOperator(String newValue,String oldValue) {
        if (!newValue.equals("=")) {
            opt = "";
            if (!opt.equals("") && temp != 0) {
                temp = Float.valueOf(this.DM.Calculate(temp, opt, Float.valueOf(oldValue)));
                opt = newValue;
                reStart();
                return "";
            } else {
                temp = Float.valueOf(oldValue);
                opt = newValue;
                reStart();
                return "";
            }
        } else {
            if (temp != 0) {
                if (!oldValue.equals("")) {    
                    temp = Float.valueOf(this.DM.Calculate(temp, opt, Float.valueOf(oldValue)));
                    reStart();
                    return String.valueOf(temp);
                } else {
                    System.out.println("Second Value Null");
                }
            } else {
                System.out.println("Null Value");
            }
            return oldValue;
        }
    }

    @Override
    public String PressKey(KeyEvent ke,String oldValue){
        switch(ke.getKeyChar()){
            case '0' -> {
                return NumberInput("0",oldValue);
            }
            case '1' -> {
                return NumberInput("1",oldValue);
            }
            case '2' -> {
                return NumberInput("2",oldValue);
            }
            case '3' -> {
                return NumberInput("3",oldValue);
            }
            case '4' -> {
                return NumberInput("4",oldValue);
            } 
            case '5' -> {
                return NumberInput("5",oldValue);
            }
            case '6' -> {
                return NumberInput("6",oldValue);
            }
            case '7' -> {
                return NumberInput("7",oldValue);
            }
            case '8' -> {
                return NumberInput("8",oldValue);
            }
            case '9' -> {
                return NumberInput("9",oldValue);
            }
            case '.' -> {
                return NumberInput(".",oldValue);
            }
            case '+' -> {
                return ProcessOperator("+",oldValue);
            }
            case '-' -> {
                return ProcessOperator("-",oldValue);
            }
            case '*' -> {
                return ProcessOperator("*",oldValue);
            }
            case '/' -> {
                return ProcessOperator("/",oldValue);
            }
        }
        switch(ke.getKeyCode()){
            case  61 -> {
                return ProcessOperator("=",oldValue);
            }
            case  10 -> {
                return ProcessOperator("=",oldValue);
            }
            case  8 -> {
                return backspace(oldValue);
            }
            case  127 -> {
                reStart(); return "0";
            }
            default -> {
                return"0";
            }
        }
    }   
}
