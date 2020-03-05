package dispatch.sns;

import dispatch.posts.Picture;
import dispatch.posts.Text;

public class Facebook implements SNS {

    @Override
    public void postOn(Text post) {
        System.out.println("text-facebook");
    }

    @Override
    public void postOn(Picture post) {
        System.out.println("picture-facebook");
    }
}
