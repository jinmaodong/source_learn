/**  
* <p>Title: ReadingListController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-10-14  
* @version 1.0  
*/  
package com.mdjin.readinglist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mdjin.readinglist.dto.Book;
import com.mdjin.readinglist.mapper.ReadingListRepository;

/**  
* <p>Title: ReadingListController</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-10-14  
*/
@Controller
@RequestMapping("/readingList")
public class ReadingListController {

	@Autowired
	private ReadingListRepository readingListRepository;

	/**  
	 * <p>Title: readerBooks</p>  
	 * <p>Description: </p>  
	 * @param reader
	 * @param model
	 * @return  
	 */  
	@RequestMapping(value="/{reader}",method=RequestMethod.GET)
	public String readerBooks(@PathVariable("reader") String reader,Model model) {
		List<Book> readingList = readingListRepository.findByReader(reader);
		if(readingList != null) {
			model.addAttribute("books",readingList);
		}
		return "readingList";
	}

	@RequestMapping(value="/{reader}",method=RequestMethod.POST)
	public String addToReadingList(@PathVariable("reader") String reader,Book book) {
		book.setReader(reader);
		readingListRepository.save(book);
		return "redirect:/readingList/{reader}";
	}

	
}
