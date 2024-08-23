package gil.portfolio.account.service.signInService;

import gil.portfolio.account.entities.PtUsrInf;
import gil.portfolio.account.repository.PtUsrInfRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class SignInUserInfoGetter {
    private PtUsrInfRepository ptUsrInfRepository;

    public SignInUserInfoGetter(PtUsrInfRepository ptUsrInfRepository) {
        this.ptUsrInfRepository = ptUsrInfRepository;
    }

    public PtUsrInf getUserInfo(HashMap<String, Object> userDataMap){
        PtUsrInf ptUsrInf = ptUsrInfRepository.findAllByMbId(userDataMap.get("MB_ID").toString());
        return ptUsrInf;
    }
}
