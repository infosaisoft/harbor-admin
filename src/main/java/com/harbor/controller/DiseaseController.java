package com.harbor.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.harbor.dto.DiseasesDto;

import com.harbor.service.DiseasesService;
import com.harbor.vo.DiseaseCommand;

@Controller
public class DiseaseController {
	@Autowired
	DiseasesService service;

	@RequestMapping(value = "/adddisease", method = RequestMethod.GET)
	public String showpage(@ModelAttribute("disease") DiseaseCommand disease) {
		return "add_disease";
	}

	@RequestMapping(value = "/adddisease", method = RequestMethod.POST)
	public String registraton(Map<String, Object> map, @ModelAttribute("disease") DiseaseCommand disease)
			throws Exception {
		DiseasesDto dto = null;
		String result = null;
		// copy cmd to dto
		dto = new DiseasesDto();
		
		BeanUtils.copyProperties(disease, dto);
		result = service.registrar(dto);
		map.put("result", result);
		return "add_disease";
	}

	@RequestMapping(value ="getall", method = RequestMethod.GET)
	public String getAllDisease(Map<String,Object>map) {
		List<DiseasesDto> listdto = null;
		
		System.out.println("getall controller");
		     listdto=service.featchall();
				map.put("listdto", listdto);
	        
		return "list_all_diseases";
	}

	@RequestMapping(value = "/edit_diseases", method = RequestMethod.GET)
	 public String editDisease(Map<String,Object>map,@ModelAttribute("editdisease") DiseaseCommand editdisease){
		DiseasesDto dto=null;
		//copy cmd to dto
		dto=new DiseasesDto();
		BeanUtils.copyProperties(editdisease, dto);
		int sno=dto.getSno();
		dto=service.featchDiseasesbysno(sno);
		  map.put("dto", dto);
		return "edit_diseases";
	}
	
	@RequestMapping(value = "/edit_diseases", method = RequestMethod.POST)
	public String processEdit(Map<String,Object>map ,@ModelAttribute("editdisease") DiseaseCommand editdisease) {
		String updatemsg=null;
		List<DiseasesDto>listdto=null;
		DiseasesDto dto=null;
		//copuy cmd to dto
		dto=new DiseasesDto();
		BeanUtils.copyProperties(editdisease, dto);
		//use service
		updatemsg=service.ModifyDisease(dto);
		listdto=service.featchall();
		map.put("listdto", listdto);
		map.put("updatemsg", updatemsg);
		
		return"list_all_diseases";
	}
	
	
		@RequestMapping(value = "/delete_diseases", method = RequestMethod.GET)
	public String delleteDisease(HttpServletRequest req, Map<String, Object> map) {
		String delete = null;
		List<DiseasesDto>listdto=null;
		int sno = Integer.parseInt(req.getParameter("sno"));
		//use service
		delete = service.removeDisease(sno);
		listdto=service.featchall();
		
		map.put("listdto", listdto);
		map.put("delete", delete);
		return "list_all_diseases";
	}
		
		
	

}
