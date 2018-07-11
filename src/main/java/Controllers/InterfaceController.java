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

import javax.servlet.http.HttpServletRequest;

@Controller
public class InterfaceController {
	@Autowired
	private InterfaceService service;

	// 根据名称查询
	@RequestMapping("query")
	public String query(@RequestParam(required = false) String interfacename, HttpServletRequest request, Model model) {
		ArrayList<MyInterface> list = new ArrayList<MyInterface>();
		if (interfacename.equals("")) {
			return "wrong";
		} else {
			if (service.selectByName(interfacename) == null)
				return "wrong3";
			else {
				list.add(service.selectByName(interfacename));
				model.addAttribute("one_list", list);
				return "queryone";
			}
		}
	}

	// 删除
	@RequestMapping("del")
	public String delete(@RequestParam(required = false) String interface_id, HttpServletRequest request, Model model) {
		if (interface_id == null) {
			return "wrong2";
		} else {
			service.delete(interface_id);
			return "success";
		}
	}

	// 更新跳转
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

	// 新增跳转
	@RequestMapping("jump_add")
	public String jump2(@RequestParam(required = false) String interface_id, HttpServletRequest request, Model model) {
		return "add";
	}

	// 新增
	@RequestMapping("add")
	public String add(MyInterface my, HttpServletRequest request, Model model) {
		String id = my.getId();// 保存id号
		String name = my.getName();// 保存名称
		String requestMethod = my.getRequestMethod();// 保存请求模式
		String requestParameters = my.getRequestParameters();// 保存请求参数
		String responseParameter = my.getResponseParameter();// 保存响应参数
		String classification = my.getClassification();// 保存分类
		//校验不能为空
		if (id.equals("") || name.equals("") || requestMethod.equals("") || requestParameters.equals("")
				|| responseParameter.equals("") || classification.equals("")) {
			return "wrong";
		} else {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
			my.setTime(df.format(new Date()).toString());
			service.insert(my);
			return "success";
		}
	}

	// 修改
	@RequestMapping("modify_interface")
	public String modify_interface(MyInterface my, HttpServletRequest request,
			Model model) {
		String id = my.getId();// 保存id号
		String name = my.getName();// 保存名称
		String requestMethod = my.getRequestMethod();// 保存请求模式
		String requestParameters = my.getRequestParameters();// 保存请求参数
		String responseParameter = my.getResponseParameter();// 保存响应参数
		String classification = my.getClassification();// 保存分类
		//校验不能为空
		if (id.equals("") || name.equals("") || requestMethod.equals("") || requestParameters.equals("")
				|| responseParameter.equals("") || classification.equals("")) {
			return "wrong";
		} else {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
			my.setTime(df.format(new Date()).toString());
			service.updateById(my);
			return "success";
		}
	}

	// 查询所有
	@RequestMapping(value = "queryAll")
	public String showCandida(@RequestParam(required = false) String candida, HttpServletRequest request, Model model) {
		ArrayList<MyInterface> list = (ArrayList<MyInterface>) service.selectAll();
		model.addAttribute("c_list", list);
		System.out.println("查询成功");
		return "queryshow";
	}

	@RequestMapping(value = "back")
	public String back(@RequestParam(required = false) String candida, HttpServletRequest request, Model model) {
		return "success";
	}
}
