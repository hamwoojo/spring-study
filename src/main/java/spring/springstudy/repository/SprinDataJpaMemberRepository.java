package spring.springstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springstudy.domain.Member;

import java.util.Optional;

public interface SprinDataJpaMemberRepository extends JpaRepository<Member,Long>,MemberRepository {
    @Override
    Optional<Member> findByName(String name);
}
