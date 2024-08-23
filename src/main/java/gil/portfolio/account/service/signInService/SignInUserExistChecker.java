package gil.portfolio.account.service.signInService;

import gil.portfolio.account.repository.PtUsrInfRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class SignInUserExistChecker {
    private PtUsrInfRepository ptUsrInfRepository;

    public SignInUserExistChecker(PtUsrInfRepository ptUsrInfRepository) {
        this.ptUsrInfRepository = ptUsrInfRepository;
    }

    public Boolean isExistUser(HashMap<String, Object> userDataMap){
        String mbId=userDataMap.get("MB_ID").toString();
        String mbPw=userDataMap.get("MB_PW").toString();
        Integer userCount = ptUsrInfRepository.countPtUsrInfByMbIdAndMbPw(mbId, mbPw);
        if(userCount == 0){
            return false;
        }else{
            return true;
        }
    }

}
