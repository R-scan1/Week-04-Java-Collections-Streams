package design_a_voting_system;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Raj");
        votingSystem.castVote("Manish");
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Bhuri");
        votingSystem.castVote("Durga");
        votingSystem.castVote("Akash");
        votingSystem.castVote("Raj");

        votingSystem.displayResults();
    }
}
