/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

/**
 *
 * @author jaime
 */
public class NobodySpecial extends HandyPerson{
    
    public NobodySpecial(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "NobodySpecial{" + super.toString() + '}';
}
}
