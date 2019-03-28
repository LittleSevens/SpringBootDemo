package com.zpxu.pagingandsortingrepositorytest.controller;

import com.zpxu.pagingandsortingrepositorytest.bean.Article;
import com.zpxu.pagingandsortingrepositorytest.service.ArticleService;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @RequestMapping("/sort")
    public Iterable<Article> sortArticle(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Iterable<Article> articleIterable = articleService.findAllSort(sort);
        return articleIterable;
    }

    @RequestMapping("/pager")
    public List<Article> sortPageArticle(int page){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable= PageRequest.of(page-1,2,sort);
        Page<Article> articles =articleService.findAll(pageable);
        System.out.println("查询的总页数:"+articles.getTotalPages());
        System.out.println("查询的总记录数:"+articles.getTotalElements());
        System.out.println("查询的当前页:"+articles.getNumber()+1);
        System.out.println("查询的当前页的记录数:"+articles.getNumberOfElements());
        List<Article> articleList = articles.getContent();
        System.out.println("查询当前页面的集合："+articleList);
        return articleList;
    }
}
