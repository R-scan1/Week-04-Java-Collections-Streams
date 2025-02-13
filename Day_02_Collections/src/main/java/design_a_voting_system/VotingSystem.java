package design_a_voting_system;

import java.util.*;

public class VotingSystem {
    private final Map<String, Integer> voteMap = new HashMap<>();
    private final Map<String, Integer> orderedVoteMap = new LinkedHashMap<>();
    private final TreeMap<String, Integer> sortedVoteMap = new TreeMap<>();

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0) + 1);
        sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayVotesInOrder() {
        System.out.println("\nVotes in Order of Voting:");
        orderedVoteMap.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes));
    }

    public void displaySortedVotes() {
        System.out.println("\nVotes Sorted by Candidate Name:");
        sortedVoteMap.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes));
    }

    public String getWinner() {
        return Collections.max(voteMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public void displayResults() {
        displayVotesInOrder();
        displaySortedVotes();
        System.out.println("\nWinner: " + getWinner());
    }
}
