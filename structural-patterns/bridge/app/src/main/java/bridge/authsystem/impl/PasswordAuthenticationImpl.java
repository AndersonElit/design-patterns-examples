package bridge.authsystem.impl;

import bridge.authsystem.interfaces.Authentication;

public class PasswordAuthenticationImpl implements Authentication {
    @Override
    public Boolean authenticate() {
        return Boolean.TRUE;
    }
}
