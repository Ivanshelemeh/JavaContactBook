package org.itstep.msk;

import java.util.Set;

public interface ExtendedContactBook {
    int create(String nameNumbers);
    ExtendedContactBook delete(ExtendedContact e);
    Set<ExtendedContact> read();
    ExtendedContactBook addcommit();

}
