package spring.springstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.springstudy.aop.TimeTraceAop;
import spring.springstudy.repository.JpaMemberRepository;
import spring.springstudy.repository.MemberRepository;
import spring.springstudy.repository.MemoryMemberRepository;
import spring.springstudy.service.MemberService;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {
    private MemberRepository memberRepository;
    public SpringConfig(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);

    }

//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }
}
