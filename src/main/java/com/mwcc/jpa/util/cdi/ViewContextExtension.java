package com.mwcc.jpa.util.cdi;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeforeBeanDiscovery;
import javax.faces.bean.ViewScoped;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.Extension;

public class ViewContextExtension implements Extension {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public byte[] getValue() {
        return new byte[0];
    }

    @Override
    public void encode(OutputStream out) throws IOException {

    }

    public void addScope(@Observes final BeforeBeanDiscovery event)
    {
        event.addScope(ViewScoped.class, true, true);
    }

    public void registerContext(@Observes final AfterBeanDiscovery event)
    {
        event.addContext(new ViewScopedContext());
    }
}
