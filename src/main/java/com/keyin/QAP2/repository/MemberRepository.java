package com.keyin.QAP2.repository;
import com.keyin.QAP2.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // custom query's i.e findByEmail etc.

}
