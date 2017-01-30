package art.test.controller;

import art.test.domain.BlogPost;
import art.test.domain.User;
import art.test.service.BlogPostService;
import art.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by art on 11.01.2017.
 */
@Controller
public class BlogPostController {


    @Autowired
    private BlogPostService blogPostService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/saveBlogPost", method = RequestMethod.POST)
    public ModelAndView saveBlogPost(
            @RequestParam(value = "title") String title,
            @RequestParam(value = "content") String content,
            @RequestParam(value = "draft", required = false) boolean draft
    ){
        BlogPost blogPost = new BlogPost();
        blogPost.setTitle(title);
        blogPost.setContent(content);
        blogPost.setPublishDate(new Date());
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userService.findByUsername(name);
        blogPost.setUser(currentUser);
        if(draft) {
            blogPostService.saveAsDraft(blogPost);
        }
        else {
            blogPostService.savePost(blogPost);
        }

        System.out.println("========================================================================================");

        List<BlogPost> blogPosts = blogPostService.findAllByUserAndDraft(currentUser, true);
        if(blogPosts!=null) {
            System.out.println(blogPosts.size());
        }
        System.out.println("========================================================================================");



        return new ModelAndView("newBlogPost", "message", "The BlogPost is saved");
    }

    @RequestMapping(value = "/blogposts", method = RequestMethod.GET)
    @Secured("ROLE_USER")
    public ModelAndView blogposts() {
        ModelAndView model = new ModelAndView();
        List<BlogPost> blogposts = blogPostService.findAll();
        model.addObject("blogposts", blogposts);
        model.setViewName("blogposts");
        return model;
    }
}
