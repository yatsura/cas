package org.apereo.cas.ticket.refreshtoken;

import org.apereo.cas.authentication.Authentication;
import org.apereo.cas.authentication.principal.Service;
import org.apereo.cas.ticket.TicketFactory;

/**
 * Factory to create OAuth refresh tokens.
 *
 * @author Jerome Leleu
 * @since 5.0.0
 */
public interface RefreshTokenFactory extends TicketFactory {

    /**
     * Create a refresh token.
     *
     * @param service the service
     * @param authentication the authentication
     * @return the refresh token
     */
    RefreshToken create(Service service, Authentication authentication);
}
