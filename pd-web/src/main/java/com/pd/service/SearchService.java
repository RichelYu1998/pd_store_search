package com.pd.service;

import com.pd.pojo.Item;

import java.util.List;

public interface SearchService {
    List<Item> findItemByKey(String key) throws Exception;
}
