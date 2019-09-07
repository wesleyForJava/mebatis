package com.wesley.mebatis;

public interface BlogMapper {
    /**
     * 根据主键查找文章
     * @param bid
     * @return
     */
    public Blog selectBlogById(Integer bid);

}
