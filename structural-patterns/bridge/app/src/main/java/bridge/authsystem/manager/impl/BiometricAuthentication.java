package bridge.authsystem.manager.impl;

import bridge.authsystem.interfaces.Authentication;
import bridge.authsystem.manager.AuthenticationManager;

public class BiometricAuthentication extends AuthenticationManager {

    public BiometricAuthentication(Authentication authentication) {
        super(authentication);
    }

    @Override
    public Boolean authenticate() {
        return authentication.authenticate();
    }
}
