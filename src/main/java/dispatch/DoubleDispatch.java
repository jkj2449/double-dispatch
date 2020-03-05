package dispatch;

import dispatch.posts.Picture;
import dispatch.posts.Post;
import dispatch.posts.Text;
import dispatch.sns.Facebook;
import dispatch.sns.SNS;
import dispatch.sns.Twitter;

import java.util.Arrays;
import java.util.List;

public class DoubleDispatch {

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Twitter());

        posts.forEach(p -> sns.forEach(p::postOn));
    }
}
