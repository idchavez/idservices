package com.id.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
