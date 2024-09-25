package in.vedisoft.payroll;

import in.vedisoft.payroll.utilities.Abc;           //Specific import
import in.vedisoft.payroll.ui.*;
import in.vedisoft.payroll.utilities.*;
import in.vedisoft.payroll.logics.*;

public class MainProg {
    public static void main(String args[]) {
        Abc obj = new Abc();
        in.vedisoft.payroll.Abc obj1 = new in.vedisoft.payroll.Abc(); //inline import
        in.vedisoft.payroll.logics.Abc obj2 = new in.vedisoft.payroll.logics.Abc(); //inline import
        in.vedisoft.payroll.ui.Abc obj3 = new in.vedisoft.payroll.ui.Abc(); //inline import
        UserInterface obj4 = new UserInterface();
        Logic obj5 = new Logic();
        Utility obj6 = new Utility();
        in.vedisoft.pfund.Abc obj7 = new in.vedisoft.pfund.Abc();
    }
}










