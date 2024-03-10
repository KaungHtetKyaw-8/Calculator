/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import java.awt.event.KeyEvent;

/**
 *
 * @author KHK
 */
public class SecondNumberPad extends NumberPad{

    @Override
    public String PressKey(KeyEvent ke,String value) {
       switch(ke.getKeyChar()){
            case '0' : return NumberInput("0",value); 
            case '1' : return NumberInput("1",value); 
            case '2' : return NumberInput("2",value); 
            case '3' : return NumberInput("3",value);
            case '4' : return NumberInput("4",value);
            case '5' : return NumberInput("5",value);
            case '6' : return NumberInput("6",value);
            case '7' : return NumberInput("7",value);
            case '8' : return NumberInput("8",value);
            case '9' : return NumberInput("9",value);
            case '.' : return NumberInput(".",value);    
            default : if(ke.getKeyCode()==8){
                            return backspace(value);
                        }else{
                            return value;
                        }
       }
    }
}
