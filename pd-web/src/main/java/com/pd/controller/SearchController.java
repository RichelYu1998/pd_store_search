package com.pd.controller;

import com.pd.pojo.Item;
import com.pd.service.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SearchController {
    @Resource
    private SearchService searchService;
    @GetMapping("/search/toSearch.html")
    public String search(String key, Model model) throws Exception{
        List<Item> itemList  = searchService.findItemByKey(key);
        model.addAttribute("list",itemList);
        return "/search.jsp";
    }
}
