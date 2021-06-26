package com.redhat.wellknow.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellKnowResource {
  
	@RequestMapping(value = "/.well-known/openid-configuration", method = RequestMethod.GET, produces = { "application/json" })
    public String hello() {
        String jsonWellKnow = 
        "{"+
        "    \"acr_values_supported\":["+
        "       \"urn:brasil:openbanking:loa2\", \"urn:brasil:openbanking:loa3\", \"urn:mace:incommon:iap:silver\""+
        "    ],"+
        "    \"authorization_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/auth/device\","+
        "    \"device_authorization_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/auth/device\","+
        "    \"claims_parameter_supported\":true,"+
        "    \"claims_supported\":["+
        "       \"sub\","+
        "       \"email\","+
        "       \"email_verified\","+
        "       \"phone_number\","+
        "       \"phone_number_verified\","+
        "       \"cpf\","+
        "       \"cnpj\","+
        "       \"family_name\","+
        "       \"given_name\","+
        "       \"profile\","+
        "       \"acr\","+
        "       \"sid\","+
        "       \"auth_time\","+
        "       \"iss\""+
        "    ],"+
        "    \"code_challenge_methods_supported\":["+
        "       \"S256\""+
        "    ],"+
        "    \"end_session_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/logout\","+
        "    \"grant_types_supported\":["+
        "       \"implicit\","+
        "       \"authorization_code\","+
        "       \"refresh_token\","+
        "       \"client_credentials\","+
        "       \"urn:openid:params:grant-type:ciba\""+
        "    ],"+
        "    \"id_token_signing_alg_values_supported\":["+
        "       \"PS256\""+
        "    ],"+
        "    \"backchannel_authentication_endpoint\": \"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/ext/ciba/auth\","+
        "     \"backchannel_token_delivery_modes_supported\": ["+
        "         \"poll\", \"ping\""+
        "     ],"+
        "     \"backchannel_user_code_parameter_supported\": true,"+
        "     \"backchannel_authentication_request_signing_alg_values_supported\": ["+
        "         \"PS256\""+
        "     ],"+
        "    \"issuer\":\"https://as.tekton-work.com/auth/realms/test\","+
        "    \"jwks_uri\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/certs\","+
        "    \"registration_endpoint\":\"https://as.tekton-work.com/auth/realms/test/clients-registrations/openid-connect\","+
        "    \"response_modes_supported\":["+
        "       \"form_post\","+
        "       \"fragment\","+
        "       \"query\","+
        "       \"jwt\","+
        "       \"query.jwt\","+
        "       \"fragment.jwt\","+
        "       \"form_post.jwt\""+
        "    ],"+
        "    \"response_types_supported\":["+
        "       \"code id_token\","+
        "       \"code\""+
        "    ],"+
        "    \"scopes_supported\":["+
        "       \"openid\","+
        "       \"offline_access\","+
        "       \"profile\","+
        "       \"email\","+
        "       \"phone\","+
        "       \"accounts\","+
        "       \"credit-cards-accounts\","+
        "       \"consents\","+
        "       \"customers\","+
        "       \"invoice-financings\","+
        "       \"financings\","+
        "       \"unarranged-accounts-overdraft\""+
        "    ],"+
        "    \"subject_types_supported\":["+
        "       \"public\","+
        "       \"pairwise\""+
        "    ],"+
        "    \"token_endpoint_auth_methods_supported\":["+
        "       \"private_key_jwt\","+
        "       \"tls_client_auth\""+
        "    ],"+
        "    \"token_endpoint_auth_signing_alg_values_supported\":["+
        "       \"PS256\""+
        "    ],"+
        "    \"token_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/token\","+
        "    \"pushed_authorization_request_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/request\","+
        "    \"request_object_signing_alg_values_supported\":["+
        "       \"PS256\""+
        "    ],"+
        "    \"request_parameter_supported\":true,"+
        "    \"request_uri_parameter_supported\":false,"+
        "    \"userinfo_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/userinfo\","+
        "    \"authorization_signing_alg_values_supported\":["+
        "       \"PS256\""+
        "    ],"+
        "    \"introspection_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/token/introspect\","+
        "    \"introspection_endpoint_auth_methods_supported\":["+
        "       \"private_key_jwt\","+
        "       \"tls_client_auth\""+
        "    ],"+
        "    \"introspection_endpoint_auth_signing_alg_values_supported\":["+
        "       \"PS256\""+
        "    ],"+
        "    \"revocation_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/revoke\","+
        "    \"revocation_endpoint_auth_methods_supported\":["+
        "       \"private_key_jwt\","+
        "       \"tls_client_auth\""+
        "    ],"+
        "    \"revocation_endpoint_auth_signing_alg_values_supported\":["+
        "       \"PS256\""+
        "    ],"+
        "    \"id_token_encryption_alg_values_supported\":["+
        "       \"PS256\""+
        " "+
        "    ],"+
        "    \"id_token_encryption_enc_values_supported\":["+
        "       \"A256GCM\""+
        "    ],"+
        "    \"authorization_encryption_alg_values_supported\":["+
        "       \"PS256\""+
        "    ],"+
        "    \"authorization_encryption_enc_values_supported\":["+
        "       \"A256GCM\""+
        "    ],"+
        "    \"request_object_encryption_alg_values_supported\":["+
        "       \"PS256\""+
        "    ],"+
        "    \"request_object_encryption_enc_values_supported\":["+
        "       \"A256GCM\""+
        "    ],"+
        "    \"tls_client_certificate_bound_access_tokens\":true,"+
        "    \"claim_types_supported\":["+
        "       \"normal\""+
        "    ],"+
        "    \"mtls_endpoint_aliases\":{"+
        "       \"token_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/token\","+
        "       \"revocation_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/revoke\","+
        "       \"introspection_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/token/introspect\","+
        "       \"device_authorization_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/auth/device\","+
        "       \"registration_endpoint\":\"https://as.tekton-work.com/auth/realms/test/clients-registrations/openid-connect\","+
        "       \"userinfo_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/userinfo\","+
        "       \"pushed_authorization_request_endpoint\":\"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/request\","+
        "       \"backchannel_authentication_endpoint\": \"https://as.tekton-work.com/auth/realms/test/protocol/openid-connect/ext/ciba/auth\"  "+
        "    }"+
        " }";

        return jsonWellKnow;
    }
}