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
public interface ProcessBase {
    public void reStart();
    public void setProcess(Cal P) ;
    public void setValue(String Value);
    public void setFIndex(int FIndex);
    public void setSIndex(int SIndex);
    public String Calculate();
}
