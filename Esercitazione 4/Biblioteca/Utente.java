/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF9N9yj1zpk7XM= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF9N9yj1zpk7XM= >>
// ----------- >>
public class Utente {
    // ----------- << attribute.annotations@AAAAAAF9N912ijs3R1c= >>
    // ----------- >>
    private int CodiceNumerico;

    // ----------- << attribute.annotations@AAAAAAF9N+DWAzuzCJI= >>
    // ----------- >>
    private Biblioteca ;

    // ----------- << attribute.annotations@AAAAAAF9N+Dx5TxAmeU= >>
    // ----------- >>
    private Set<Documento>  = new HashSet<>();

    public int getCodiceNumerico() {
        return CodiceNumerico;
    }

    public Biblioteca get() {
        return ;
    }

    public Set<Documento> get() {
        return ;
    }

    public void setCodiceNumerico(int CodiceNumerico) {
        this.CodiceNumerico = CodiceNumerico;
    }

    public void set(Biblioteca ) {
        this. = ;
    }

    public void link(Biblioteca _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Documento _) {
        if (_ != null) {
    		_.get().add(this);
            get().add(_);
        }
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

    public void unlink(Documento _) {
        if (_ != null) {
            _.get().remove(this);
            get().remove(_);
        }
    };

    public void unlink(Documento _, Iterator<Documento> it) {
        if (_ != null) {
            _.get().remove(this);
            it.remove();
        }
    }

// ----------- << class.extras@AAAAAAF9N9yj1zpk7XM= >>
// ----------- >>
}