package gil.portfolio.account.service.signInService;

public class SignInFailureService {

}
/*
Check your persistence.xml or application.yml. Make sure that you have correctly listed the entity PtUsrInf in your persistence unit or under spring.jpa.properties.jakarta.persistence.metamodel.generator.include in case of application.yml.
        Check if you are using correct imports. Make sure that you are using jakarta.persistence.Entity and not any other Entity import.
Check for any named queries. If you have any named queries for PtUsrInf, make sure that the syntax is correct and the named query does not contain any errors.
Restart your server. Often, such issues can also be solved by restarting the server. If you have updated your JPA entities, the server might still be holding old bytecode in memory. Restarting your server can solve this issue.
Check classpath for multiple versions of JPA libraries. You should check your classpath to ensure there are not multiple versions of JPA or conflicting JPA providers.
Please let me know if you have any questions or if the issue persists.*/
