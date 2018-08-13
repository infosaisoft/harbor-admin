package com.harbor.pagenation;

import org.springframework.beans.support.PagedListHolder;

import com.harbor.dto.DiseasesDto;

public class Pagenation {
	
	public static  void printPageDetalis(PagedListHolder pagelist) {
		
		pagelist.getPage();
		pagelist.getPageCount();
		pagelist.isFirstPage();
		pagelist.isLastPage();
	}

}
