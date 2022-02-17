CREATE database spring_boot_demo;  -- 创建数据库
Use spring_boot_demo;   -- 选择数据库
ALTER database spring_boot_demo charset=utf-8;   -- 修改数据库编码格式
CREATE TABLE t_student(
  id    BIGINT          PRIMARY KEY AUTO_INCREMENT,
  username  VARCHAR(25)     UNIQUE,
  password VARCHAR(25)     NOT NULL,
  age   INT             DEFAULT  17,
  sex   VARCHAR(25)     NOT NULL
  );    -- 创建数据表