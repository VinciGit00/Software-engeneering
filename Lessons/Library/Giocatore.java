/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF9Dzl3F2xO2TE= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF9Dzl3F2xO2TE= >>
// ----------- >>
public class Giocatore {
    // ----------- << attribute.annotations@AAAAAAF9DzmdUWx5zNs= >>
    // ----------- >>
    private String Nome;

    // ----------- << attribute.annotations@AAAAAAF9Dzv9f2ysYfk= >>
    // ----------- >>
    private Set<Personaggio>  = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF9D2a6EczN7tk= >>
    // ----------- >>
    private Personaggio ;

    public String getNome() {
        return Nome;
    }

    public Set<Personaggio> get() {
        return ;
    }

    public Personaggio get() {
        return ;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void set(Personaggio ) {
        this. = ;
    }

    public void link(Personaggio _) {
        if (_ != null) {
    		_.get().add(this);
            get().add(_);
        }
    }

    public void link(Personaggio _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void unlink(Personaggio _) {
        if (_ != null) {
            _.get().remove(this);
            get().remove(_);
        }
    };

    public void unlink(Personaggio _, Iterator<Personaggio> it) {
        if (_ != null) {
            _.get().remove(this);
            it.remove();
        }
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

// ----------- << class.extras@AAAAAAF9Dzl3F2xO2TE= >>
// ----------- >>
}