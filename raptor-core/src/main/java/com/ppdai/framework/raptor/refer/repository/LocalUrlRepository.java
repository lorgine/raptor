package com.ppdai.framework.raptor.refer.repository;

import com.ppdai.framework.raptor.rpc.URL;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalUrlRepository extends AbstractUrlRepository {
    private Map<String, URL> localRepository = new ConcurrentHashMap<>();

    @Override
    public String getUrlString(String urlKey) {
        return localRepository.get(urlKey).toFullStr();
    }

    @Override
    public URL getUrl(String key) {
        return localRepository.get(key);
    }

    public void put(String key, String url) {
        put(key, URL.valueOf(url));
    }

    public void put(String key, URL url) {
        localRepository.put(key, url);
    }
}
