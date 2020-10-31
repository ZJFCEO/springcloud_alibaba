package com.fei.ad.search;

import com.fei.ad.search.vo.SearchRequest;
import com.fei.ad.search.vo.SearchResponse;

/**
 * Created by Qinyi.
 */
public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
