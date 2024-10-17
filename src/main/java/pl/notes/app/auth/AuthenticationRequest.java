package pl.notes.app.auth;

import lombok.Builder;

@Builder
public record AuthenticationRequest (String email, String password) {

}
