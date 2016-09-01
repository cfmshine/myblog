package com.firmin.blog.model;

import com.firmin.blog.dto.Page;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by ChenFumin on 2016-9-1.
 */
@Setter
@Getter
@ToString
public class User extends Entity {
  private String username;
  private int gender;
  private String email;
  private String password;
}
