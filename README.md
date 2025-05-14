### Authentication - 4: Implementng OAuth 2:

OIDC stands for Open Id Connect which extends OAuth2. 
OIDC provides authentication and OAuth2 provides authorization. 
OIDC is a wrapper on top of OAuth2.

JWK  stands for JSON Web Keys
What is Single Sign On?

Why do we inject Service in Controller and not create a new object?

Jackson is the library that SpringBoot uses to convert an object to JSON and vice versa.
Jackson has some problems:

Refresh token is the token that we need to send to authorization server whenever the access token expires.
Client requests server new access token with the help of refresh token whenever access token expires.
The validity of access token is very less.

nbf in jwt token stands for not valid before. We can change this value.

Watch from 2:27 till end

User data
{
"name": "Aishwarya",
"email": "aish@test.com",
"password": "pass1234"
}
