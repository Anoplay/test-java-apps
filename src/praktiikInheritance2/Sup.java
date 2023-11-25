/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktiikInheritance2;

/**
 *
 * @author agung
 */
public class Sup extends Base {

    public static void main(String argv[]) {
        Sup s = new Sup();
        s.derived();
    }

    Sup() {
        super(1);
    }

    public void derived() {
        Base b = new Base(2);
    }
}
