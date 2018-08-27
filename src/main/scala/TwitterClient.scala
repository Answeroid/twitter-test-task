import twitter4j.TwitterFactory
import twitter4j.Twitter
import twitter4j.conf.ConfigurationBuilder


object TwitterClient {

    def main(args : Array[String]) {

        // (1) config work to create a twitter object
        val cb = new ConfigurationBuilder
        cb.setDebugEnabled(true)
            .setOAuthConsumerKey("YOUR KEY HERE")
            .setOAuthConsumerSecret("YOUR SECRET HERE")
            .setOAuthAccessToken("YOUR ACCESS TOKEN")
            .setOAuthAccessTokenSecret("YOUR ACCESS TOKEN SECRET")
        val tf = new TwitterFactory(cb.build)
        val twitter = tf.getInstance

        val statuses = twitter.getFriendsTimeline
        println("Showing friends timeline.")
        val it = statuses.iterator
        while (it.hasNext()) {
            val status = it.next
            println(status.getUser.getName + ":" + status.getText);
        }
    }
}
