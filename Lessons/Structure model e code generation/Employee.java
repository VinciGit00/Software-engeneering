/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF8/rZ+E6WkxAk= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF8/rZ+E6WkxAk= >>
// ----------- >>
public abstract class Employee {
    // ----------- << attribute.annotations@AAAAAAF8/roogKgKtUY= >>
    // ----------- >>
    private int ssn;

    // ----------- << attribute.annotations@AAAAAAF8/rqZhKmdke8= >>
    // ----------- >>
    private String Name;

    // ----------- << attribute.annotations@AAAAAAF8/rkuEaatf7o= >>
    // ----------- >>
    private Faculty ;

    public int getSsn() {
        return ssn;
    }

    public String getName() {
        return Name;
    }

    public Faculty get() {
        return ;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void set(Faculty ) {
        this. = ;
    }

    public void link(Faculty _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

// ----------- << class.extras@AAAAAAF8/rZ+E6WkxAk= >>
// ----------- >>
}