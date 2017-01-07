package lab.io.rush.web;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lab.io.rush.model.MovieInfo;
import lab.io.rush.service.MovieInfoService;

@Controller
@RequestMapping("/moana")
public class MoanaController
{
	@Resource
	private MovieInfoService movieInfoService;
	private final Logger logger =LoggerFactory.getLogger(this.getClass());
	/**
	 * 获得电影列表信息
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/buy",method = RequestMethod.GET)
	public String list(Model model)
	{
		List<MovieInfo> buy=movieInfoService.queryMovieList();
		model.addAttribute("buy",buy);
		return "buy";
	}
	
}
