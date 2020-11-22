package com.application.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.equipment.EquipmentEmbeddable;

@Service
public class BookService {

@Autowired
BookRepository bookRepository;

public void saveEntity(String category, String authorName, String bookName, String topic, String equipment ) {
	 BookEntity bookEntity = null;

	 
	   if(category.equals("Science")) {
		   EquipmentEmbeddable equipmentEmbeddable = new EquipmentEmbeddable();
		   equipmentEmbeddable.setEquipmentName(equipment);
		   
		   bookEntity = new ScienceBook();
		   bookEntity.setAuthorName(authorName);
		   bookEntity.setBookName(bookName);
		   bookEntity.setTopic(topic);
		   bookEntity.setEquipmentEmbeddable(equipmentEmbeddable);
		  
	   }else if(category.equals("Novel")){
		   EquipmentEmbeddable equipmentEmbeddable = new EquipmentEmbeddable();
		   equipmentEmbeddable.setEquipmentName(equipment);

		   bookEntity = new NovelBook();
		   bookEntity.setAuthorName(authorName);
		   bookEntity.setBookName(bookName);
		   bookEntity.setTopic(topic);
		   bookEntity.setEquipmentEmbeddable(equipmentEmbeddable);
	   }
	   
	   bookRepository.save(bookEntity);
}

public Iterable<BookEntity>findAll() {
	
	return bookRepository.findAll();
}

	
}
