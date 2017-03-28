package com.sign.record.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sign.record.service.RecordService;

@Controller
public class ModelControl {

	@Autowired
	private RecordService recordService;

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

	@RequestMapping("/put")
	public String put( Model model) {
		return "put";
	}

	@RequestMapping(value = "/statistics")
	public String statistics(Model model) throws Exception {
		// 总正常上班固定工时：fixedhoursSum
		int fixedhoursSum = recordService.fixedhoursSum();
		// 总正常上班实际工时：actualhoursSum
		int actualhoursSum = recordService.actualhoursSum();
		// 总工作日请假固定工时：leaveSum
		int leaveSum = recordService.leaveSum();
		// 总加班实际工时：overSum
		int overSum = recordService.overSum();

		// 总正常上班加班工时：actualhoursSum-fixedhoursSum
		int nationSum = actualhoursSum - fixedhoursSum;
		// 剩余可用加班实际工时：overSum+（actualhoursSum-fixedhoursSum）-leaveSum
		int mainSum = overSum + (actualhoursSum - fixedhoursSum) - leaveSum;

		model.addAttribute("fixedhoursSum", fixedhoursSum);
		model.addAttribute("actualhoursSum", actualhoursSum);
		model.addAttribute("nationSum", nationSum);
		model.addAttribute("leaveSum", leaveSum);
		model.addAttribute("overSum", overSum);
		model.addAttribute("mainSum", mainSum);
		
		
		return "statistics";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) throws Exception {
		
		return "list";
	}

}