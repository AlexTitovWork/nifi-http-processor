package org.mps.nifi.processors.sharepoint;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * Host name verifier that does not perform any checks.
 */
public class NullHostnameVerifier implements HostnameVerifier {

    /**
     * Always return true.
     *
     * @param hostname
     *            hostname
     * @param sslSession
     *            SSL session
     * @return true
     */
    @Override
    public boolean verify(final String hostname, final SSLSession sslSession) {
        return true;
    }
}