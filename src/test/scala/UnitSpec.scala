import org.scalatest._
import twitter4j.Twitter


class UnitSpec extends FlatSpec with Matchers with
    OptionValues with Inside with Inspectors with BeforeAndAfter {

    var twitterClient: Twitter = TwitterClient.getClient
}
