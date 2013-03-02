package ly.jamie.fffffffuuuuuuuuuuuu.test;

import java.net.URL;

import junit.framework.TestCase;
import ly.jamie.fffffffuuuuuuuuuuuu.ImgurExtractor;

public class ImgurExtractorTest extends TestCase {
	public void testLinkExtraction() {
		String text = "submitted by <a href=\"http://www.reddit.com/user/rootkanal\"> rootkanal </a> <br/> <a href=\"http://imgur.com/1BYW0TI\">[link]</a> <a href=\"http://www.reddit.com/r/fffffffuuuuuuuuuuuu/comments/17n2c7/found_a_cockroach_in_my_room/\">[180 comments]</a>";
		ImgurExtractor extractor = new ImgurExtractor(text);
		URL url = extractor.extract();
		assertEquals(url.toString(), "http://imgur.com/1BYW0TI.png");
	}
}
