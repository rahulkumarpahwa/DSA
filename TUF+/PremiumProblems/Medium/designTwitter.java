// https://takeuforward.org/plus/dsa/problems/design-twitter
class Twitter {
  List<List<Integer>> tweet; // userId and tweetId as a pair
  List<List<Integer>> follow; // userId and followedId as a pair

  public Twitter() {
    tweet = new ArrayList<>();
    follow = new ArrayList<>();
  }

  public void postTweet(int userId, int tweetId) {
    if (tweet.size() != 0) {
      List<Integer> lastTweet = tweet.get(tweet.size() - 1);
      if (lastTweet.get(1) != tweetId) {
        List<Integer> tw = new ArrayList<>();
        tw.add(userId);
        tw.add(tweetId);
        tweet.add(tw);
        return;
      }
    } else {
      List<Integer> tw = new ArrayList<>();
      tw.add(userId);
      tw.add(tweetId);
      tweet.add(tw);
      return;
    }
  }

  public List<Integer> getNewsFeed(int userId) {
    List<Integer> res = new ArrayList<>();

    List<Integer> friendList = new ArrayList<>();
    for (List<Integer> list : follow) {
      if (list.get(0) == (userId)) {
        friendList.add(list.get(1));
      }
    }
    // adding your tweets:
    for (int i = tweet.size()-1; i>=0; i--) {
      if (res.size()!= 10 && (tweet.get(i).get(0) == userId || friendList.contains(tweet.get(i).get(0)))) {
        res.add(tweet.get(i).get(1));
      }
    }
    return res;
  }

  public void follow(int followerId, int followeeId) {
    if (followerId != followeeId) {
      List<Integer> list = new ArrayList<>();
      list.add(followerId);
      list.add(followeeId);
      follow.add(list);
    }
    return;
  }

  public void unfollow(int followerId, int followeeId) {
    Iterator<List<Integer>> it = follow.iterator();
    while (it.hasNext()) {
      List<Integer> relationship = it.next();
      if (relationship.get(0) == followerId && relationship.get(1) == followeeId) {
        it.remove();
        break;
      }
    }
  }
}
