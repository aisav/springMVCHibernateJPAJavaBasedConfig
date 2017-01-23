package art.test.service.impl;

import art.test.dao.BlogPostDAO;
import art.test.dao.UserDAO;
import art.test.domain.BlogPost;
import art.test.domain.User;
import art.test.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;
import java.util.List;

/**
 * Created by art on 18.12.2016.
 */
public class BlogPostServiceImpl implements BlogPostService {

    @Autowired
    private BlogPostDAO blogPostDAO;

    @Autowired
    private UserDAO userDAO;

    @Override
    public void savePost(BlogPost blogPost) {

        blogPost.setPublishDate(new Date());
        blogPostDAO.save(blogPost);

    }

    @Override
    public void saveAsDraft(BlogPost blogPost) {

        blogPost.setDraft(true);
        blogPostDAO.save(blogPost);

    }

    @Override
    public void deletePost(BlogPost blogPost) {

        blogPostDAO.delete(blogPost);
    }

    @Override
    public List<BlogPost> findAll() {


        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userDAO.findUserByUsername(name);
        return blogPostDAO.findAllBlogPostsByUser(currentUser);
    }

    @Override
    public List<BlogPost> findLatest5() {
        return null;
    }

    @Override
    public BlogPost findById(Long id) {
        return null;
    }

    @Override
    public BlogPost create(BlogPost post) {
        return null;
    }

    @Override
    public BlogPost edit(BlogPost post) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<BlogPost> findAllByUserAndDraft(User user, boolean draft) {
        return blogPostDAO.findAllBlogPostsByUserAndDraft(user, draft);
    }
}
