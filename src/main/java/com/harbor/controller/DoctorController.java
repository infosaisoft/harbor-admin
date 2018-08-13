package com.harbor.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.harbor.dto.DoctorDto;
import com.harbor.service.DoctorService;
import com.harbor.vo.DoctorCommand;

@Controller
public class DoctorController {

	@Autowired
	DoctorService service;

	@RequestMapping(value = "/doctor", method = RequestMethod.GET)
	public String showPatient(Map<String, Object> map, @ModelAttribute("doctorAdd") DoctorCommand doctorAdd) {
		return "doctor";
	}

	@RequestMapping(value = "/doctor", method = RequestMethod.POST)

	public String registrationPatientt(Map<String, Object> map, @ModelAttribute("doctorAdd") DoctorCommand doctorAdd) {
		DoctorDto dto = null;
		String result = null;
		dto = new DoctorDto();
		MultipartFile file = null;
		String fname = null;
		OutputStream os = null;
		InputStream is = null;

		// get the names of the uploaded files
		System.out.println("doctor controller");
		System.out.println(doctorAdd.getPassport());
		file = doctorAdd.getPassport();
		System.out.println(file);
		fname = file.getOriginalFilename();

		try {

			// create OutputStreams pointing to dest files on server machine file system
			is = file.getInputStream();
			System.out.println(fname);
			os = new FileOutputStream("d:\\assert\\uploads\\doctors\\" + fname);
			System.out.println("file os " + os);

			// perform file copy operation to complete FileUploading
			IOUtils.copy(is, os);

		}

		catch (IOException io) {
			io.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			// close all stram
			try {
				if (os != null) {
					os.close();
				}

			} catch (IOException io) {
				io.printStackTrace();
			}

			try {
				if (is != null) {
					is.close();
				}

			} catch (IOException io) {
				io.printStackTrace();
			}

		}

		dto.setPassport(fname);
		// copy cmd to dto
		BeanUtils.copyProperties(doctorAdd, dto);
		System.out.println(dto);
		// use service
		result = service.registrationDoctor(dto);
		map.put("result", result);
		return "doctor";
	}

	@RequestMapping(value = "getdoctor", method = RequestMethod.GET)
	public String getAllDoctor(Map<String, Object> map, String fname, HttpServletResponse res) {
		List<DoctorDto> listdto = null;
		List<String> list = null;
		InputStream is = null;
		OutputStream os = null;
		// use service
		listdto = service.featchAll();
		list = service.getAllFile();
		System.out.println(listdto);
		map.put("listdto", listdto);
		return "getdoctor";
	}

	@RequestMapping(value = "/edit_doctor", method = RequestMethod.GET)
	public String editDoctro(Map<String, Object> map, @ModelAttribute("doctorAdd") DoctorCommand doctorAdd,
			HttpServletRequest req) {
		DoctorDto dto = null;
		int sno = 0;
		// copy cmd to dto
		dto = new DoctorDto();
		BeanUtils.copyProperties(doctorAdd, dto);
		// sno=dto.getId();
		sno = Integer.parseInt(req.getParameter("id"));
		dto = service.featchBySno(sno);
		System.out.println("controller::" + dto.getPincode());
		System.out.println(dto.getState());
		map.put("dto", dto);
		return "edit";
	}

	@RequestMapping(value = "/edit_doctor", method = RequestMethod.POST)
	public String updateDoctor(Map<String, Object> map, @ModelAttribute("doctorAdd") DoctorCommand doctorAdd) {
		DoctorDto dto = null;
		String result = null;
		List<DoctorDto> listdto;
		// copy cmd to dto
		dto = new DoctorDto();
		BeanUtils.copyProperties(doctorAdd, dto);

		// use service
		result = service.modifieDoctor(dto);
		listdto = service.featchAll();
		map.put("result", result);
		map.put("listdto", listdto);
		return "getdoctor";
	}

	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteDoctor(Map<String, Object> map, @ModelAttribute("doctorAdd") DoctorCommand doctorAdd,HttpServletRequest req) {
		String delete=null;
		List<DoctorDto>listdto=null;
		int id=Integer.parseInt(req.getParameter("id"));
		
		//use service
		delete=service.removeDoctro(id);
		
		listdto=service.featchAll();
		map.put("delete", delete);
		map.put("listdto", listdto);
		  return "getdoctor";
	}
}
