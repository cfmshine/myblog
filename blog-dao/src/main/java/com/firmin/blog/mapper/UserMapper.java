package com.firmin.blog.mapper;

import com.firmin.blog.dto.Page;
import com.firmin.blog.model.User;
import java.util.List;

/**
 * Created by ChenFumin on 2016-9-1.
 */
public interface UserMapper {
  List<User> queryByPage(Page<User> page);
}
