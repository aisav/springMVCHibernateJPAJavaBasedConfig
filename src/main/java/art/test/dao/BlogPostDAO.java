package art.test.dao;

import art.test.domain.BlogPost;
import art.test.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by art on 27.12.2016.
 */
public interface BlogPostDAO extends CrudRepository<BlogPost, Long> {

    List<BlogPost> findAllBlogPostsByUserAndTitleContaining(User user, String title);
    List<BlogPost> findAllBlogPostsByUserAndDraft(User user, boolean draft);

}
