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
public class DataModel {

    public String Calculate(float num1, String Operator, float num2) {
        String result = "";
        String Opt = Operator;
        switch (Opt) {
            case "+" -> {
                result = String.valueOf(num1 + num2);
                System.out.println(num1+" + "+num2+" = "+result);
            }
            case "-" -> {
                result = String.valueOf(num1 - num2);
                System.out.println(num1+" - "+num2+" = "+result);
            }
            case "*" -> {
                result = String.valueOf(num1 * num2);
                System.out.println(num1+" * "+num2+" = "+result);
            }
            case "/" -> {
                if (num1 > num2) {
                    result = String.valueOf(num1 / num2);
                    System.out.println(num1+" / "+num2+" = "+result);
                } else {
                    result = "0";
                }
            }
        }

        return result;
    }

}
