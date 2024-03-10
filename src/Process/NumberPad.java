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
public abstract class NumberPad {
    
    private boolean start = true;
    private boolean dot = false;
    
    public String NumberInput(String newValue, String oldValue) {
        if (start) {            
            oldValue = "";
            start = false;
        }
        if(!dot && newValue.equals(".")){
            if(oldValue.equals("")){
            oldValue = "0";
            }
            dot = true;
            return oldValue+newValue;
        }else if(dot && newValue.equals(".")){
            return oldValue;
        }else{
            return oldValue+newValue;
        }
    }
    
    public void reStart(){
        this.start = true;
        this.dot = false;
    }
    
    public String backspace(String st) {
        char a[] = st.toCharArray();
        String res = "";
        if (a.length == 1 || (a[1] == '.' && a.length == 2 && a[0] == '0')) {
            res = "0";
            start = true;
            dot = false;
        } else {
            for (int i = 0; i < a.length - 1; i++) {
                res += a[i];
            }
        }
        return res;
    }
    
    public abstract String PressKey(KeyEvent ke,String value);
    
}
