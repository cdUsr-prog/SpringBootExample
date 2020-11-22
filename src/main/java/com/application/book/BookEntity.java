package com.application.book;






import java.time.LocalDate;

import javax.persistence.*;

import com.application.equipment.EquipmentEmbeddable;

@Entity
@EntityListeners({BookEventListener.class})
public class BookEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "bookName")
	private String bookName;

	@Column(name = "authorName")
	private String authorName;

	@Column(name = "topic")
	private String topic;
	
	@Column(name = "date")
	private LocalDate localDate;


	@Embedded
	private EquipmentEmbeddable equipmentEmbeddable;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}



	public EquipmentEmbeddable getEquipmentEmbeddable() {
		return equipmentEmbeddable;
	}

	public void setEquipmentEmbeddable(EquipmentEmbeddable equipmentEmbeddable) {
		this.equipmentEmbeddable = equipmentEmbeddable;
	}

	public long getId() {
		return id;
	}
	
	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	
}
