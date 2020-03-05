package dispatch.sns;

import dispatch.posts.Picture;
import dispatch.posts.Text;

public interface SNS {
    void postOn(Text post);

    void postOn(Picture post);

}
