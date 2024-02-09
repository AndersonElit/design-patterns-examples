package bridge.authsystem.manager;

import bridge.authsystem.interfaces.Authentication;

public abstract class AuthenticationManager {
    protected Authentication authentication;

    public AuthenticationManager(Authentication authentication) {
        this.authentication = authentication;
    }

    public abstract Boolean authenticate();

}
