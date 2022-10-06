package com.spring.springProject.Author;
import com.spring.springProject.AuthorRegistration.AuthorR;
import com.spring.springProject.AuthorRegistration.AuthorRRepository;
import com.spring.springProject.Category.Category;
import com.spring.springProject.Category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;



@Controller
public class AuthorController {


    @Autowired
    private AuthorRepository authorRepo;


    @Autowired
    private AuthorRRepository authorRRepo;
    @Autowired
    private CategoryRepository categoryRepo;

    @GetMapping("/authors")
    public String showAuthorList(Model model) {
        List<Author> listAuthors = authorRepo.findAll();

        model.addAttribute("listAuthors", listAuthors);

        return "authors";
    }
    @GetMapping("/")
    public String showhome(Model model) {

        return "index";
    }

    @GetMapping("/authors/new")
    public String showCreateAuthorForm(Model model) {
        List<Category> listCategories = categoryRepo.findAll();
        model.addAttribute("listCategories", listCategories);
        model.addAttribute("author", new Author());
        model.addAttribute("authorR", new AuthorR());
        return "author_form";
    }

    @PostMapping("authors/save")
    public String saveAuthor(Author author, @ModelAttribute AuthorR authorR) {

        if(authorR.getRegisnum() == ""){
            authorRepo.save(author);
        }
        else{
            AuthorR tempt =  authorRRepo.save(authorR);
            author.setAuthorR(tempt);
            authorRepo.save(author);
        }


        return "redirect:/authors";
    }

}