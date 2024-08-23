package gil.portfolio.account.service.signInService;

import gil.portfolio.account.entities.PtUsrInf;
import gil.portfolio.account.entities.PtUsrTpc;
import gil.portfolio.account.repository.PtUsrInfRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class SignInUserTypeGetter {

    private PtUsrInfRepository ptUsrTpcRepository;

    public SignInUserTypeGetter(PtUsrInfRepository ptUsrTpcRepository) {
        this.ptUsrTpcRepository = ptUsrTpcRepository;
    }

    public List<PtUsrTpc> getUserTypeList(HashMap<String, Object> userDataMap) {
        PtUsrInf ptUsrInf = ptUsrTpcRepository.findAllByMbId(userDataMap.get("MB_ID").toString());
        List<PtUsrTpc> usrTpcs = ptUsrInf.getPtUsrTpc();
        return usrTpcs;
    }
}
