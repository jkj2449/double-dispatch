package dispatch.posts;

import dispatch.sns.SNS;

public interface Post {
    void postOn(SNS sns);
}
