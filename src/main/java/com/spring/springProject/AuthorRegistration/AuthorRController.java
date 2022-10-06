package com.spring.springProject.AuthorRegistration;


import com.spring.springProject.Category.Category;
import com.spring.springProject.Category.CategoryRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Controller
public class AuthorRController {

        @Autowired
        private AuthorRRepository repo;

        @Autowired
        private AuthorRRepository authorRRepo;


        @GetMapping("/authorsR")
        public String showAuthorList(Model model) {
            List<AuthorR> showAuthorList = authorRRepo.findAll();

            model.addAttribute("AuthorList", showAuthorList);



            return "authorR";
        }

        @GetMapping("/authorsR/new")
        public String showCreateAuthorForm(Model model) {
            List<AuthorR> showAuthorList =  authorRRepo.findAll();
            model.addAttribute("AuthorList", showAuthorList);
            model.addAttribute("authorR", new AuthorR());
            return "authorR_form";
        }

        @PostMapping("authorsR/save")
        public String saveAuthor(AuthorR author) {
            authorRRepo.save(author);

            return "redirect:/authorsR";
        }

    }

