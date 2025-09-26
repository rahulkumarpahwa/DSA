// https://takeuforward.org/plus/dsa/problems/design-a-leaderboard

// brute solution:
class Leaderboard {
  HashMap<Integer, Integer> board;

  public Leaderboard() {
    board = new HashMap<>();
  }

  public void addScore(int playerId, int score) {
    board.put(playerId, board.getOrDefault(playerId, 0) + score);
  }

  public int top(int K) {
    int sum = 0;
    ArrayList<Integer> temp = new ArrayList<>();
    if (K <= board.size()) {
      for (Map.Entry<Integer, Integer> entry : board.entrySet()) {
        temp.add(entry.getValue());
      }
      Collections.sort(temp, Collections.reverseOrder());
      for (int i = 0; i < K; i++) {
        sum += temp.get(i);
      }
    }
    return sum;
  }

  public void reset(int playerId) {
    if (this.board.containsKey(playerId)) {
      board.replace(playerId, 0);
    }
  }
}

/**
 * Your Leaderboard object will be instantiated and called as such: Leaderboard obj = new
 * Leaderboard(); obj.addScore(playerId,score); int param_2 = obj.top(K); obj.reset(playerId);
 */
