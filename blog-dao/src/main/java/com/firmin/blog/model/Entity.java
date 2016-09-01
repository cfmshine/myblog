package com.firmin.blog.model;

import com.firmin.blog.dto.Page;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by ChenFumin on 2016-9-1.
 */
@Setter
@Getter
public class Entity<T> extends Page<T> {
  private Integer id;
}
