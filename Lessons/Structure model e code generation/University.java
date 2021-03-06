/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF8/qxvaaGMVSE= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF8/qxvaaGMVSE= >>
// ----------- >>
public class University {
    // ----------- << attribute.annotations@AAAAAAF8/rl/6Kcpatk= >>
    // ----------- >>
    private int NumEmployes;

    // ----------- << attribute.annotations@AAAAAAF8/q1jQ6IRHe0= >>
    // ----------- >>
    private Set<Faculty> faculties = new HashSet<>();

    public int getNumEmployes() {
        return NumEmployes;
    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }

    public void setNumEmployes(int NumEmployes) {
        this.NumEmployes = NumEmployes;
    }

    public void linkFaculties(Faculty _faculties) {
        if (_faculties != null) {
            _faculties.unlinkAteneo();
            _faculties.setAteneo(this);
            getFaculties().add(_faculties);
        }
    }

    public void unlinkFaculties(Faculty _faculties) {
        if (_faculties != null) {
            _faculties.setAteneo(null);
            getFaculties().remove(_faculties);
        }
    }

    public void unlinkFaculties(Faculty _faculties, Iterator<Faculty> it) {
        if (_faculties != null) {
            _faculties.setAteneo(null);
            it.remove();
        }
    }

// ----------- << class.extras@AAAAAAF8/qxvaaGMVSE= >>
// ----------- >>
}