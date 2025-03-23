package com.keyin.QAP2.service;

import com.keyin.QAP2.model.Member;
import com.keyin.QAP2.model.Tournament;
import com.keyin.QAP2.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TournamentService {


    @Autowired
    private TournamentRepository tournamentRepository;

    public List<Tournament> getAllTournaments(){
        return tournamentRepository.findAll();
    }

    public Optional<Tournament> getTournamentById(Long id){
        return tournamentRepository.findById(id);
    }

    public Tournament addTournament(Tournament tournament){
        return tournamentRepository.save(tournament);
    }

    public Tournament updateTournament(Long id, Tournament updatedTournament){
        Optional<Tournament> existingTournamentOpt = tournamentRepository.findById(id);

        if(existingTournamentOpt.isPresent()){
            Tournament existingTournament = existingTournamentOpt.get();
            existingTournament.setLocation(updatedTournament.getLocation());
            existingTournament.setStartDate(updatedTournament.getStartDate());
            existingTournament.setEndDate(updatedTournament.getEndDate());
            existingTournament.setEntryFee(updatedTournament.getEntryFee());
            existingTournament.setCashPrize(updatedTournament.getCashPrize());

            return tournamentRepository.save(existingTournament);
        } else {
            return null;
        }
    }

    public void deleteTournament(Long id){
        tournamentRepository.deleteById(id);
    }

    public Tournament assignMemberToTournament(Long tournamentId, Member member){
        Optional<Tournament> tournamentOpt = tournamentRepository.findById(tournamentId);

        if(tournamentOpt.isPresent()){
            Tournament tournament = tournamentOpt.get();
            tournament.getParticipatingMembers().add(member);
            return tournamentRepository.save(tournament);
        } else {
            return null;
        }

    }

}
