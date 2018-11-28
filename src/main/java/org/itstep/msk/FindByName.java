package org.itstep.msk;

import java.util.Iterator;

public interface FindByName extends SimpleContactBook {
    public Iterator<Contact> findByName(String name);



}
