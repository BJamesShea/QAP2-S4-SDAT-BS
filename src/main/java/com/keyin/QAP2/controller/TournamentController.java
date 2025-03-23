package com.keyin.QAP2.controller;

import com.keyin.QAP2.model.Tournament;
import com.keyin.QAP2.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

    @RestController
    @RequestMapping("/tournaments")
    public class TournamentController {

        @Autowired
        private TournamentService tournamentService;

        @GetMapping
        public List<Tournament>getAllTournaments(){
            return tournamentService.getAllTournaments();
        }


        @GetMapping("/{id}")
        public Tournament getTournamentById(@PathVariable Long id){
            return tournamentService.getTournamentById(id).orElse(null);

        }

        @PostMapping
        public Tournament createTournament(@RequestBody Tournament tournament){
            return tournamentService.addTournament(tournament);
        }

        @PutMapping("/{id}")
        public Tournament updateTournament(@PathVariable Long id, @RequestBody Tournament tournament){
            return tournamentService.updateTournament(id, tournament);
        }

        @DeleteMapping("/{id}")
        public void deleteTournament(@PathVariable Long id){
            tournamentService.deleteTournament(id);
        }

    } // end

