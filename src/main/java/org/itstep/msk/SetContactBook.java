package org.itstep.msk;

import java.util.Collections;
import java.util.Set;

public class SetContactBook implements ExtendedContactBook {
    private Set<ExtendedContact> extendedContacts;

    public SetContactBook(Set<ExtendedContact> extendedContacts) {
        this.extendedContacts = extendedContacts;
    }

    @Override
    public int create(String nameNumbers) {
        extendedContacts.add(new ExtendedContact(nameNumbers));
        return extendedContacts.size()-1;
    }

    @Override
    public ExtendedContactBook delete(ExtendedContact e) {
        extendedContacts.remove(e);
        return this;
    }

    @Override
    public Set<ExtendedContact> read() {
        return Collections.unmodifiableSet(extendedContacts);
    }

    @Override
    public ExtendedContactBook addcommit() {
        return null;
    }
}
