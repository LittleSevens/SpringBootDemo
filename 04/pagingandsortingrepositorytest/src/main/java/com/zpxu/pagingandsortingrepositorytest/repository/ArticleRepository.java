package com.zpxu.pagingandsortingrepositorytest.repository;

import com.zpxu.pagingandsortingrepositorytest.bean.Article;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArticleRepository extends PagingAndSortingRepository<Article,Integer> {
}
