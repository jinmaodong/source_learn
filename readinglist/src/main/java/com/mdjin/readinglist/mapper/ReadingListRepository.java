/**  
* <p>Title: ReadingListRepository.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-10-14  
* @version 1.0  
*/  
package com.mdjin.readinglist.mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdjin.readinglist.dto.Book;

/**  
* <p>Title: ReadingListRepository</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-10-14  
*/
public interface ReadingListRepository extends JpaRepository<Book,Long>{
	
	List<Book> findByReader(String reader);
}
