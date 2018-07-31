package Controllers;

import Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import entity.MyInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class InterfaceController {
	@Resource
	private InterfaceService service;

	// test
	@RequestMapping("query")
	public String query(@RequestParam(required = false) String interfacename, HttpServletRequest request, Model model) {
		ArrayList<MyInterface> list = new ArrayList<MyInterface>();
		System.out.println("");
		if (interfacename.equals("")) {
			return "wrong";
		} else {
			if (service.selectByName(interfacename) == null)
				return "wrong3";
			else {
				list.add(service.selectByName(interfacename));
				model.addAttribute("one_list", list);
				System.out.println();
				return "queryone";
			}
		}
	}

	public void say() {
		System.out.println("");
	}

	// 删锟斤拷
	@RequestMapping("del")
	public String delete(@RequestParam(required = false) String interface_id, HttpServletRequest request, Model model) {
		if (interface_id == null) {
			return "wrong2";
		} else {
			service.delete(interface_id);
			return "success";
		}
	}

	// 锟斤拷锟斤拷锟斤拷转
	@RequestMapping("jump")
	public String jump(@RequestParam(required = false) String interface_id, HttpServletRequest request, Model model) {
		if (interface_id == null) {
			return "wrong2";
		} else {
			ArrayList<MyInterface> list = new ArrayList<MyInterface>();
			list.add(service.selectById(interface_id));
			model.addAttribute("modify_list", list);
			return "modify";
		}
	}

	// 锟斤拷锟斤拷锟斤拷转
	@RequestMapping("jump_add")
	public String jump2(@RequestParam(required = false) String interface_id, HttpServletRequest request, Model model) {
		return "add";
	}

	// 锟斤拷锟斤拷
	@RequestMapping("add")
	public String add(MyInterface my, HttpServletRequest request, Model model) {
		String id = my.getId();// 锟斤拷锟斤拷id锟斤拷
		String name = my.getName();// 锟斤拷锟斤拷锟斤拷锟斤拷
		String requestMethod = my.getRequestMethod();// 锟斤拷锟斤拷锟斤拷锟斤拷模式
		String requestParameters = my.getRequestParameters();// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
		String responseParameter = my.getResponseParameter();// 锟斤拷锟斤拷锟斤拷应锟斤拷锟斤拷
		String classification = my.getClassification();// 锟斤拷锟斤拷锟斤拷锟�
		// 校锟介不锟斤拷为锟斤拷
		if (id.equals("") || name.equals("") || requestMethod.equals("") || requestParameters.equals("")
				|| responseParameter.equals("") || classification.equals("")) {
			return "wrong";
		} else {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 锟斤拷锟斤拷锟斤拷锟节革拷式
			my.setTime(df.format(new Date()).toString());
			service.insert(my);
			return "success";
		}
	}

	// 锟睫革拷
	@RequestMapping("modify_interface")
	public String modify_interface(MyInterface my, HttpServletRequest request, Model model) {
		String id = my.getId();// 锟斤拷锟斤拷id锟斤拷
		String name = my.getName();// 锟斤拷锟斤拷锟斤拷锟斤拷
		String requestMethod = my.getRequestMethod();// 锟斤拷锟斤拷锟斤拷锟斤拷模式
		String requestParameters = my.getRequestParameters();// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
		String responseParameter = my.getResponseParameter();// 锟斤拷锟斤拷锟斤拷应锟斤拷锟斤拷
		String classification = my.getClassification();// 锟斤拷锟斤拷锟斤拷锟�
		// 校锟介不锟斤拷为锟斤拷
		if (id.equals("") || name.equals("") || requestMethod.equals("") || requestParameters.equals("")
				|| responseParameter.equals("") || classification.equals("")) {
			return "wrong";
		} else {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 锟斤拷锟斤拷锟斤拷锟节革拷式
			my.setTime(df.format(new Date()).toString());
			service.updateById(my);
			return "success";
		}
	}

	// 锟斤拷询锟斤拷锟斤拷
	@RequestMapping(value = "queryAll")
	public String showCandida(@RequestParam(required = false) String candida, HttpServletRequest request, Model model) {
		ArrayList<MyInterface> list = (ArrayList<MyInterface>) service.selectAll();
		model.addAttribute("c_list", list);
		System.out.println("锟斤拷询锟缴癸拷");
		return "queryshow";
	}

	@RequestMapping(value = "back")
	public String back(@RequestParam(required = false) String candida, HttpServletRequest request, Model model) {
		return "success";
	}
}
