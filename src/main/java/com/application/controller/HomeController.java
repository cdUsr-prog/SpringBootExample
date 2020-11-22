package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.application.book.BookEntity;
import com.application.book.BookService;



@Controller
public class HomeController {

	
	@Autowired
	BookService bookService;
	
	
	
   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @RequestMapping("/bucketList")
   public String bucketList(@RequestParam("category") String category, @RequestParam("authorName") String authorName, @RequestParam("bookName") String bookName, 
    @RequestParam("topic") String topic, @RequestParam("equipment") String equipment,Model model) {

	   
	   bookService.saveEntity(category, authorName, bookName, topic, equipment);

	   List<BookEntity> bookEntityList = (List<BookEntity>) bookService.findAll();
	   model.addAttribute("authorName", bookEntityList.get(bookEntityList.size()-1).getAuthorName());
	   model.addAttribute("bookName", bookEntityList.get(bookEntityList.size()-1).getBookName());
	   model.addAttribute("topic", bookEntityList.get(bookEntityList.size()-1).getTopic());
	   
	   model.addAttribute("equipment", bookEntityList.get(bookEntityList.size()-1).getEquipmentEmbeddable().getEquipmentName());

	   model.addAttribute("orderedNumber", bookEntityList.size());
	   model.addAttribute("orderDate", bookEntityList.get(bookEntityList.size()-1).getLocalDate());

      return "bucket_list";
   }
   

   
}
