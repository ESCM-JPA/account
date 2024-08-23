package gil.portfolio.account.service.signInService;

import gil.portfolio.account.entities.PtUsrInf;
import gil.portfolio.account.entities.PtUsrInf_;
import gil.portfolio.account.repository.PtUsrInfRepository;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Component;

@Component
public class SignInTryCountUpdater {
    private PtUsrInfRepository ptUsrInfRepository;

    public SignInTryCountUpdater(PtUsrInfRepository ptUsrInfRepository) {
        this.ptUsrInfRepository = ptUsrInfRepository;
    }

    public void updatePtUsrInfByMbId(String mbId, String transYn){
//        ptUsrInfRepository.updatePtUsrInfByMbId(mbId,0);
        PtUsrInf ptUsrInf=ptUsrInfRepository.findAllByMbId(mbId);
        ptUsrInf.setLginTry(0);
        ptUsrInfRepository.save(ptUsrInf);

    }
}
