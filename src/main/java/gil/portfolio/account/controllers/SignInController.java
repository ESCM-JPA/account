package gil.portfolio.account.controllers;

import gil.portfolio.account.entities.PtUsrInf;
import gil.portfolio.account.entities.PtUsrTpc;
import gil.portfolio.account.service.signInService.SignInService;
import gil.portfolio.account.service.signInService.SignInUserTypeGetter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("")
public class SignInController {

    private SignInService signInService;

    public SignInController(
            SignInService signInService
    ) {
        this.signInService = signInService;
    }


    @PostMapping("/rest/pt/getUserTypeList")
    public ResponseEntity<Object> getUserTypeList(@RequestBody HashMap<String, Object> userDataMap, HttpServletResponse response) {
        List<PtUsrTpc> ptUsrTpcs = signInService.getUserTypeList(userDataMap);
        return ResponseEntity.ok(ptUsrTpcs);
    }

    @PostMapping("/rest/pt/setUserSessionInfo")
    public ResponseEntity<Object> setUserSessionInfo(@RequestBody HashMap<String, Object> userDataMap,
                                                     HttpServletRequest request, HttpServletResponse response) {
        request=signInService.setUserSessionInfo(userDataMap, request);
        System.out.println(request.getSession().getAttribute("userKey").toString());
        Cookie cookie = new Cookie("userKey", request.getSession().getAttribute("userKey").toString());
        response.addCookie(cookie);
        PtUsrInf ptUsrInf = signInService.getUserInfo(userDataMap);

        return ResponseEntity.ok(ptUsrInf);
    }

    @PostMapping("/rest/pt/checkSession")
    public ResponseEntity<Object> checkSession(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getSession());
        System.out.println(request.getSession().getAttribute("userKey").toString());
        System.out.println(request.getSession().getAttribute("userSessionInfo").toString());
//        System.out.println(request.getAttribute("userKey").toString());
        return ResponseEntity.ok("test complete");
    }




}
