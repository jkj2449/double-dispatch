package dispatch.posts;

import dispatch.sns.SNS;

public class Picture implements Post {
    @Override
    public void postOn(SNS sns) {
        sns.postOn(this);
    }
}
