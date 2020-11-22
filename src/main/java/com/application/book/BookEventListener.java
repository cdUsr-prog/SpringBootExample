package com.application.book;



import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.persister.entity.EntityPersister;

import org.springframework.stereotype.Component;
@Component
public class BookEventListener implements PostInsertEventListener{

	@Override
	public boolean requiresPostCommitHanding(EntityPersister persister) {
		
		return false;
	}

	@Override
	public void onPostInsert(PostInsertEvent event) {
		LocalDate localDate = LocalDate.now();
		BookEntity bookEntityList = (BookEntity) event.getEntity();
		bookEntityList.setLocalDate(localDate);
			
	}


	

	
}
