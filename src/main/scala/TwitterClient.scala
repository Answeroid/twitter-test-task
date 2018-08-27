import com.danielasfregola.twitter4s.TwitterRestClient
import com.danielasfregola.twitter4s.entities.{AccessToken, ConsumerToken}


object TwitterClient {

    def main(args : Array[String]) {

        val consumerToken = ConsumerToken(key = "cons-access-token", secret = "cons-access-key")
        val accessToken = AccessToken(key = "my-access-key", secret = "my-access-secret")
        val client = new TwitterRestClient(consumerToken, accessToken)

        client.createTweet("test status of newly created tweet")
        client.deleteTweet(12312311123121L)

        // to be continued
    }
}
