/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF9D0+MeXi/vbc= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF9D0+MeXi/vbc= >>
// ----------- >>
public class Libro extends Class1 {
    // ----------- << attribute.annotations@AAAAAAF9D0+oAXoserc= >>
    // ----------- >>
    private String Titolo;

    // ----------- << attribute.annotations@AAAAAAF9D0/XI3rVDCg= >>
    // ----------- >>
    private String Autore;

    // ----------- << attribute.annotations@AAAAAAF9D1XBkJutUmI= >>
    // ----------- >>
    private Personaggio ;

    // ----------- << attribute.annotations@AAAAAAF9D1A7UHvcyGA= >>
    // ----------- >>
    private Saggio ;

    // ----------- << attribute.annotations@AAAAAAF9D3j1XOAS4iI= >>
    // ----------- >>
    private Set<Saggio>  = new HashSet<>();

    public String getTitolo() {
        return Titolo;
    }

    public String getAutore() {
        return Autore;
    }

    public Personaggio get() {
        return ;
    }

    public Saggio get() {
        return ;
    }

    public Set<Saggio> get() {
        return ;
    }

    public void setTitolo(String Titolo) {
        this.Titolo = Titolo;
    }

    public void setAutore(String Autore) {
        this.Autore = Autore;
    }

    public void set(Personaggio ) {
        this. = ;
    }

    public void set(Saggio ) {
        this. = ;
    }

    public void link(Personaggio _) {
        if (_ != null) {
            _.get().add(this);
        }

        unlink();
        set(_);
    }

    public void link(Saggio _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Saggio _) {
        if (_ != null) {
    		_.get().add(this);
            get().add(_);
        }
    }

    public void unlink() {
        if (get() != null) {
            get().get().remove(this);
            set(null);
        }
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

    public void unlink(Saggio _) {
        if (_ != null) {
            _.get().remove(this);
            get().remove(_);
        }
    };

    public void unlink(Saggio _, Iterator<Saggio> it) {
        if (_ != null) {
            _.get().remove(this);
            it.remove();
        }
    }

// ----------- << class.extras@AAAAAAF9D0+MeXi/vbc= >>
// ----------- >>
}