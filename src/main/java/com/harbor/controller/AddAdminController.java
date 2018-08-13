package com.harbor.controller;

public class AddAdminController {
	
	@Autowired
	AddAdminService service;
	@RequestMapping(value="/Add-Admin", method=RequestMethod.GET)
	public String showLoginPage(@ModelAttribute("AddAdmin") AddAdminCommand AddAdmin) {
		return "Add-Admin";
	}
	
	@RequestMapping(value="/Add-Admin", method=RequestMethod.POST)
	public String postLoginPage(Map<String,Object>map,@Valid @ModelAttribute("AddAdmin") AddAdminCommand AddAdmin,Errors error) {
		String result=null;
		if(error.hasErrors()) {
			return "Add-Admin";
		}
		AddAdminDTO addAdmindto = null;
		addAdmindto = new AddAdminDTO();
		
		BeanUtils.copyProperties(AddAdmin, addAdmindto);
		result=service.insertAdmin(addAdmindto);
		map.put("result", result);
		return "Add-Admin";
	}

}
