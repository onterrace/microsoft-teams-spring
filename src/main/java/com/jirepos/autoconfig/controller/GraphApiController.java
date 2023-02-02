package com.jirepos.autoconfig.controller;

import java.net.URL;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import com.microsoft.aad.msal4j.ClientCredentialFactory;
// import com.microsoft.aad.msal4j.ConfidentialClientApplication;
// import com.microsoft.aad.msal4j.IAuthenticationResult;
// import com.microsoft.aad.msal4j.OnBehalfOfParameters;
// import com.microsoft.aad.msal4j.UserAssertion;
// import com.microsoft.graph.authentication.IAuthenticationProvider;
// import com.microsoft.graph.requests.GraphServiceClient;

// import okhttp3.Request;

@Controller
@RequestMapping("/graph")
public class GraphApiController {

    @GetMapping("/chat-list")
    public ResponseEntity<?> getChatList(@RequestParam("auth") String auth) throws Exception {


        // String clientId = "de6a6b08-38ab-465f-b42e-f3e8adef5ef2"; // application id라고도 부른다. 
        // String clientSecret = "931bfb0c-59b2-4c35-ab25-78b2183e1063";  // Azure portal에서 복사 
        // // tenant id는 Azure portal에서 복사 
        // String tenantId = "0f298de5-864d-4f37-9497-77ace3386e9e"; 
        // String authority = "https://login.microsoftonline.com/" + tenantId;

        // ConfidentialClientApplication application = ConfidentialClientApplication
        //     .builder(clientId, ClientCredentialFactory.createFromSecret(clientSecret))
        //     .authority(authority)
        //     .build();

        // String authToken = "";  // 사용자가 로그인을 했다고 가정, 브라우저에서 구할 수 있음 
        // String scope  = "https://graph.microsoft.com/.default";
        // OnBehalfOfParameters parameters =   
        //     OnBehalfOfParameters.builder( Collections.singleton(scope),new UserAssertion(authToken))
        //    .build();
           
        // IAuthenticationResult authResult = application.acquireToken(parameters).join();
        // String accessToken = authResult.accessToken().toString(); 


        // IAuthenticationProvider authProvider = new IAuthenticationProvider() {
        //     @Override
        //     public CompletableFuture<String> getAuthorizationTokenAsync(URL requestUrl) {
        //         CompletableFuture<String> future = new CompletableFuture<>();
        //         future.complete(accessToken);
        //         return future;
        //     }
        // };
        
        // GraphServiceClient<Request> graphClient = GraphServiceClient
        // .builder()
        // .authenticationProvider(authProvider)
        // .buildClient();

        // 이제 Graph Client 사용


        return ResponseEntity.ok("Hello World");
    }

}/// ~
