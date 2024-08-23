package gil.portfolio.account.service.signInService;

import gil.portfolio.account.entities.PtUsrInf;
import gil.portfolio.account.entities.PtUsrTpc;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
import org.apache.commons.codec.digest.DigestUtils;


import java.nio.charset.StandardCharsets;
import java.util.*;

@Service
public class SignInService {
    SignInUserTypeGetter signInUserTypeGetter;
    SignInUserExistChecker signInUserExistChecker;
    SignInTryCountUpdater signInTryCountUpdater;
    SignInUserInfoGetter signInUserInfoGetter;

    public SignInService(SignInUserTypeGetter signInUserTypeGetter,
                         SignInUserExistChecker signInUserExistChecker,
                         SignInTryCountUpdater signInTryCountUpdater,
                         SignInUserInfoGetter signInUserInfoGetter) {
        this.signInUserTypeGetter = signInUserTypeGetter;
        this.signInUserExistChecker = signInUserExistChecker;
        this.signInTryCountUpdater = signInTryCountUpdater;
        this.signInUserInfoGetter = signInUserInfoGetter;
    }

    public List<PtUsrTpc> getUserTypeList(HashMap<String, Object> userDataMap){
        if(signInUserExistChecker.isExistUser(userDataMap)){
            signInTryCountUpdater.updatePtUsrInfByMbId(userDataMap.get("MB_ID").toString(), "Y");
            return signInUserTypeGetter.getUserTypeList(userDataMap);
        }
        else{
            return null;
        }
    }

    public HttpServletRequest setUserSessionInfo(HashMap<String, Object> userDataMap, HttpServletRequest request){
        PtUsrInf ptUsrInf = signInUserInfoGetter.getUserInfo(userDataMap);
        request.getSession().setAttribute("userSessionInfo", ptUsrInf);
        Random random = new Random();
        random.longs(999999999);
        Long userKeyL = random.nextLong();
        String userKey = userKeyL.toString();
        request.getSession().setAttribute("userKey",userKey);
        return request;
    }

    public PtUsrInf getUserInfo(HashMap<String, Object> userDataMap){
        return signInUserInfoGetter.getUserInfo(userDataMap);
    }


}
