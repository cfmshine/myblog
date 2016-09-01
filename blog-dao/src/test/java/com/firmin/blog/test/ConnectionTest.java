package com.firmin.blog.test;

import com.firmin.blog.dto.Page;
import com.firmin.blog.dto.UserDTO;
import com.firmin.blog.mapper.UserMapper;
import com.firmin.blog.model.User;
import java.util.List;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ChenFumin on 2016-9-1.
 */
@Slf4j
public class ConnectionTest {
  ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");

  @Test
  public void DataSourceTest() {
    SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
    System.out.println(sqlSessionFactory);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    UserDTO userDTO = new UserDTO();
    userDTO.setGender(1);
    List<User> users = userMapper.queryByPage(userDTO);
    System.out.println(users);
  }

}
