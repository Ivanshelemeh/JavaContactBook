package org.itstep.msk;

import java.util.Set;

public  class ExtendedContact{
    private Contact origin;
    private Set<String> anotherphoneNumber;

    public ExtendedContact(Contact origin, Set<String> anotherphoneNumber) {
        this.origin = origin;
        this.anotherphoneNumber = anotherphoneNumber;
    }

    public Contact getOrigin() {
        return origin;
    }

    public Set<String> getAnotherphoneNumber() {
        return anotherphoneNumber;
    }
}



