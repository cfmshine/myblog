package com.firmin.blog.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by ChenFumin on 2016-9-1.
 */
@Setter
@Getter
public class Blog extends Entity {
  private String blogTitle;
  private String blogSubTitle;
  private String author;
  private Date createTime;
  private Date updateTime;
  private Classify classify;
  private String content;
}
