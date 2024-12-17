package lab.arahnik.controller;

import lab.arahnik.dto.AuthenticationRequest;
import lab.arahnik.dto.AuthenticationResponse;
import lab.arahnik.dto.RegisterRequest;
import lab.arahnik.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> registerUser(
            @RequestBody RegisterRequest request) {
        return ResponseEntity.ok(
                authenticationService.register(request)
        );
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> registerUser(
            @RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(
                authenticationService.authenticate(request)
        );
    }
}
