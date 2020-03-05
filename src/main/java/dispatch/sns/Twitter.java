package dispatch.sns;

import dispatch.posts.Picture;
import dispatch.posts.Text;

public class Twitter implements SNS {

    @Override
    public void postOn(Text post) {
        System.out.println("text-twitter");
    }

    @Override
    public void postOn(Picture post) {
        System.out.println("picture-twitter");
    }
}
