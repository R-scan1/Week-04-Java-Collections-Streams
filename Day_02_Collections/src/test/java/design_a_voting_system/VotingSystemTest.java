package design_a_voting_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {
    private VotingSystem votingSystem;

    @BeforeEach
    void setUp() {
        votingSystem = new VotingSystem();

        votingSystem.castVote("Raj");
        votingSystem.castVote("Manish");
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Bhuri");
        votingSystem.castVote("Durga");
        votingSystem.castVote("Akash");
        votingSystem.castVote("Raj");
    }

    @Test
    void testGetWinner() {
        assertEquals("Raj", votingSystem.getWinner(), "Raj should be the winner with 2 votes.");
    }

    @Test
    void testVotesInOrder() {
        votingSystem.castVote("NewCandidate");
        votingSystem.displayVotesInOrder();
    }

    @Test
    void testSortedVotes() {
        votingSystem.displaySortedVotes();
    }
}
