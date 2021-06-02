package com.nacos.test.nacosauth.nacosauth.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nacos.test.nacosauth.nacosauth.domain.RequestParam;
import com.nacos.test.nacosauth.nacosauth.member.ZJMemberAuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class UserController {

    @Resource
    private ObjectMapper objectMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Resource
    private AuthorizationServerTokenServices authorizationServerTokenServices;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public void getTokenByMember(@RequestBody RequestParam requestParam,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws IOException {
        ZJMemberAuthenticationToken token = new ZJMemberAuthenticationToken(requestParam.getParam().get("userName"), requestParam.getParam().get("passWord"));
        System.out.println(token.toString());
    }
}
