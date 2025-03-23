package com.keyin.QAP2.service;

import com.keyin.QAP2.model.Member;
import com.keyin.QAP2.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> getMemberById(Long id){
        return memberRepository.findById(id);
    }

    public Member addMember(Member member){
        return memberRepository.save(member);
    }

    public void deleteMember(Long id){
        memberRepository.deleteById(id);
    }

    public Member updateMember(Long id, Member updatedMember){
        Optional<Member> existingMemberOpt = memberRepository.findById(id);

        if(existingMemberOpt.isPresent()) {
            Member existingMember = existingMemberOpt.get();
            existingMember.setMemberName(updatedMember.getMemberName());
            existingMember.setMemberAddress(updatedMember.getMemberAddress());
            existingMember.setMemberEmail(updatedMember.getMemberEmail());
            existingMember.setMemberPhone(updatedMember.getMemberPhone());
            existingMember.setMembershipStartDate(updatedMember.getMembershipStartDate());
            existingMember.setMembershipDuration(updatedMember.getMembershipDuration());

            return memberRepository.save(existingMember);
        } else {
            return null;
        }

    }
}
