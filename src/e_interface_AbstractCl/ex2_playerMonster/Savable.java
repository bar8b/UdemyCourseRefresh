package e_interface_AbstractCl.ex2_playerMonster;

import java.util.ArrayList;

public interface Savable {

    ArrayList<String> write();
    void read(ArrayList<String> savedValues);



}
