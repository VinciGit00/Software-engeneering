/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF9Dzu2/WyAbPk= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF9Dzu2/WyAbPk= >>
// ----------- >>
public abstract class Personaggio {
    // ----------- << attribute.annotations@AAAAAAF9DzyUWW1Tw1g= >>
    // ----------- >>
    private int ID;

    // ----------- << attribute.annotations@AAAAAAF9Dz7EMm41jyo= >>
    // ----------- >>
    private String Nome;

    // ----------- << attribute.annotations@AAAAAAF9D2hvO9BADQg= >>
    // ----------- >>
    private Set<void> IdUsati = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF9Dzv9f2yrG+M= >>
    // ----------- >>
    private Set<Giocatore>  = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF9D1XBkJuuyHU= >>
    // ----------- >>
    private Set<Libro>  = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF9D2a6EczOQKM= >>
    // ----------- >>
    private Giocatore ;

    public int getID() {
        return ID;
    }

    public String getNome() {
        return Nome;
    }

    public Set<void> getIdUsati() {
        return IdUsati;
    }

    public Set<Giocatore> get() {
        return ;
    }

    public Set<Libro> get() {
        return ;
    }

    public Giocatore get() {
        return ;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void set(Giocatore ) {
        this. = ;
    }

    public void link(Giocatore _) {
        if (_ != null) {
    		_.get().add(this);
            get().add(_);
        }
    }

    public void link(Libro _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
            get().add(_);
        }
    }

    public void link(Giocatore _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void unlink(Giocatore _) {
        if (_ != null) {
            _.get().remove(this);
            get().remove(_);
        }
    };

    public void unlink(Giocatore _, Iterator<Giocatore> it) {
        if (_ != null) {
            _.get().remove(this);
            it.remove();
        }
    }

    public void unlink(Libro _) {
        if (_ != null) {
            _.set(null);
            get().remove(_);
        }
    }

    public void unlink(Libro _, Iterator<Libro> it) {
        if (_ != null) {
            _.set(null);
            it.remove();
        }
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

    // ----------- << method.annotations@AAAAAAF9Dz9w+W6FXwg= >>
    // ----------- >>
    public abstract void Forza();
    // ----------- << method.annotations@AAAAAAF9Dz+qR27I/AA= >>
    // ----------- >>
    public abstract void Augment();
// ----------- << class.extras@AAAAAAF9Dzu2/WyAbPk= >>
// ----------- >>
}