package org.itstep.msk;

public interface ExtendedContactBook extends SimpleContactBook {
    Contact create(ExtendedContact extendedContact);
    ExtendedContactBook delete(Contact origin);
    Iterable<Contact> read();
    ExtendedContact addcommit();

}
