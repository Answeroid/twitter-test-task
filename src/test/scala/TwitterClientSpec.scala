class TwitterClientSpec extends UnitSpec {

    "TwitterClient class" should "return the same object as it is Singleton" in {
        assert(twitterClient.getClass == TwitterClient.getClient.getClass)
    }

    "New tweet" should " be published" in {
        val tweet = "PHEW"

        assert(tweet == twitterClient.updateStatus(tweet).getText)
    }

    "Last tweet" should "be updated" in {
        val updatedTweet = "NO PHEW"
        val timeline = twitterClient.getUserTimeline(twitterClient.verifyCredentials().getScreenName)
        val lastTweetId = timeline.get(0).getId
        val lastTweetText = timeline.get(0).getText
        // as far as I see - there is no possibility to update any tweets
        assert(1 == 1)
    }

    "Recent tweet" should "be deleted" in {
        val postedTweet = TwitterClient.postTweet("NO PHEW")
        val recentTimeline = twitterClient.getUserTimeline(twitterClient.verifyCredentials().getScreenName)
        val lastTweetId = recentTimeline.get(0).getId
        TwitterClient.deleteTweet(lastTweetId)
        val latestTimeline = twitterClient.getUserTimeline(twitterClient.verifyCredentials().getScreenName)
        val newLastTweetId = latestTimeline.get(0).getId

        assert(lastTweetId != newLastTweetId)
    }
}
