/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF8/sdAnr2BuD0= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF8/sdAnr2BuD0= >>
// ----------- >>
public class Course {
    // ----------- << attribute.annotations@AAAAAAF8/seFdL5iwVU= >>
    // ----------- >>
    private Lecturer ;

    public Lecturer get() {
        return ;
    }

    public void set(Lecturer ) {
        this. = ;
    }

    public void link(Lecturer _) {
        if (_ != null) {
            _.get().add(this);
        }

        unlink();
        set(_);
    }

    public void unlink() {
        if (get() != null) {
            get().get().remove(this);
            set(null);
        }
    }

// ----------- << class.extras@AAAAAAF8/sdAnr2BuD0= >>
// ----------- >>
}