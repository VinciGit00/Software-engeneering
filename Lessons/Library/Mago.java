/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF9D0SwoG+yKAk= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF9D0SwoG+yKAk= >>
// ----------- >>
public class Mago extends Personaggio {
    // ----------- << attribute.annotations@AAAAAAF9D0uEa3ThL0g= >>
    // ----------- >>
    private Set<Pozione>  = new HashSet<>();

    public Set<Pozione> get() {
        return ;
    }

    public void link(Pozione _) {
        if (_ != null) {
            get().add(_);
        }
    }

    public void unlink(Pozione _) {
        if (_ != null) {
            get().remove(_);
        }
    }

    public void unlink(Iterator<Pozione> it) {
        it.remove();
    }

    @Override
    // ----------- << method.annotations@AAAAAAF9D1JZzH5RtU4= >>
    // ----------- >>
    public void Forza() {
    // ----------- << method.body@AAAAAAF9D1JZzH5RtU4= >>
    // ----------- >>
    }
    @Override
    // ----------- << method.annotations@AAAAAAF9D1TriIghLQw= >>
    // ----------- >>
    public void Augment() {
    // ----------- << method.body@AAAAAAF9D1TriIghLQw= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAF9D0SwoG+yKAk= >>
// ----------- >>
}