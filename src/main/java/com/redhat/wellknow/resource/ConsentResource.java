package com.redhat.wellknow.resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsentResource {
  
	@RequestMapping(value = "/consentimento/v1/consents", method = RequestMethod.POST, produces = { "application/json" })
    public ResponseEntity postConsent(@RequestBody Object json) {
                            /*     @RequestHeader("x-fapi-interaction-id") String x_fapi_interaction_id,
                                    @RequestHeader("Authorization") String authorization
                            */
        System.out.println("Entrou na aplicação de consentimento");             

        String x_fapi_interaction_id="c770aef3-6784-41f7-8e0e-ff5f97bddb3a";

       // System.out.println("Authorization : "+authorization);

        System.out.println("JSON Recebido : "+json);

        String jsonRetorno = "{"+
        "  \"data\": {"+
        "    \"consentId\": \"urn:bancoex:C1DD33123\","+
        "    \"creationDateTime\": \"2021-05-21T08:30:00Z\","+
        "    \"status\": \"AWAITING_AUTHORISATION\","+
        "    \"statusUpdateDateTime\": \"2021-05-21T08:30:00Z\","+
        "    \"permissions\": ["+
        "      \"ACCOUNTS_READ\","+
        "      \"ACCOUNTS_OVERDRAFT_LIMITS_READ\","+
        "      \"RESOURCES_READ\""+
        "    ],"+
        "    \"expirationDateTime\": \"2021-05-21T08:30:00Z\","+
        "    \"transactionFromDateTime\": \"2021-01-01T00:00:00Z\","+
        "    \"transactionToDateTime\": \"2021-02-01T23:59:59Z\""+
        "  },"+
        "  \"links\": {"+
        "    \"self\": \"https://api.banco.com.br/open-banking/api/v1/resource\","+
        "    \"first\": \"https://api.banco.com.br/open-banking/api/v1/resource\","+
        "    \"prev\": \"https://api.banco.com.br/open-banking/api/v1/resource\","+
        "    \"next\": \"https://api.banco.com.br/open-banking/api/v1/resource\","+
        "    \"last\": \"https://api.banco.com.br/open-banking/api/v1/resource\""+
        "  },"+
        "  \"meta\": {"+
        "    \"totalRecords\": 1,"+
        "    \"totalPages\": 1,"+
        "    \"requestDateTime\": \"2021-05-21T08:30:00Z\""+
        "  }"+
        "}  ";

        System.out.println("x-fapi-interaction-id:"+ x_fapi_interaction_id);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("x-fapi-interaction-id", 
                        x_fapi_interaction_id);
        return  ResponseEntity.status (HttpStatus.CREATED)

        .headers(responseHeaders)
        .body(jsonRetorno) ;
    }
}