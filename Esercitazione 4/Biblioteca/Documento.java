/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF9N9oE7zgkXGY= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF9N9oE7zgkXGY= >>
// ----------- >>
public abstract class Documento {
    // ----------- << attribute.annotations@AAAAAAF9N+fd21CoOxY= >>
    // ----------- >>
    private String NomeDocumento;

    // ----------- << attribute.annotations@AAAAAAF9N+ebeU9WiKE= >>
    // ----------- >>
    private Argomento Argomento;

    // ----------- << attribute.annotations@AAAAAAF9N90MZzrWc0U= >>
    // ----------- >>
    private boolean Prestabile;

    // ----------- << attribute.annotations@AAAAAAF9N9smITi42LY= >>
    // ----------- >>
    private Set<Settori>  = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF9N+Dx5Dw/VPk= >>
    // ----------- >>
    private Set<Utente>  = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAF9N+IjWj+Xedk= >>
    // ----------- >>
    private Set<Scaffali>  = new HashSet<>();

    public String getNomeDocumento() {
        return NomeDocumento;
    }

    public Argomento getArgomento() {
        return Argomento;
    }

    public boolean isPrestabile() {
        return Prestabile;
    }

    public Set<Settori> get() {
        return ;
    }

    public Set<Utente> get() {
        return ;
    }

    public Set<Scaffali> get() {
        return ;
    }

    public void setNomeDocumento(String NomeDocumento) {
        this.NomeDocumento = NomeDocumento;
    }

    public void setArgomento(Argomento Argomento) {
        this.Argomento = Argomento;
    }

    public void setPrestabile(boolean Prestabile) {
        this.Prestabile = Prestabile;
    }

    public void link(Settori _) {
        if (_ != null) {
    		_.get().add(this);
            get().add(_);
        }
    }

    public void link(Utente _) {
        if (_ != null) {
    		_.get().add(this);
            get().add(_);
        }
    }

    public void link(Scaffali _) {
        if (_ != null) {
    		_.get().add(this);
            get().add(_);
        }
    }

    public void unlink(Settori _) {
        if (_ != null) {
            _.get().remove(this);
            get().remove(_);
        }
    };

    public void unlink(Settori _, Iterator<Settori> it) {
        if (_ != null) {
            _.get().remove(this);
            it.remove();
        }
    }

    public void unlink(Utente _) {
        if (_ != null) {
            _.get().remove(this);
            get().remove(_);
        }
    };

    public void unlink(Utente _, Iterator<Utente> it) {
        if (_ != null) {
            _.get().remove(this);
            it.remove();
        }
    }

    public void unlink(Scaffali _) {
        if (_ != null) {
            _.get().remove(this);
            get().remove(_);
        }
    };

    public void unlink(Scaffali _, Iterator<Scaffali> it) {
        if (_ != null) {
            _.get().remove(this);
            it.remove();
        }
    }

// ----------- << class.extras@AAAAAAF9N9oE7zgkXGY= >>
// ----------- >>
}