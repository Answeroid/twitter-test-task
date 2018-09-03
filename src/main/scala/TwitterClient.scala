import twitter4j.{Status, Twitter, TwitterFactory}
import twitter4j.conf.ConfigurationBuilder

import scala.util.Properties


object TwitterClient extends App {

    def twitterClient: Twitter = initiateClient

    private def initiateClient: Twitter = {
        val cb = new ConfigurationBuilder
        cb.setDebugEnabled(true)
            .setOAuthConsumerKey(Properties.envOrElse("TWITTER_CONSUMER_TOKEN_KEY", ""))
            .setOAuthConsumerSecret(Properties.envOrElse("TWITTER_CONSUMER_TOKEN_SECRET", ""))
            .setOAuthAccessToken(Properties.envOrElse("TWITTER_ACCESS_TOKEN_KEY", ""))
            .setOAuthAccessTokenSecret(Properties.envOrElse("TWITTER_ACCESS_TOKEN_SECRET", ""))
        val tf = new TwitterFactory(cb.build)
        val twitter: Twitter = tf.getInstance
        twitter
    }

    def getClient: Twitter = {
        twitterClient
    }

    def postTweet(tweet: String): Status = {
        twitterClient.updateStatus(tweet)
    }

    def deleteTweet(id: Long): Unit = {
        twitterClient.destroyStatus(id)
    }
}
