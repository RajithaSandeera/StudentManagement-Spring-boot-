package com.spring.springProject;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class CategoryRepositoryTests {

//    @Autowired
//    private CategoryRepository repo;
//
//    @Test
//    public void testCreateCategory(){
//           category savecategory =  repo.save(new category("Electronics"));
//
//           assertThat(savecategory.getId()).isGreatThan(0);
//    }
//}
