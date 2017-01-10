package art.test.service;


import art.test.domain.BlogPost;
import art.test.domain.User;

import java.util.List;

/**
 * Created by art on 18.12.2016.
 */
public interface BlogPostService {

    void savePost(BlogPost blogPost);
    void saveAsDraft(BlogPost blogPost);
    void deletePost(BlogPost blogPost);
    List<BlogPost> findAllByUserAndDraft(User user, boolean draft);
}
